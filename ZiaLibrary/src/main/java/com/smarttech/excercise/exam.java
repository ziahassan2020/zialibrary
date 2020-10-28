package com.smarttech.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exam {

	public static void main(String[] args) {
		int finalValue=0;
		 List<Integer> myarr = new ArrayList<>();
		    myarr.add(5);
		    myarr.add(5);
		    myarr.add(1);
		    myarr.add(3);
		    myarr.add(7);
		    myarr.add(3);
		    Collections.sort(myarr);
		    System.out.println(myarr);
		    for(int i=0;i<myarr.size()-1;i++){
		        int first = myarr.get(i);
		        int second = myarr.get(i+1);
		        finalValue = finalValue+Math.abs(first - second);		        
		    }
		    System.out.println("Final Value = "+finalValue);

	}

}
