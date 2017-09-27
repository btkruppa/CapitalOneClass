package com.capitalone.objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class School {

	public static final String setStarttime = null;
	private int numberBooks;
	private int numberTeachers;
	private int numberClassrooms;
	
	private static LocalTime starttime;
	

	public int getNumberBooks() {
		return numberBooks;
	}

	public void setNumberBooks(int numberBooks) {
		this.numberBooks = numberBooks;

	}

	public int getNumberTeachers() {
		return numberTeachers;
	}

	public void setNumberTeachers(int numberTeachers) {
		this.numberTeachers = numberTeachers;
	}

	public int getNumberClassrooms() {
		return numberClassrooms;
	}

	public void setNumberClassrooms(int numberClassrooms) {
		if (numberClassrooms >= 0) {
			this.numberClassrooms = numberClassrooms;
		}
	}

	public School(int numberBooks, int numberTeachers, int numberClassrooms) {
		super();
		this.numberBooks = numberBooks;
		this.numberTeachers = numberTeachers;
		this.numberClassrooms = numberClassrooms;
	}

	
	public void startSchool(LocalDateTime time){
		System.out.println("start time" + time);
	}

	public static LocalTime getStarttime() {
		return starttime;
	}

	public static void setStarttime(LocalTime starttime) {
		School.starttime = starttime;
	}
	
		
	
}
