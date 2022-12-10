package com.nt.service;

import java.util.List;

import com.nt.entity.Contact;

public interface ContactService {
	public String saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public   Contact getContactById(Integer contactid);
	public String updateContact(Contact contact);
	public String deleteContact(Integer contactid);
	

}
