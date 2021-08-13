package main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Membership;

@Repository
@Transactional
public interface MembershipRepository extends JpaRepository<Membership, Integer> {
	

}
