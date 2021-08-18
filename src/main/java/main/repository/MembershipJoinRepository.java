package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Membership;

@Repository
public interface MembershipJoinRepository extends JpaRepository<Membership, Integer> {
	
	// @Query(value = "select m.ms_id, m.p_id, m.join_date, m.mem_type, m.address, m.city, m.state, "
	// 		+ "m.zip, p.l_name, p.f_name from membership m left join person p on p.ms_id=m.ms_id "
	// 		+ "where p.MEMBER_TYPE=1;", nativeQuery = true)
	// List<MembershipJoinDTO> findAllJoins();
	

}

//Select m.MS_ID,m.P_ID,id.MEMBERSHIP_ID,id.FISCAL_YEAR,id.FISCAL_YEAR,m.JOIN_DATE,id.MEM_TYPE,s.SLIP_NUM,p.L_NAME,p.F_NAME,s.SUBLEASED_TO,m.address,m.city,m.state,m.zip "
//		+ "from slip s "
//		+ "right join membership m on m.MS_ID=s.MS_ID "
//		+ "left join membership_id id on m.MS_ID=id.MS_ID "
//		+ "left join person p on p.MS_ID=m.MS_ID "
//		+ "where id.FISCAL_YEAR='" + year + "' and p.MEMBER_TYPE=1 and id.RENEW=" + isActive + " order by membership_id