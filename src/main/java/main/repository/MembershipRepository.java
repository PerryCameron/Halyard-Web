package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Membership;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, Integer> {

}
