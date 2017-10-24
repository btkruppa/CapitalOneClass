package com.ersassignment.model;

import java.util.List;

public class Users_ERS {
	private int ers_users_Id;
	public String ers_usersName;
	private String ers_password;
	private String user_firstName;
	private String user_lastName;
	private String user_email;
	private int user_role_id;

	private List<Ers_reimbursement> reimb;

	public Users_ERS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users_ERS(int ers_users_Id, String ers_usersName, String ers_password, String user_firstName,
			String user_lastName, String user_email, int user_role_id, List<Ers_reimbursement> reimb) {
		super();
		this.ers_users_Id = ers_users_Id;
		this.ers_usersName = ers_usersName;
		this.ers_password = ers_password;
		this.user_firstName = user_firstName;
		this.user_lastName = user_lastName;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
		this.reimb = reimb;
	}

	public int getErs_users_Id() {
		return ers_users_Id;
	}

	public void setErs_users_Id(int ers_users_Id) {
		this.ers_users_Id = ers_users_Id;
	}

	public String getErs_usersName() {
		return ers_usersName;
	}

	public void setErs_usersName(String ers_usersName) {
		this.ers_usersName = ers_usersName;
	}

	public String getErs_password() {
		return ers_password;
	}

	public void setErs_password(String ers_password) {
		this.ers_password = ers_password;
	}

	public String getUser_firstName() {
		return user_firstName;
	}

	public void setUser_firstName(String user_firstName) {
		this.user_firstName = user_firstName;
	}

	public String getUser_lastName() {
		return user_lastName;
	}

	public void setUser_lastName(String user_lastName) {
		this.user_lastName = user_lastName;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	public List<Ers_reimbursement> getReimb() {
		return reimb;
	}

	public void setReimb(List<Ers_reimbursement> reimb) {
		this.reimb = reimb;
	}

	@Override
	public String toString() {
		return "Users_ERS [ers_users_Id=" + ers_users_Id + ", ers_usersName=" + ers_usersName + ", ers_password="
				+ ers_password + ", user_firstName=" + user_firstName + ", user_lastName=" + user_lastName
				+ ", user_email=" + user_email + ", user_role_id=" + user_role_id + ", reimb=" + reimb + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ers_password == null) ? 0 : ers_password.hashCode());
		result = prime * result + ((ers_usersName == null) ? 0 : ers_usersName.hashCode());
		result = prime * result + ers_users_Id;
		result = prime * result + ((reimb == null) ? 0 : reimb.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_firstName == null) ? 0 : user_firstName.hashCode());
		result = prime * result + ((user_lastName == null) ? 0 : user_lastName.hashCode());
		result = prime * result + user_role_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users_ERS other = (Users_ERS) obj;
		if (ers_password == null) {
			if (other.ers_password != null)
				return false;
		} else if (!ers_password.equals(other.ers_password))
			return false;
		if (ers_usersName == null) {
			if (other.ers_usersName != null)
				return false;
		} else if (!ers_usersName.equals(other.ers_usersName))
			return false;
		if (ers_users_Id != other.ers_users_Id)
			return false;
		if (reimb == null) {
			if (other.reimb != null)
				return false;
		} else if (!reimb.equals(other.reimb))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_firstName == null) {
			if (other.user_firstName != null)
				return false;
		} else if (!user_firstName.equals(other.user_firstName))
			return false;
		if (user_lastName == null) {
			if (other.user_lastName != null)
				return false;
		} else if (!user_lastName.equals(other.user_lastName))
			return false;
		if (user_role_id != other.user_role_id)
			return false;
		return true;
	}

}