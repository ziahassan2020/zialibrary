package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exam2 {

	public static void main(String[] args) {
		int finalValue=0;
		 List<Integer> myarr = new ArrayList<>();
		    myarr.add(7);
		    myarr.add(2);
		    myarr.add(3);
		    myarr.add(10);
		    myarr.add(2);
		    myarr.add(4);
		    myarr.add(8);
		    myarr.add(1);
		//    Collections.sort(myarr);
		    System.out.println(myarr);
		    for(int i=0;i<myarr.size()-1;i++){
		        int first = myarr.get(i);
		        int second = myarr.get(i+1);
		        System.out.println(second - first);
		       // finalValue = finalValue+Math.abs(first - second);		        
		    }
		    System.out.println("Final Value = "+finalValue);

	}

}
