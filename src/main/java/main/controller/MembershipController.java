package main.controller;

import java.util.List;

import main.dto.MembershipIdDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	

	@GetMapping("/membershipsjson")
	@ResponseBody
	public List<MembershipIdDTO> getMembership() {
		return membershipService.findMembershipIdEntityByFiscalYear(2021);
	}

	// @GetMapping("/membertype")
	// @ResponseBody
	// public List<Membership> getMembershipWithPrimary() {
	// 	return membershipService.findByMemberType(1);	
	// }
	
//	@GetMapping("/")
//	public String getHomePage(Model model) {
//		List<OfferDTO> offersDTO = membershipService.getAllDTO();
//		model.addAttribute("offersDTO", offersDTO);
//		return "index";
//	}
//	
//	@GetMapping("/addOffer")
//	public String showForm(Model model) {
//		Offer offer = new Offer();
//		model.addAttribute("offer", offer);
//		return "offer-form";
//	}
//	
//	@PostMapping("/processForm")
//	public String processOffer(@ModelAttribute Offer offer) {
//		membershipService.saveOrUpdate(offer);
//		return "redirect:/";
//	}
//	
//	@GetMapping("/deleteOffer/{id}")
//	public String deleteOffer(@PathVariable int id) {
//		if (id > 0) {
//			Offer offer = membershipService.getById(id);
//			if(offer != null) {
//				membershipService.delete(id);
//			}
//		}
//		return "redirect:/";
//	}
//	
//	@GetMapping("/editOffer/{id}")
//	public String editOfferString(@PathVariable int id, Model model) {
//		if(id > 0) {
//			Offer offer = membershipService.getById(id);
//			if(offer != null) {
//				model.addAttribute("offer", offer);
//				return "offer-form";
//			}
//		}
//		return "redirect:/";
//	}

}
