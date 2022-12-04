package FawrySystem;

import java.util.Scanner;

public class SignUp implements LogIn{
	@Override
	public void login(User user)
	{
		System.out.println("Enter Username:");
		Scanner obj = new Scanner(System.in);
		user.userName=obj.next();
		System.out.println("Enter Email:");
		obj = new Scanner(System.in);
		user.email=obj.next();
		System.out.println("Enter Password:");
		obj = new Scanner(System.in);
		user.password=obj.next();
		System.out.println("User Signed Up Successfuly");
	}
}