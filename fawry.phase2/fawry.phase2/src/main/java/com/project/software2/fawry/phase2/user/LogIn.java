package com.project.software2.fawry.phase2.user;

import java.util.HashMap;

public interface LogIn {
    HashMap<User , User> users = new HashMap<>();
	
	public String login(User user);
}
