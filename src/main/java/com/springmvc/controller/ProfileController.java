package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.model.Profile;

@Controller
public class ProfileController {
	Profile profile;
	@GetMapping("/")
	public String homePage(Model model) {
		profile = new Profile();
		profile.setName("Lekshmi A L");
		model.addAttribute("profile", profile);
		return "Profile";
	}
	
	@GetMapping("/personal_details")
	public String personalPage(Model model) {
		profile.setAge(26);
		profile.setDob("28-05-1995");
		model.addAttribute("profile", profile);
		return "personalPage";
	}
	
	@GetMapping("/contact_details")
	public String ContactPage(Model model) {
		profile.setEmail("lek@gmail.com");
		profile.setMobNum(989600000);
		model.addAttribute("profile", profile);
		return "contactPage";
	}
	
	@GetMapping("/educational_details")
	public String EducationPage(Model model) {
		profile.setCollegeName("Marian");
		profile.setSchoolName("Arya");
		model.addAttribute("profile", profile);
		return "educationPage";
	}
	
	@GetMapping("/professional_details")
	public String professionPage(Model model) {
		profile.setCurrentCompanyName("UST");
		profile.setExCompanyNames("IBS");
		model.addAttribute("profile", profile);
		return "professionPage";
	}
}
