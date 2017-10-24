package com.capitalone.com.reimbursement.bean;

import java.util.Date;

public class ReimbReq {
	
	private int reimb_id;
	private int reimb_amount;
	private Date reimb_submitted;
	private Date reimb_resolved;
	private String reimb_desc;
	private String reimb_receipt;
	private String reimb_status;
	
	public ReimbReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReimbReq(int reimb_id, int reimb_amount, Date reimb_submitted, Date reimb_resolved, String reimb_desc,
			String reimb_receipt, int reimb_status_id, int reimb_type_id,String reimb_status) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_desc = reimb_desc;
		this.reimb_receipt = reimb_receipt;
		this.reimb_status = reimb_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reimb_amount;
		result = prime * result + ((reimb_desc == null) ? 0 : reimb_desc.hashCode());
		result = prime * result + reimb_id;
		result = prime * result + ((reimb_receipt == null) ? 0 : reimb_receipt.hashCode());
		result = prime * result + ((reimb_resolved == null) ? 0 : reimb_resolved.hashCode());
		result = prime * result + ((reimb_submitted == null) ? 0 : reimb_submitted.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "ReimbReq [reimb_id=" + reimb_id + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_desc=" + reimb_desc
				+ ", reimb_receipt=" + reimb_receipt + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbReq other = (ReimbReq) obj;
		if (reimb_amount != other.reimb_amount)
			return false;
		if (reimb_desc == null) {
			if (other.reimb_desc != null)
				return false;
		} else if (!reimb_desc.equals(other.reimb_desc))
			return false;
		if (reimb_id != other.reimb_id)
			return false;
		if (reimb_receipt == null) {
			if (other.reimb_receipt != null)
				return false;
		} else if (!reimb_receipt.equals(other.reimb_receipt))
			return false;
		if (reimb_resolved == null) {
			if (other.reimb_resolved != null)
				return false;
		} else if (!reimb_resolved.equals(other.reimb_resolved))
			return false;
		if (reimb_submitted == null) {
			if (other.reimb_submitted != null)
				return false;
		} else if (!reimb_submitted.equals(other.reimb_submitted))
			return false;
		return true;
	}
	public int getReimb_id() {
		return reimb_id;
	}
	public void setReimb_id(int reimb_id) {
		this.reimb_id = reimb_id;
	}
	public int getReimb_amount() {
		return reimb_amount;
	}
	public void setReimb_amount(int reimb_amount) {
		this.reimb_amount = reimb_amount;
	}
	public Date getReimb_submitted() {
		return reimb_submitted;
	}
	public void setReimb_submitted(Date reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}
	public Date getReimb_resolved() {
		return reimb_resolved;
	}
	public void setReimb_resolved(Date reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}
	public String getReimb_desc() {
		return reimb_desc;
	}
	public void setReimb_desc(String reimb_desc) {
		this.reimb_desc = reimb_desc;
	}
	public String getReimb_receipt() {
		return reimb_receipt;
	}
	public void setReimb_receipt(String reimb_receipt) {
		this.reimb_receipt = reimb_receipt;
	}
	public String getReimb_status() {
		return reimb_status;
	}
	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}
	
}
