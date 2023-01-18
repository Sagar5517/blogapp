package com.crm.service;

import java.util.List;

import com.crm.entities.Billing;

public interface BillingService {
	
	public Billing generateInvoice(Billing billing);

	public List<Billing> getAllBill();

}
