package hrs.database.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project, Long> {

    @Query("select new hrs.database.project.ProjectListDO(p.id, p.name, p.leader.employee.personalData.name, p.leader.employee.personalData.surname, count(e)) from Project p left join p.employees as e group by p.id, p.name")
    List<ProjectListDO> findProjects();

}
