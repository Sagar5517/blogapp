package com.crm.service;

import java.util.List;

import com.crm.entities.Contact;

public interface ContactService {
	
	public void saveOneContact(Contact contact);

	public List<Contact> getAllContact();

	public Contact getContactById(long id);

}
