package com.project.software2.fawry.phase2.user;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.software2.fawry.phase2.DB.UserDB;

@RestController
public class SignUp implements LogIn{
	SignIn s = new SignIn();
	@PostMapping(value="/signup")
	@Override
	public String login(@RequestBody User user)
	{
		
		for(int i=0;i<UserDB.database.size();i++)
		{
			if(UserDB.database.get(i).getName()==user.getName())
			{
				//System.out.println("Account already exists");
				s.login(user);
				return("Please Sign in");
				//s.login(user);
				//break;
			}
		}
		UserDB.database.add(user);
		
		return("User Signed Up Successfuly");
	}

}
