package FawrySystem;

import java.util.Scanner;

public class SignIn implements LogIn{
	@Override
	public void login(User user)
	{
		boolean flag=false;
		System.out.println("Username:");
		Scanner input = new Scanner(System.in);
		if(input.next()==user.userName)
		{
			flag=true;
		}
		else
		{
			System.out.println("Incorrect Username");
		}
		System.out.println("Password:");
		input = new Scanner(System.in);
		if(input.next()==user.password && flag==true)
		{
			flag=true;
		}
		else
		{
			System.out.println("Incorrect Password");
		}
		if(flag)
		{
			System.out.println("Successful LogIn");
		}
		else
		{
			System.out.println("UnSuccessful LogIn");
		}
	}
}
