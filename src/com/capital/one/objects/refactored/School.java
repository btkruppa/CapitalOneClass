package com.capital.one.objects.refactored;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class School {

	private int numberBooks;
	private int numberTeachers;
	private int numberClassrooms;

	private static LocalTime startTime = LocalTime.of(9, 0);

	public School(int numberBooks) {
		super();
		System.out.println("called other constructor");
		if (numberBooks >= 0) {
			this.numberBooks = numberBooks;
		} else {
			this.numberBooks = 0;
		}
		// TODO Auto-generated constructor stub
	}

	public School(int numberBooks, int numberTeachers, int numberClassrooms) {
		this(numberBooks);
		this.numberTeachers = numberTeachers;
		this.numberClassrooms = numberClassrooms;
	}

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

	public void startSchool(LocalDateTime time) {
		System.out.println("school started for the day at " + time);
	}

	@Override
	public String toString() {
		return "School [numberBooks=" + numberBooks + ", numberTeachers=" + numberTeachers + ", numberClassrooms="
				+ numberClassrooms + "]";
	}

	public static LocalTime getStartTime() {
		return startTime;
	}

	public static void setStartTime(LocalTime newStartTime) {
		startTime = newStartTime;
	}

}
