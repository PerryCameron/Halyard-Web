package main.repository;

import main.model.MembershipIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface MembershipIdRepository extends JpaRepository<MembershipIdEntity, Integer> {

@Query("select m FROM MembershipIdEntity m where m.fiscalYear=?1")
List<MembershipIdEntity> findMembershipIdEntityByFiscalYear(int fiscalYear);


}
