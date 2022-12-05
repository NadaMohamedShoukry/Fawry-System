package FawrySystem;

public class User {
	String userName;
	String password;
	String email;
	Payment payObj;
	
	public User(String userName , String password , String email)
	{
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	Services serv = new Services();
	LogIn log;
}
