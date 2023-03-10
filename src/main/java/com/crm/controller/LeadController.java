package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.service.ContactService;
import com.crm.service.LeadService;



@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value = "/create" , method=RequestMethod.GET)
	public String ViewCreatedLeadForm() {
		return "create_lead";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "create_lead";
	}
	@RequestMapping("/save")
	public String saveCreatedLead(@ModelAttribute("lead") Lead lead,Model  model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "Lead is Saved!!");
		return "lead_info";
		
}
	
	@RequestMapping("/listall")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
		
	}
	@RequestMapping("/leadinfo")
	public String getLeasById(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertlead")
	public String convertToContact(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveOneContact(contact);
		
		leadService.deleteLead(id);
		
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
		
		
	}
}
