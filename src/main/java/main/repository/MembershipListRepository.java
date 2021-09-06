package main.repository;

import main.model.MembershipListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;


@Repository
@Transactional
public interface MembershipListRepository extends JpaRepository<MembershipListEntity, Integer> {

	List<MembershipListEntity> findMembershipListEntityByFiscalYearAndRenewAndMemberType(int fiscal_year, boolean renew, int memberType);

	List<MembershipListEntity> findMembershipListEntityByFiscalYearAndMemberType(int fiscal_year, int memberType);

//	@Query("from MembershipListEntity m where m.joinDate between ?1 and ?2")
	@Query(value="SELECT id.MS_ID, m.JOIN_DATE, p.F_NAME FROM membership_id id inner join membership m on id.MS_ID=id.MEMBERSHIP_ID inner join person p on m.MS_ID=p.MS_ID", nativeQuery = true)
	List<Object[]> queryMultipleTables();
}
