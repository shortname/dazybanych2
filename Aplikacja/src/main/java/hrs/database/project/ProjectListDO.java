package hrs.database.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProjectListDO {

    private Long id;

    private String name;

    private String leader;

    private Long size;

    public ProjectListDO(Long id, String name, String leaderName, String leaderSurname, Long size) {
        this.id = id;
        this.name = name;
        this.leader = leaderName + ' ' + leaderSurname;
        this.size = size;
    }
}
