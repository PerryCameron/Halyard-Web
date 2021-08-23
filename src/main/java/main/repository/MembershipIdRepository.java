package main.repository;

import main.model.MembershipIdEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface MembershipIdRepository extends JpaRepository<MembershipIdEntity, Integer> {

@Query("select m FROM MembershipIdEntity m where m.fiscalYear=?1 and m.renew=?2 order by m.membershipId")
List<MembershipIdEntity> findMembershipIdEntityByFiscalYear(int fiscalYear, boolean renew);

@Query("select m FROM MembershipIdEntity m where m.fiscalYear=?1 and m.renew=?2 order by m.membershipByMsId.city")
List<MembershipIdEntity> findMembershipIdEntityByFiscalYearOByCity(int fiscalYear, boolean renew);

}
