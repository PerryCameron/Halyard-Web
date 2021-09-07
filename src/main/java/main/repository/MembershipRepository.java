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

	MembershipEntity findMembershipEntityByMsId(int ms_id);

	List<MembershipEntity> findMembershipsByCity(@Param("city") String city);

}
