package fawry;

import java.util.HashMap;

public interface LogIn {
	HashMap<User , User> users = new HashMap<>();
	
	public void login(User user);
}
