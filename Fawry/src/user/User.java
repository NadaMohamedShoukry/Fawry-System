package user;

import payment.Payment;
import services.Services;

public class User {
	String userName;
	String password;
	String email;
	Payment payObj;
	
//	public User(String userName , String password , String email)
//	{
//		this.userName = userName;
//		this.password = password;
//		this.email = email;
//	}
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
	Services serv = new Services();
	LogIn log;
}
