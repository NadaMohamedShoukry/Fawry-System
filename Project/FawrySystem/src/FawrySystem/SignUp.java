package FawrySystem;

import java.util.Scanner;

public class SignUp implements LogIn{
	SignIn s = new SignIn();
	Scanner obj = new Scanner(System.in);
	
	@Override
	public void login(User user)
	{
		System.out.println("Enter Username:");
		user.userName=obj.next();
		System.out.println("Enter Email:");
		obj = new Scanner(System.in);
		user.email=obj.next();
		System.out.println("Enter Password:");
		obj = new Scanner(System.in);
		user.password=obj.next();
		for(int i=0;i<UserDB.database.size();i++)
		{
			if(UserDB.database.get(i)==user)
			{
				System.out.println("Account already exists");
				System.out.println("Please Sign in");
				s.login(user);
				break;
			}
		}
		UserDB.database.add(user);
		
		System.out.println("User Signed Up Successfuly");
	}
}