package user;


import fawry.UserDB;

public class SignIn implements LogIn{
	public boolean check=false;
	@Override
	public void login(User user)
	{
		
		for(int i=0;i<UserDB.database.size();i++)
		{
			if(UserDB.database.get(i).userName == user.getName())
			{
				if(UserDB.database.get(i).password == user.getpassword())
				{
					System.out.println("Successful Login");
					check=true;
					return;
				}
			}
		}
		System.out.println("Couldn't login \n signUp First");
		
	}

}
