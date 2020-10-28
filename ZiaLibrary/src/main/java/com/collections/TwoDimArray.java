package com.collections;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int[][] b= {{10,20,30},{40,50,60}}; 	//two/Multi dimension 
		String[] name = {"ZIA","HASSAN","HELLO WORLD"};
		
		int[][] c = {{10,20,30,300},
				 {40,50,60},
				 {70,80,90,500}};
	
	System.out.println(c.length);
	for(int i=0;i<c.length;i++) {
		for(int j=0; j<c[i].length;j++) {
			System.out.println("Multi Dimension: "+c[i][j]+" Row= "+i+" Column= "+j);
		}
	}

	}

}
