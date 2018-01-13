package hrs.database.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProjectEditDO {

    private Long id;

    private String name;

    private Long leaderCandidateId;

    public ProjectEditDO(Project project) {
        this.id = project.getId();
        this.name = project.getName();
        this.leaderCandidateId = project.getLeader().getEmployee().getId();
    }
}
