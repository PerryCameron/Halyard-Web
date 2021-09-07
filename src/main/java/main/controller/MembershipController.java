package main.controller;

import java.util.List;

import main.dto.MembershipIdDTO;
import main.dto.MembershipListDTO;
import main.service.TestRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import main.dto.MembershipDTO;
import main.service.MembershipService;

@Controller
public class MembershipController {
	
	@Autowired
	private MembershipService membershipService;

	private TestRepositoryImpl testRepository;



//	@GetMapping("/")
//	public String getHomePage(Model model) {
//		List<MembershipDTO> membershipDTO = membershipService.getAllDTO();
//		model.addAttribute("membershipDTO", membershipDTO);  // creates the name you can use in your view
//		return "index";
//	}

	@GetMapping("test")
	@ResponseBody
	public List<Object[]> getTest() {
		List<Object[]> test = testRepository.methodThatTestsDTO();
		return test;
	}

	@GetMapping("lists")
	public String findMembershipListEntity(Model model, @RequestParam int year, @RequestParam String rb, @RequestParam String sort) {
		List<MembershipListDTO> membershipListDTO = membershipService.findMembershipList(year, rb, 1, sort);
		model.addAttribute("membershipListDTO", membershipListDTO);
		return "lists";
	}

	@GetMapping("/")
	public String returnIndex() {
		return "index";
	}

	/// creates membership view
	@GetMapping("membership")
	public String findMembership(Model model, @RequestParam int year, @RequestParam int ms_id) {
		List<MembershipIdDTO> membershipIdDTO = membershipService.findMembershipId(year,ms_id);
		MembershipIdDTO selectedMembershipId = membershipService.findIdByYear(year, membershipIdDTO);
		MembershipDTO membershipDTO = membershipService.findMembership(ms_id);
		//model.addAttribute("membershipIdDTO", membershipIdDTO);
		System.out.println(selectedMembershipId);
		model.addAttribute("selectedMembershipId", selectedMembershipId);
		model.addAttribute("membership", membershipDTO);
		return "membership";
	}

	// for testing params
	@GetMapping("/membershiplistjson")
	@ResponseBody
	public List<MembershipListDTO> getMembershipList() {
		List<MembershipListDTO>	theList = membershipService.findMembershipList(2021, "option1", 1, "byId");
		System.out.println(theList.size());
	return theList;
	}
}
