package com.capitalone.doscan;

import java.util.List;

public class ScanBean {
	private int principal;
	private int rate;
	private int time;
	private int result = 1;

	public ScanBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScanBean(int principal, int rate, int time) {
		super();
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	
	public void scanLogic(List<Integer> inputs){
		for(Integer li : inputs) {
			result *= li;
			
		}
		
		System.out.println("The result is "+ result);
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
}
