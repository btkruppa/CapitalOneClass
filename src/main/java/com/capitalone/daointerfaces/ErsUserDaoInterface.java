package com.capitalone.daointerfaces;


import com.capitalone.beans.ErsUsers;

public interface ErsUserDaoInterface { 
	
	public ErsUsers findByUserName(String username, String password);

}
