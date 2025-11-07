package com.Task1.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task1.Repository.InternshipRepo;
import com.Task1.entity.Internship;
import com.Task1.service.InternshipService;

@Service
public class InternshipServiceImpl implements InternshipService{

	@Autowired
	private InternshipRepo internshipRepo;
	
	@Override
	public List<Internship> getAll() {
		
		return internshipRepo.findAll();
	}

	@Override
	public Internship save(Internship internship) {
		return internshipRepo.save(internship);
	}

	@Override
	public List<Internship> getListByTitle(String title) {
		return internshipRepo.findByTitle(title);
	}

	@Override
	public List<Internship> getListByCompany(String company) {
		return internshipRepo.findByCompany(company);
	}

	@Override
	public List<Internship> getListByLocation(String location) {
		return internshipRepo.findByLocation(location);
	}

}
