package fawry;

import java.util.Scanner;

public class SignIn implements LogIn{
	Scanner obj = new Scanner(System.in);
	@Override
	public void login(User user)
	{
		System.out.println("Username:");
		obj = new Scanner(System.in);
		for(int i=0;i<UserDB.database.size();i++)
		{
			if(UserDB.database.get(i).userName == obj.next())
			{
				System.out.println("Password:");
				obj = new Scanner(System.in);
				if(UserDB.database.get(i).password == obj.next())
				{
					System.out.println("Successful Login");
					return;
				}
			}
		}
		System.out.println("Couldn't login");
	}

}
