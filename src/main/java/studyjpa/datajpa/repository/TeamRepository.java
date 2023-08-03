package studyjpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studyjpa.datajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
