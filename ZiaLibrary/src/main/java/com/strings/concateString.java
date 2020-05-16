package com.strings;

public class concateString {

	public static void main(String[] args) {
		String name = "Zia";
		String salary = "5000";
		System.out.print("1, "+name);  // no carrage return at the end in print
		System.out.print("2, "+salary);
		System.out.println("Name: "+name.concat(" Salary: "+salary));
		System.out.println(String.format("Name: %s  \nSalary: %s",name,salary));

	}

}
