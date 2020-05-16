package com.collections;

import java.util.Arrays;

public class combineArray {

	public static void main(String[] args) {
		
		int[] a= {88,66,55,100,33,44,22,11,99};
		int[] b= {333,666,555,1000,333,444,222,111,222};
		int[] c= new int[a.length+b.length];
		
		// Old way
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
	//	System.out.println(Arrays.toString(c));
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
	//	System.out.println(Arrays.toString(c));
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b,0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}

}
