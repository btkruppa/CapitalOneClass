package com.ers.reimbursement.model;

public class UserRoles {
	private int ersUserRoleId;
	private String userRole;
	public UserRoles(int ersUserRoleId, String userRole) {
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
		return "UserRoles [ersUserRoleId=" + ersUserRoleId + ", userRole=" + userRole + "]";
	}
	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
