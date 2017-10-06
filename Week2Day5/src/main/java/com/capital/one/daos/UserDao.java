package com.capital.one.daos;

import java.util.List;

import com.capital.one.beans.User;

public interface UserDao {
	User findByUsernameAndPassword(String username, String password);

	List<User> findAllUsers();

	boolean addNewUser(User user);
	
	boolean deleteUser(User user);
	
	boolean updateUser(User user);

	User betterFindByUsernameAndPassword(String username, String password);
	
}
