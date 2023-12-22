package org.dnyanyog.controller;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.services.AddUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	
	@Autowired
	AddUserServices AddUserService;
	
	@PostMapping(
			path="/api/auth/add-user",consumes= {"application/json","application/xml"},produces = {"application/json","application/xml"})
			
			public AddUserResponse validate(@RequestBody AddUserRequest AddUserRequest) {
		return AddUserService.adduser(AddUserRequest);
		
	}
}
