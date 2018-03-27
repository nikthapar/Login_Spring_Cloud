package com.springboot.login.login;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.login.login.Jpa.LoginRepository;

@RestController
public class LoginController {
	
	@Autowired
	private LoginRepository obj;
	

	
	@GetMapping("/login/username/{username}/password/{password}")
	public String CheckLogin(@PathVariable String username , @PathVariable String password) {
		Optional<LoginBean> temp = null;
		temp = obj.findById(username);
		//cout<<temp.get().getPassword();
		if(temp.isPresent())
			return "Success";
		else
			throw new UserNotFoundException("Username "+username);
	}
	//sign
	@PostMapping("/sign")
	public String NewUser(@RequestBody LoginBean signbean) {
		List<LoginBean> list = obj.findAll();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUsername().equals(signbean.getUsername()) && 
					list.get(i).getPassword().equals(signbean.getPassword())) {
				flag=1;
				break;
			}
		}
		if(flag == 0) {  
			obj.save(signbean);
			return "New USer";
		}
		else
			throw new UserNotFoundException("User ALredy Exits");
	}
}	

