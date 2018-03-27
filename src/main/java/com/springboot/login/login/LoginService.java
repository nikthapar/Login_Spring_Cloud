package com.springboot.login.login;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	List<LoginBean> list = new ArrayList<>(
			Arrays.asList(new LoginBean("nik","123"),
					new LoginBean("nik","1234")
					));

	public String getCheck(String username , String password) {
		for(int i=0;i<list.size();i++) {
			if(username .equals(list.get(i).getUsername()) && password.equals(list.get(i).getPassword())) {
				return "1";
			}
		}
		return "0";
	}
	
	

}
