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
}
