package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entities.Contact;
import com.crm.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping("/listcontacts")
	public String listAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
		
	}
}
