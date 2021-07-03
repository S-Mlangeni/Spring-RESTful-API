package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entity.OurEntity;
import com.backend.repository.OurRepository;
import com.backend.search.OurSearch;

@Service /*Declares this class as a service which connects the rest controller 
with the repository */
public class OurService {
	
	@Autowired //Links the one class with the current class
	OurRepository repo;
	
	public OurEntity serve(OurEntity userdata) {
		return repo.save(userdata); /* Note that the save method is one of the
		default methods provided by the JPA repository extension, hence doesn't
		have to be explicitly specified in the repository interface. Since these
		default methods are limited, additional methods will have to defined
		explicitly in the interface. */
	}
	
	public Boolean searchingdb(OurSearch submitteddata) {
		String submittedemail = submitteddata.getEmail();
		String submittedpassword = submitteddata.getPassword();
		OurEntity emailFoundObject = repo.findByEmail(submittedemail);
		if (emailFoundObject!=null && submittedpassword.equals(emailFoundObject.getPassword())) {
			return true;
		} else {
			return false;
		}
		
		
	} 
}
