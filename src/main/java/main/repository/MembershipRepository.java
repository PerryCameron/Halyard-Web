package main.repository;

import java.util.List;

import javax.transaction.Transactional;

import main.model.MembershipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface MembershipRepository extends JpaRepository<MembershipEntity, Integer> {


	// example of a native query which works
	//@Query(value = "Select m.MS_ID,m.P_ID,m.JOIN_DATE,p.L_NAME,p.F_NAME,m.address,m.city,m.state,m.zip from membership m left join m.person p on p.MS_ID=m.MS_ID;", nativeQuery = true)
	List<MembershipEntity> findMembershipsByCity(@Param("city") String city);

//	@Query("from MembershipEntity m left join PersonEntity p on m.msId=p. where p.memberType=1")
//	List<MembershipEntity> findMembershipsByPersonMember_type(int member_type);

}
