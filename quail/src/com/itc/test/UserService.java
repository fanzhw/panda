package com.itc.test;

import java.util.List;

public interface UserService {

	public abstract void save(User user);
	
	public abstract User getUserById(String id);
	
	public abstract List<User> getUsers();
}
