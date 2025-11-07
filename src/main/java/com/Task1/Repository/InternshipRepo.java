package com.Task1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task1.entity.Internship;

public interface InternshipRepo extends JpaRepository<Internship, Integer>{

	//filter by title
	List<Internship> findByTitle(String title);
	
	//filter by company
	List<Internship> findByCompany(String company);
	
	//filter by location
	List<Internship> findByLocation(String location);
}
