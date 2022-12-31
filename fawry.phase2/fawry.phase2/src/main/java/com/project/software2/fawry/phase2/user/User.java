package com.project.software2.fawry.phase2.user;


import org.springframework.stereotype.Service;

import com.project.software2.fawry.phase2.payment.*;
import com.project.software2.fawry.phase2.services.*;

@Service
public class User {
	String userName;
	String password;
	String email;
	Payment payObj;
	
	public void setName(String userName) {
		this.userName=userName;
	}
	public void setPass(String password) {
		this.password=password;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getName() {
		return userName;
	}
	public String getpassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return userName + "::" + email ;
	}
	Services serv = new Services();
	LogIn log;
}

