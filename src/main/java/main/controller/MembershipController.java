package main.controller;

import java.util.List;

import main.dto.MembershipIdDTO;
import main.dto.MembershipListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import main.dto.MembershipDTO;
import main.service.MembershipService;

@Controller
public class MembershipController {
	
	@Autowired
	private MembershipService membershipService;



	@GetMapping("/")
	public String getHomePage(Model model) {
		List<MembershipDTO> membershipDTO = membershipService.getAllDTO();
		model.addAttribute("membershipDTO", membershipDTO);  // creates the name you can use in your view
		return "index";
	}
	
	@GetMapping("/bycity/{city}")
	public String getMembershipByCity(Model model, @PathVariable String city) {
		List<MembershipDTO> membershipDTO = membershipService.findMembershipsByCity(city);
		model.addAttribute("membershipDTO", membershipDTO);  // creates the name you can use in your view
		return "index";
	}

	@GetMapping("membership/all/{year}")
	public String getAllMembershipsByYear(Model model, @PathVariable int year) {
		List<MembershipIdDTO> membershipIdDTO = membershipService.findMembershipIdEntityByFiscalYear(year, true,"memberhsipid");
		model.addAttribute("membershipIdDTO", membershipIdDTO);
		return "memberships";
	}

//	@GetMapping("membership")
//	public String getAllMembershipsByYearSorted(Model model, @RequestParam int year, @RequestParam boolean renew, @RequestParam String sort) {
//		List<MembershipIdDTO> membershipIdDTO = membershipService.findMembershipIdEntityByFiscalYear(year, renew, sort);
//		model.addAttribute("membershipIdDTO", membershipIdDTO);
//		return "memberships";
//	}

	@GetMapping("membership")
	public String findMembershipListEntity(Model model, @RequestParam int year, @RequestParam boolean renew) {
		List<MembershipListDTO> membershipListDTO = membershipService.findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByMembershipId(year, renew, 1);
		model.addAttribute("membershipListDTO", membershipListDTO);
		return "memberships";
	}

	@GetMapping("/membershiplistjson")
	@ResponseBody
	public List<MembershipListDTO> getMembershipList() {
		List<MembershipListDTO>	theList = membershipService.findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByMembershipId(2021, true, 1);
		System.out.println(theList.size());
	return theList;

	}

	@GetMapping("/membershipidjson")
	@ResponseBody
	public List<MembershipIdDTO> getMembershipId() {
		return membershipService.findMembershipIdEntityByFiscalYear(2021, true,"membershipid");
	}

	@GetMapping("/membershipjson")
	@ResponseBody
	public List<MembershipDTO> getMembership() {
		return membershipService.getAllDTO();
	}

	


}
