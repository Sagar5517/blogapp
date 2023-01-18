package com.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Lead;
import com.crm.repositories.LeadRepositroy;


@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepositroy leadRepo;

	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);

	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> id2 = leadRepo.findById(id);
		Lead lead = id2.get();
		
		return lead;
	}

	@Override
	public void deleteLead(long id) {
leadRepo.deleteById(id);		
	}

}
