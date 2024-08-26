package com.syedrizwan.AuthAdmin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syedrizwan.AuthAdmin.Dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	
	public User findByEmail(String Email);
	

}
