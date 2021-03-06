package main.controller;

import java.util.List;

import main.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import main.dto.PersonDTO;
import main.service.PersonService;

@Controller
public class PeopleController {
	
	@Autowired
	private PersonService peopleService;
	
	@GetMapping("/person")
	public String getHomePage(Model model) {
		List<PersonDTO> personDTO = peopleService.getAllDTO();
		model.addAttribute("peopleDTO", personDTO);  // creates the name you can use in your view
		return "people";
	}
	
	@GetMapping("/person/{ms_id}")
	public String getHomePage(Model model, @PathVariable int ms_id) {
		List<PersonDTO> personDTO = peopleService.getSelectDTO(ms_id);
		model.addAttribute("peopleDTO", personDTO);  // creates the name you can use in your view
		return "people";
	}

	@GetMapping("/peoplejson")
	@ResponseBody

	public List<PersonEntity> getPeople() {
		return peopleService.getAll();	
	}

	// @GetMapping("/people/primary/{type}")
	// @ResponseBody
	// public List<Person> getPrimaryMember(@PathVariable int type) {
	// 	return peopleService.getPrimaryMember(type);	
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
