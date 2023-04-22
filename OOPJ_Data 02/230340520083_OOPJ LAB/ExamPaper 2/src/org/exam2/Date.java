package org.exam2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
public class Date {
	
	 int day;
	 int month;
	 int year;
	 
	 
	 Date (){
		 
		 
	 }

	
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month =month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String fdate = formatter.format(date);
		
		System.out.println(fdate);

	}
	
	
}
