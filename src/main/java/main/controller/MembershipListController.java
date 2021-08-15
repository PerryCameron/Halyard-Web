package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import main.repository.MembershipRepository;
import main.repository.PersonRepository;

@RestController
public class MembershipListController {
	
	@Autowired
	private MembershipRepository membershipRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
	

}
