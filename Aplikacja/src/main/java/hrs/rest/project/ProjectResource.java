package hrs.rest.project;

import hrs.database.city.City;
import hrs.database.project.Project;
import hrs.database.project.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProjectResource {

    @Autowired
    private ProjectRepo projectRepo;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Project> getCities(){
        return projectRepo.findAll();
    }

}
