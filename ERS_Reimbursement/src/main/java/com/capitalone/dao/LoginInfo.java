package com.capitalone.dao;

import com.capitalone.bean.ERSUser;

public interface LoginInfo {
	
	ERSUser userLogin(String name, String password);

}
