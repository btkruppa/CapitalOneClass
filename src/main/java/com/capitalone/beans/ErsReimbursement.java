package com.capitalone.beans;

import java.util.Date;

public class ErsReimbursement {

	private int reimbId;
	private float reimbAmount;
	private Date reimbSubmitted; 
	private Date reimbResolved; 
	private String reimbDescription;
	private String reimbReceipt; 
	private String userFirstName;
	private String userLastName;
	private String reimbStatus;
	private String reimbType;
	private int reimbAuthor;
	private int reimbResolver;
	private int reimbStatusId;
	private int reimbTypeId;
	
	
	public ErsReimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ErsReimbursement(int reimbId, float reimbAmount, Date reimbSubmitted, Date reimbResolved,
			String reimbDescription, String reimbReceipt, String userFirstName, String userLastName, String reimbStatus,
			String reimbType, int reimbAuthor, int reimbResolver, int reimbStatusId, int reimbTypeId) {
		super();
		this.reimbId = reimbId;
		this.reimbAmount = reimbAmount;
		this.reimbSubmitted = reimbSubmitted;
		this.reimbResolved = reimbResolved;
		this.reimbDescription = reimbDescription;
		this.reimbReceipt = reimbReceipt;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.reimbStatus = reimbStatus;
		this.reimbType = reimbType;
		this.reimbAuthor = reimbAuthor;
		this.reimbResolver = reimbResolver;
		this.reimbStatusId = reimbStatusId;
		this.reimbTypeId = reimbTypeId;
	}


	public int getReimbId() {
		return reimbId;
	}


	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}


	public float getReimbAmount() {
		return reimbAmount;
	}


	public void setReimbAmount(float reimbAmount) {
		this.reimbAmount = reimbAmount;
	}


	public Date getReimbSubmitted() {
		return reimbSubmitted;
	}


	public void setReimbSubmitted(Date reimbSubmitted) {
		this.reimbSubmitted = reimbSubmitted;
	}


	public Date getReimbResolved() {
		return reimbResolved;
	}


	public void setReimbResolved(Date reimbResolved) {
		this.reimbResolved = reimbResolved;
	}


	public String getReimbDescription() {
		return reimbDescription;
	}


	public void setReimbDescription(String reimbDescription) {
		this.reimbDescription = reimbDescription;
	}


	public String getReimbReceipt() {
		return reimbReceipt;
	}


	public void setReimbReceipt(String reimbReceipt) {
		this.reimbReceipt = reimbReceipt;
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


	public String getReimbStatus() {
		return reimbStatus;
	}


	public void setReimbStatus(String reimbStatus) {
		this.reimbStatus = reimbStatus;
	}


	public String getReimbType() {
		return reimbType;
	}


	public void setReimbType(String reimbType) {
		this.reimbType = reimbType;
	}


	public int getReimbAuthor() {
		return reimbAuthor;
	}


	public void setReimbAuthor(int reimbAuthor) {
		this.reimbAuthor = reimbAuthor;
	}


	public int getReimbResolver() {
		return reimbResolver;
	}


	public void setReimbResolver(int reimbResolver) {
		this.reimbResolver = reimbResolver;
	}


	public int getReimbStatusId() {
		return reimbStatusId;
	}


	public void setReimbStatusId(int reimbStatusId) {
		this.reimbStatusId = reimbStatusId;
	}


	public int getReimbTypeId() {
		return reimbTypeId;
	}


	public void setReimbTypeId(int reimbTypeId) {
		this.reimbTypeId = reimbTypeId;
	}


	@Override
	public String toString() {
		return "ErsReimbursement [reimbId=" + reimbId + ", reimbAmount=" + reimbAmount + ", reimbSubmitted="
				+ reimbSubmitted + ", reimbResolved=" + reimbResolved + ", reimbDescription=" + reimbDescription
				+ ", reimbReceipt=" + reimbReceipt + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", reimbStatus=" + reimbStatus + ", reimbType=" + reimbType + ", reimbAuthor="
				+ reimbAuthor + ", reimbResolver=" + reimbResolver + ", reimbStatusId=" + reimbStatusId
				+ ", reimbTypeId=" + reimbTypeId + "]";
	}
	
	
}
