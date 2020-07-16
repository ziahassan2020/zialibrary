package com.loop;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//While loop 3
		//inside while loop a for loop 4 times
		//inside the for loop a do while loop 5 times
		// all three loops in total iterate 60 times. Multiply the number of times they iterate individually.
		
		int i=0;
		int k=0;
		int count=0;
		while(i<3) {			
			for(int j=0;j<4;j++) {	
				k=0;
				do {
					System.out.println("i = "+i+" j= "+j+"  k= "+k);
					k++;
					count++;
				} while(k<5);
				
			}
			i++;
		}
		System.out.println("Total Count = "+count);

	}

}
