package hrs.database.project;

import hrs.database.employee.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Leader {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @OneToOne(optional = false)
    private Employee employee;

}
