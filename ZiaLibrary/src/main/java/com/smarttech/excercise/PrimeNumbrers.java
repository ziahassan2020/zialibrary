package com.smarttech.excercise;

public class PrimeNumbrers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		for(int i=1;i<=50;i++) {
			flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}					
			}
			if (flag) {
				System.out.println("Prime #= "+i);
			}
				
		}

	}

}
