package hrs.rest.employee;

import hrs.database.employee.Employee;
import hrs.database.employee.LeaderCandidateDO;
import hrs.database.employee.EmployeeRepo;
import hrs.database.project.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/project")
public class ProjectEditController {

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private LeaderRepo leaderRepo;

    @RequestMapping("/edit")
    public String openProject(@RequestParam("id") Long id, Model model) {
        ProjectEditDO project = new ProjectEditDO(projectRepo.findOne(id));
        model.addAttribute("project", project);
        List<LeaderCandidateDO> leaderCandidates = employeeRepo.findLeaderCandidates();
        model.addAttribute("employees", leaderCandidates);
        model.addAttribute("activity", "Edytuj projekt");
        return "project-edit";
    }

    @RequestMapping("/create")
    public String createProject(Model model) {
        ProjectEditDO project = new ProjectEditDO();
        model.addAttribute("project", project);
        List<LeaderCandidateDO> leaderCandidates = employeeRepo.findLeaderCandidates();
        model.addAttribute("employees", leaderCandidates);
        model.addAttribute("activity", "Stwórz projekt");
        return "project-edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("project") ProjectEditDO projectData) {
        Project project = Optional.ofNullable(projectData.getId()).map(projectRepo::findOne).orElse(new Project());
        project.setName(projectData.getName());
        if (project.getLeader() == null){
            project.setLeader(createLeader(projectData));
            project.setEmployees(new ArrayList<>());
            projectRepo.save(project);
        } else if (project.getLeader().getEmployee().getId() != projectData.getLeaderCandidateId()) {
            Leader formerLeader = project.getLeader();
            project.setLeader(createLeader(projectData));
            projectRepo.save(project);
            leaderRepo.delete(formerLeader);
        } else {
            projectRepo.save(project);
        }
        return "redirect:/project";
    }

    private Leader createLeader(@ModelAttribute("project") ProjectEditDO projectData) {
        Employee chosenLeader = employeeRepo.findOne(projectData.getLeaderCandidateId());
        return leaderRepo.save(new Leader(chosenLeader));
    }

}
