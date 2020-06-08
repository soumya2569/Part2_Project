package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.main.entity.User;
import com.main.entity.ResponseMessage;
import com.main.service.UserService;


@RestController
public class LoginController {
	
	@Autowired
	UserService userser;
	
	@PostMapping("/login")
	public ResponseMessage LoginUser(@RequestBody User user) {
		ResponseMessage response=new ResponseMessage();
		response.setMessageCode("MSG1");
		response.setMessageDesc(userser.validateUser(user));
		return response;
	}
}
