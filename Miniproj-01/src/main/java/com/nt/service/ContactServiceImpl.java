package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.ContactRepository;
import com.nt.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
private ContactRepository repo;
	@Override
	public String saveContact(Contact contact) {
		contact=repo.save(contact);
		if(contact.getContactid()!=null)
			return"contact saved sucessfully";
		else
			return"failed to save";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactid) {
	Optional<Contact> findById	=repo.findById(contactid);
	if(findById.isPresent()) {
		return findById.get();
	}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
	if( 	repo.existsById(contact.getContactid())){
	repo.save(contact);
		return "update sucessfully";
	}
	else {
		return " no record found";
	}
	}

	@Override
	public String deleteContact(Integer contactid) {
		if(repo.existsById(contactid)) {
			repo.deleteById(contactid);
			return"record deleted";
		}
		return "record not found";
	}

}
