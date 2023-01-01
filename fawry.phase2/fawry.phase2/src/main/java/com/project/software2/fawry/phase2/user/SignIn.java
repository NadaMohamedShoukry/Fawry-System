package com.project.software2.fawry.phase2.user;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignIn implements LogIn{
	public boolean check=false;
	@PostMapping(value="/signin")
	@Override
	public String login(@RequestBody User user)
	{
		
		for(int i=0;i<UserDB.database.size();i++)
		{
			if(UserDB.database.get(i).userName == user.getName())
			{
				if(UserDB.database.get(i).password == user.getpassword())
				{
					return("Successful Login");
					//check=true;
					//return;
				}
			}
		}
		return("Couldn't login \n signUp First");
		
	}

}
