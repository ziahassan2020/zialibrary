package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String,Double> myMap = new HashMap<>();
		myMap.put("Milk", 3.99);
		myMap.put("Milk", 1.99);
		myMap.put("Egg", 1.99);
		myMap.put("Meat", 4.99);
		myMap.put("Fish", 4.99);
		
		//Advanced or enhanced for loop
//		for(Map.Entry<String, Double> item:myMap.entrySet()) {
//			System.out.println(item);
//		}
		
//		Fastest loop in Java (foreach loop)
//		myMap.forEach((k,v) -> {
//			//System.out.println(k+" "+v);
//			System.out.println(k);  //Print key
//			System.out.println(v);  // Pring value
//		});
		
		myMap.entrySet().forEach(item -> {
			System.out.println(item);
//			System.out.println(item.getKey());
//			System.out.println(item.getValue());
		});
		Map<String,Double> myLinkedHashMap = new LinkedHashMap<>(myMap);
		for(Map.Entry<String, Double> item:myMap.entrySet()) {
			System.out.println("Linked Hash Map="+item);
		}
	}	

}
