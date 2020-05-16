package com.exceldata;

import java.io.IOException;
import java.util.ArrayList;

public class TestCase {

	public static void main(String[] args) throws IOException {
		
		DataDriven data = new DataDriven();
		ArrayList<String> list = data.getData("Add Profile");
		System.out.println(list);
		System.out.println(list.get(0));
	}

}
