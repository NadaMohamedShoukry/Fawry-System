package user;


import fawry.UserDB;

public class SignUp implements LogIn{
	SignIn s = new SignIn();
	
	@Override
	public void login(User user)
	{
		
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
