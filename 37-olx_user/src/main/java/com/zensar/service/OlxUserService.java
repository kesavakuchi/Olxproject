package com.zensar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.OlxUser;
import com.zensar.db.OlxUserDAO;

@Service
public class OlxUserService {
	
	@Autowired
	OlxUserDAO dao;
	
	public OlxUser addOlxUser(OlxUser Olxuser) {
		return dao.save(Olxuser);
		
	}
	
	public OlxUser findByUserName(String username) {
		return this .dao.findByUserName(username);
		
	}
	
	public OlxUser findUserNameById(int id) {
		Optional<OlxUser> optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}

}
