package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Contact;
import com.nt.service.ContactService;


@RestController
public class ContactRestController {
	@Autowired
	private ContactService service;
	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {
		String status=service.saveContact(null);
		return status;
	}
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		return service.getAllContacts();
	}
	@GetMapping("/contact/{contactid}")
	public Contact getContactById(@PathVariable Integer contactid) {
		return service.getContactById(contactid);
	}
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
	}
	@GetMapping("/contact")
	public String deleteContact(@PathVariable Integer contactid) {
       return service.deleteContact(contactid);
}
}