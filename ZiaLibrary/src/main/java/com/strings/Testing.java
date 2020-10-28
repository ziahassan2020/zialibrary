package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Testing {

	public static void main(String[] args) {
	//	List<Integer> list = new ArrayList<>(Arrays.asList(10,15,20,25,35,45,55));
		int[] x = {10,15,20,25,35,45,55,5,8};
		System.out.println(Arrays.stream(x).min().getAsInt());
	}
}


