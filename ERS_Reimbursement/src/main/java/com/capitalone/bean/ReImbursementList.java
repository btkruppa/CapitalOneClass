package com.capitalone.bean;

import java.sql.Date;

public class ReImbursementList {
	
	private int reimbId;
	private float reimbAmount;
	private Date reimbSubmitted;
	private Date reimbResolved;
	private String reimbDesc;
	private String reimbReceipt;
	private String reimbAuthor;
	private String reimbResolver;
	private String reimbStatus;
	private String reimbType;
	
	public ReImbursementList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReImbursementList(int reimbId, float reimbAmount, Date reimbSubmitted, Date reimbResolved, String reimbDesc,
			String reimbReceipt, String reimbAuthor, String reimbResolver, String reimbStatus, String reimbType) {
		super();
		this.reimbId = reimbId;
		this.reimbAmount = reimbAmount;
		this.reimbSubmitted = reimbSubmitted;
		this.reimbResolved = reimbResolved;
		this.reimbDesc = reimbDesc;
		this.reimbReceipt = reimbReceipt;
		this.reimbAuthor = reimbAuthor;
		this.reimbResolver = reimbResolver;
		this.reimbStatus = reimbStatus;
		this.reimbType = reimbType;
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

	public String getReimbDesc() {
		return reimbDesc;
	}

	public void setReimbDesc(String reimbDesc) {
		this.reimbDesc = reimbDesc;
	}

	public String getReimbReceipt() {
		return reimbReceipt;
	}

	public void setReimbReceipt(String reimbReceipt) {
		this.reimbReceipt = reimbReceipt;
	}

	public String getReimbAuthor() {
		return reimbAuthor;
	}

	public void setReimbAuthor(String reimbAuthor) {
		this.reimbAuthor = reimbAuthor;
	}

	public String getReimbResolver() {
		return reimbResolver;
	}

	public void setReimbResolver(String reimbResolver) {
		this.reimbResolver = reimbResolver;
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

	@Override
	public String toString() {
		return "ReImbursementList [reimbId=" + reimbId + ", reimbAmount=" + reimbAmount + ", reimbSubmitted="
				+ reimbSubmitted + ", reimbResolved=" + reimbResolved + ", reimbDesc=" + reimbDesc + ", reimbReceipt="
				+ reimbReceipt + ", reimbAuthor=" + reimbAuthor + ", reimbResolver=" + reimbResolver + ", reimbStatus="
				+ reimbStatus + ", reimbType=" + reimbType + "]";
	}
	
	
	

}
