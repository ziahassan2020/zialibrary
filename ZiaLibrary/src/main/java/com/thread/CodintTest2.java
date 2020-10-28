package com.thread;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CodintTest2 {
	
	//what do the ... dots in the method parameter mean?
	// we can pass 10 parameters
	
	public void myTest(String a, String b, String c) {
		
	}
	public static void myMethod(String...strings) {  // we don't need to know how many parameter we need we can add as many as we want
		for(String x : strings) {
			System.out.println(x);
		}
	}
	public static void streamTest() {
		DoubleStream stream = DoubleStream.of(1998.2); 
		        
        stream.forEach(System.out::println); 
	}
	public static void doubleFormat() {
		double price = 2500.00;
	    DecimalFormat df = new DecimalFormat("#,###,###.00");

	    String format1 = df.format(price);
	    System.out.println("Format 1: "+format1); //250.00

	    String format2 = NumberFormat.getNumberInstance(Locale.US).format(price);// Exception "Cannot format given Object as a Number"
	    System.out.println("Format 2: "+format2); //excepted 2,500.00
	}
	public static void main(String[] args) {
		
		myMethod("ZZZ","XXX");
		myMethod("aaa","fff","fff");
		System.out.println("Stream");
		streamTest();
		doubleFormat();
//		CodeThread obj = new CodeThread();
//		obj.start();
//		System.out.println(obj.getId() +" xxx");
//	//	obj.stop();
		String a = "Smarttech";
		String b="Smarttech";
		String c = new String("ZIA");
		String d = new String("ZIA");
		System.out.println(a==b);
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(c==d);
		System.out.println(c.equalsIgnoreCase(d));
		String x = "1,999,999.00";
		System.out.println(x);
		Stream <Number> z = Stream.of(1,999,999.00);
		z.forEach(i -> System.out.println(i+","));
		
		//System.out.println(String.format("%.2f", x));
	}

}
