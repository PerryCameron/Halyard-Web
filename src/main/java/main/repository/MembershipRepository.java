package main.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import main.model.Membership;

@Repository
@Transactional
public interface MembershipRepository extends JpaRepository<Membership, Integer> {


	// example of a native query which works
	@Query(value = "Select m.MS_ID,m.P_ID,m.JOIN_DATE,p.L_NAME,p.F_NAME,m.address,m.city,m.state,m.zip from membership m left join m.person p on p.MS_ID=m.MS_ID;", nativeQuery = true)
	List<Membership> findMembershipsByCity(@Param("city") String city);
	// this does not work, but is here to show a native query
	// @Query("select m.msid,m.pid,m.joinDate,p.lastName,p.firstName,m.address,m.city,m.state,m.zip from membership m left join person p on p.msid=m.msid")
	// List<Membership> findMembershipsWithPeople();
	// this is something I need to figure out, where do you put it?  in a repository
	//  TypedQuery<MembershipListDTO> q =  this..createQuery(
    //      "SELECT new MembershipListDTO(m.msid,m.pid,m.joinDate,m.address,m.city,m.state,m.zip, concat(p.firstName, ' ', p.lastName)) FROM Membership m JOIN m.Person p WHERE p.memberType = 1",
    //      MembershipListDTO.class);
	//  	q.setParameter("title", "%Hibernate Tips%");
	//  	List<MembershipListDTO> membershipList = q.getResultList();




}

//Select m.MS_ID,m.P_ID,id.MEMBERSHIP_ID,id.FISCAL_YEAR,id.FISCAL_YEAR,m.JOIN_DATE,id.MEM_TYPE,s.SLIP_NUM,p.L_NAME,p.F_NAME,s.SUBLEASED_TO,m.address,m.city,m.state,m.zip "
//		+ "from slip s "
//		+ "right join membership m on m.MS_ID=s.MS_ID "
//		+ "left join membership_id id on m.MS_ID=id.MS_ID "
//		+ "left join person p on p.MS_ID=m.MS_ID "
//		+ "where id.FISCAL_YEAR='" + year + "' and p.MEMBER_TYPE=1 and id.RENEW=" + isActive + " order by membership_id