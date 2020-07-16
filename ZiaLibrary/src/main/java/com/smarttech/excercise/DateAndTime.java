package com.smarttech.excercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat ft = new SimpleDateFormat("E MM/dd/yyyy 'at' hh:mm:ss a zzz");
		System.out.println("Current Date is: "+ft.format(dt));
		
		String str = String.format("Current Date/Time :%tc", dt);
		System.out.println(str);
		System.out.printf("%1$s %2$tB %2$td, %2$tY","======",dt);
		System.out.println();
		System.out.printf("%s %tB %<te,%<tY","======",dt);
		System.out.println();
		
		SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
		String input=args.length==0? "1818-11-11":args[0];
		System.out.println(input+" Parses as ");
		Date t;
			try {
				t=ft1.parse(input);
				System.out.println(t);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Unparseable using "+ft1);
				e.printStackTrace(); 
			}
			
		
	}

}
