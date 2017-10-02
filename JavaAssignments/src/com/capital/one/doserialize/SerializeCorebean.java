package com.capital.one.doserialize;

import java.io.Serializable;

public class SerializeCorebean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 99999999;
	private String animalName;
	private String animalPair;
	private int age;
	private String place;
	
	
	public SerializeCorebean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SerializeCorebean(String animalName, String animalPair, int age, String place) {
		super();
		this.animalName = animalName;
		this.animalPair = animalPair;
		this.age = age;
		this.place = place;
	}


	@Override
	public String toString() {
		return "SerializeCorebean [animalName=" + animalName + ", animalPair=" + animalPair + ", age=" + age
				+ ", place=" + place + "]";
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalPair() {
		return animalPair;
	}
	public void setAnimalPair(String animalPair) {
		this.animalPair = animalPair;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}