package com.enumm;

public class TestEnum {
	enum Day {Sunday, Monday,Tuesday,Wednesday}
	
	public static void main(String[] args) {	
		
		Day myday = Day.Wednesday;		
		switch (myday) {
		case Sunday:
			System.out.println("Sunday");
			break;
		case Monday:
			System.out.println("Monday");
			break;
		case Tuesday:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Not Found");		
			
		}

	}

}
