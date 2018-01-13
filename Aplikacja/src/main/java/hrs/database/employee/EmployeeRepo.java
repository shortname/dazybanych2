package hrs.database.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    @Query("select new hrs.database.employee.LeaderCandidateDO(e.id, e.personalData.name, e.personalData.surname) from Employee e")
    List<LeaderCandidateDO> findLeaderCandidates();

}
