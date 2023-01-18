package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Billing;
import com.crm.repositories.BillingRepository;


@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public Billing generateInvoice(Billing billing) {
		Billing bill = billingRepo.save(billing);
		return bill;
		
	}

	@Override
	public List<Billing> getAllBill() {
		List<Billing> bill = billingRepo.findAll();
		return bill;
	}

}
