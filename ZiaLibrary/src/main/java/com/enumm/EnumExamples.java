package com.enumm;

enum MobileCompany{
		
	APPLE(70),SAMSUNG,HTC(90);  // constant variable never change
	
	int price;
	
	MobileCompany(){
		price = 80;
	}
	MobileCompany(int p){
		price = p;
	}
	
	
	int getPrice() {
		return price;
	}
}

public class EnumExamples {
	public static void main(String[] args) {
		//MobileCompany.APPLE // enum is static so classname.variable name
		System.out.println(MobileCompany.HTC.getPrice());
		System.out.println(MobileCompany.APPLE.getPrice());
		System.out.println(MobileCompany.SAMSUNG.getPrice()); 
		MobileCompany m = MobileCompany.HTC;
		switch(m) {
		case APPLE:
			System.out.println("This is Apple");
			break;
		case SAMSUNG:
			System.out.println("This is Samsung");
			break;
		case HTC:
			System.out.println("This is HTC");
			break;
		default: 
			System.out.println("This is not a valid phone provider");
			break;
		}
	}
}
