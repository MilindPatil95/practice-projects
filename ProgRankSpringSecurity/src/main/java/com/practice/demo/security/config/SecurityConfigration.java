package com.practice.demo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.practice.demo.service.LoginUserDetailService;

@Configuration
public class SecurityConfigration {

	@Bean
	public UserDetailsService userDetailsService()
	{
		return new LoginUserDetailService();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() 
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
}
