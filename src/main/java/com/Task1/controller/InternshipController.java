package com.Task1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Task1.entity.Internship;
import com.Task1.service.InternshipService;

@RestController
@RequestMapping("/internships")
public class InternshipController {

	@Autowired
	private InternshipService internshipService;
	
	@GetMapping
	public List<Internship> getAllInternships(){
		return internshipService.getAll();
	}
	
	@PostMapping("/save")
	public String saveInternship(@RequestBody Internship internship) {
		internshipService.save(internship);
		return "Internship Saved Successfully!!";
	}
	
	@GetMapping("/title")
	public List<Internship> getByTitle(@RequestParam String title){
		return internshipService.getListByTitle(title);
	}
	
	@GetMapping("/company")
	public List<Internship> getByCompany(@RequestParam String company){
		return internshipService.getListByCompany(company);
	}
	
	@GetMapping("/location")
	public List<Internship> getByLocation(@RequestParam String location){
		return internshipService.getListByLocation(location);
	}
}
