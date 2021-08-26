package main.repository;

import main.model.MembershipListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface MembershipListRepository extends JpaRepository<MembershipListEntity, Integer> {

	List<MembershipListEntity> findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByMembershipId(int fiscal_year, boolean renew, int memberType);

//	List<MembershipListEntity> findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByFName(int fiscal_year, boolean renew, int memberType);
//
//	List<MembershipListEntity> findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByLName(int fiscal_year, boolean renew, int memberType);
//
//	List<MembershipListEntity> findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByMemberType(int fiscal_year, boolean renew, int memberType);


}
