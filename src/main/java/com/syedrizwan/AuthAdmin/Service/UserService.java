package com.syedrizwan.AuthAdmin.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syedrizwan.AuthAdmin.Dao.UserDao;
import com.syedrizwan.AuthAdmin.Dto.User;
import com.syedrizwan.AuthAdmin.util.ResponseStructure;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	
	public ResponseEntity<ResponseStructure<User>> saveUser(User user){
		
		ResponseStructure<User> structure = new ResponseStructure<User>();
		structure.setData(userdao.saveUser(user));
		structure.setMessage("User Saved Succefully");
		structure.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<User>>(structure,HttpStatus.CREATED);
		
	}
	

}
