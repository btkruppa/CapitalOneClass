package com.capitalone.beans;

public class ErsUserRoles {
	private int ersUserRoleId;
	private String userRole;
	
	public ErsUserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErsUserRoles(int ersUserRoleId, String userRole) {
		super();
		this.ersUserRoleId = ersUserRoleId;
		this.userRole = userRole;
	}

	public int getErsUserRoleId() {
		return ersUserRoleId;
	}

	public void setErsUserRoleId(int ersUserRoleId) {
		this.ersUserRoleId = ersUserRoleId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "ErsUserRoles [ersUserRoleId=" + ersUserRoleId + ", userRole=" + userRole + "]";
	} 

}
