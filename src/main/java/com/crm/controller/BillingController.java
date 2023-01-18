package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Billing;
import com.crm.entities.Contact;
import com.crm.service.BillingService;
import com.crm.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
	private ContactService contactService;
	
	
	
	@RequestMapping("/billingForm")
	public String viewCreatedbillingForm(@RequestParam("contactId") long id,Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
	return "create_bill";
		
	}
	
	@RequestMapping("/generatebill")
	public String generateBill(@ModelAttribute("billing") Billing billing,Model model) {
	 billingService.generateInvoice(billing);
	 List<Billing> bill = billingService.getAllBill();
	  model.addAttribute("bill", bill);
	  return "list_bill";
		
	}
	
	@RequestMapping("/listbill")
	public String listAllBills(Model model) {
	  List<Billing> bill = billingService.getAllBill();
	  model.addAttribute("bill", bill);
	  return "list_bill";
	}

}
