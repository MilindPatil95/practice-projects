package com.practice.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.google.common.base.Optional;
import com.practice.demo.model.User;
import com.practice.demo.repository.IMyRepository;

public class LoginUserDetailService implements UserDetailsService {

	@Autowired
	IMyRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		   System.out.println("inside :: loadUserByUsername");
		Optional<User> user=repo.findByUsername(username);
	     try
	     {
	    	 
	    	 user.get().getName();
	    	 System.out.println(" User detail ==============>>>>>>"+user.toString());
	    	 
	     }
	     catch(Exception e) 
	     {
	    	 System.out.println("User not found");
	     }
		   System.out.println("inside :: loadUserByUsername at end*************");
			
		return   user.get();
	}

}
