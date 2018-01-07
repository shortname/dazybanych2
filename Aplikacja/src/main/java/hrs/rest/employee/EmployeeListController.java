package hrs.rest.employee;

import hrs.database.employee.Employee;
import hrs.database.employee.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/employee")
public class EmployeeListController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping()
    public String filteredPatientList(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "address", required = false) String address,
            Model model
    ){
        model.addAttribute("employees", employeeRepo.findAll());
        return "employee-list";
    }

}
