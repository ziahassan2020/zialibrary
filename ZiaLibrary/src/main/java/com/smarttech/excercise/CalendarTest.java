package com.smarttech.excercise;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		cal.setTime(date);
		Date d = cal.getTime();
		System.out.println(d);
		
	}

}
