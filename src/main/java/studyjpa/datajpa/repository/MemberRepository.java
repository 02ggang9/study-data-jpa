package studyjpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studyjpa.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
