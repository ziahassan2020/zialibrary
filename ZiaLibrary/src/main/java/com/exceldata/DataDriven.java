package com.exceldata;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	@SuppressWarnings("deprecation")
	public ArrayList getData(String TestCaseName) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		
		FileInputStream fis = new FileInputStream("C:\\Software Testing\\Document\\online_doc\\Automation\\DataDrivenExcel\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		for(int i=0; i<workbook.getNumberOfSheets();i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();  // sheet is a collection of rows
				
				Row firstrow = rows.next();
				Iterator<Cell> cells = firstrow.cellIterator(); // row is a collections of cells
				int k=0;
				int column=0;
				while(cells.hasNext()) {					
					Cell value = cells.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column=k;						
					}
					k++;
				}
								
				while(rows.hasNext()) {					
					Row rowData = rows.next();
					if (rowData.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
						Iterator<Cell> cv= rowData.cellIterator();
						while(cv.hasNext()) {
							Cell c = cv.next();
						//	c.getCellType()==CellType.NUMERIC
							if(c.getCellType()==CellType.STRING) {
								list.add(c.getStringCellValue());
							} else {
								//list.add(String.valueOf(c.getNumericCellValue()));
								list.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
				
					}
					
				}
								
			}
		
		}
		return list;

	}

}
