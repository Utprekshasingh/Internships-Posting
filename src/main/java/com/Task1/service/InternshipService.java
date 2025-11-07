package com.Task1.service;

import java.util.List;

import com.Task1.entity.Internship;

public interface InternshipService {

	List<Internship> getAll();
	
	Internship save(Internship internship);
	
	List<Internship> getListByTitle(String title);
	
	List<Internship> getListByCompany(String company);
	
	List<Internship> getListByLocation(String location);
}
