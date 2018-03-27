package com.springboot.login.login.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.login.login.LoginBean;

public interface LoginRepository extends JpaRepository<LoginBean,String>{
	
	
	 

}
