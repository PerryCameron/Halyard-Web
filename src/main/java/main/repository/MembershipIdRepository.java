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

List<MembershipIdEntity> findMembershipIdEntityByMembershipByMsId_MsId(int ms_id);

}
