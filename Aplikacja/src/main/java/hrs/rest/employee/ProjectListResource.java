package hrs.rest.employee;

import hrs.database.project.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/project")
public class ProjectListResource {

    @Autowired
    private ProjectRepo projectRepo;

    @RequestMapping
    public String findProjects(Model model) {
        model.addAttribute("projects", projectRepo.findProjects());
        return "project-list";
    }

    @RequestMapping("/remove")
    public String removeProject(@RequestParam("id") Long id){
        projectRepo.delete(id);
        return "redirect:/project";
    }


}
