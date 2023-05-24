package ms.myspring.repository;

import ms.myspring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // JPOL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
