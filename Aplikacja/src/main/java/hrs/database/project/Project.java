package hrs.database.project;

import hrs.database.employee.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Getter
@Setter
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @ManyToOne
    @JoinColumn
    private Leader leader;

    @NotNull
    @ManyToMany
    @JoinTable(name = "project_employee", joinColumns = {
            @JoinColumn(name = "project_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "employee_id")
    })
    private Collection<Employee> employees;

}
