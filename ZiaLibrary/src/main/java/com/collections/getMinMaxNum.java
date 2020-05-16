package com.collections;

import java.util.Arrays;

public class getMinMaxNum {

	public static void main(String[] args) {
		//Find max and min numbers
		int[] newArray = {66,55,44,33,88,22,11};
		System.out.println(Arrays.stream(newArray).max().getAsInt());
		System.out.println(Arrays.stream(newArray).min().getAsInt());

	}

}
