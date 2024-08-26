package com.syedrizwan.AuthAdmin.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.syedrizwan.AuthAdmin.Dto.User;
import com.syedrizwan.AuthAdmin.Repo.UserRepo;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

}
