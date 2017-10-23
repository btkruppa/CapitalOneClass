package com.capitalone.bean;

public class ERSUser {
	private int ersUserID;
	private String ersUserName;
	private String ersPassword;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private int userRoleId;
	
	
	public ERSUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getErsUserID() {
		return ersUserID;
	}


	public void setErsUserID(int ersUserID) {
		this.ersUserID = ersUserID;
	}


	public String getErsUserName() {
		return ersUserName;
	}


	public void setErsUserName(String ersUserName) {
		this.ersUserName = ersUserName;
	}


	public String getErsPassword() {
		return ersPassword;
	}


	public void setErsPassword(String ersPassword) {
		this.ersPassword = ersPassword;
	}


	public String getUserFirstName() {
		return userFirstName;
	}


	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}


	public String getUserLastName() {
		return userLastName;
	}


	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public int getUserRoleId() {
		return userRoleId;
	}


	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}


	@Override
	public String toString() {
		return "ERSUser [ersUserID=" + ersUserID + ", ersUserName=" + ersUserName + ", ersPassword=" + ersPassword
				+ ", userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userEmail=" + userEmail
				+ ", userRoleId=" + userRoleId + "]";
	}


	public ERSUser(int ersUserID, String ersUserName, String ersPassword, String userFirstName, String userLastName,
			String userEmail, int userRoleId) {
		super();
		this.ersUserID = ersUserID;
		this.ersUserName = ersUserName;
		this.ersPassword = ersPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userRoleId = userRoleId;
	}
	
	
	
	
	
}	