package hrs.database.employee;

import hrs.database.department.Department;
import hrs.database.project.Project;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @OneToOne(optional = false)
    private PersonalData personalData;

    @NotNull
    @OneToOne(optional = false)
    private Salary salary;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn
    private Department department;
}
