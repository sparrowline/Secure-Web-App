package com.syedrizwan.AuthAdmin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.syedrizwan.AuthAdmin.Dto.User;
import com.syedrizwan.AuthAdmin.Service.UserService;
import com.syedrizwan.AuthAdmin.util.ResponseStructure;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("v1/user/register")
	private ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return service.saveUser(user);
	}
	

}
