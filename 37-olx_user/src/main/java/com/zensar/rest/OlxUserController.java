package com.zensar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.OlxUser;
import com.zensar.service.OlxUserService;

@RestController
public class OlxUserController {
	
	@Autowired
	OlxUserService service;
	
	@PostMapping(value = "/add")
	public OlxUser f1(@RequestBody  OlxUser OlxUser) {
		return this.service.addOlxUser(OlxUser);
		
	}
	
	@GetMapping(value="/getUserById/{userId}")
	public OlxUser f2(@PathVariable(name="userID") int id) {
		return this.service.findUserNameById(id);
		
	}
	
	@GetMapping(value = "/getUserName/{userName}")
	public OlxUser f3(@PathVariable(name="username") String userName) {
		return this.service.findByUserName(userName);
	}

}
