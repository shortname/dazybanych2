package hrs.database.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LeaderCandidateDO {

    private Long id;

    private String name;

    public LeaderCandidateDO(Long id, String name, String surname) {
        this.id = id;
        this.name = name + ' ' + surname;
    }
}
