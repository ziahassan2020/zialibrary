package com.exceldata;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFontHandling {
	public static void main(String[] args) {  
        try (OutputStream fileOut = new FileOutputStream("Javatpoint.xlsx")) {  
            Workbook wb = new XSSFWorkbook(); // Creating a workbook  
            Sheet sheet = wb.createSheet("Sheet"); // Creating a sheet  
            Row row = sheet.createRow(1); // Creating a row  
            Cell cell = row.createCell(1); // Creating a cell  
            CellStyle style = wb.createCellStyle(); // Creating Style  
            cell.setCellValue("Hello, Javatpoint!");  
            // Creating Font and settings  
            Font font = wb.createFont();  
            font.setFontHeightInPoints((short)11);  
            font.setFontName("Courier New");  
            // Set the text color
            font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
            // Set the background color
            style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            //end set background color
            font.setItalic(true);  
            font.setStrikeout(true);  
            // Applying font to the style  
            style.setFont(font);  
            // Applying style to the cell  
            cell.setCellStyle(style);      
            wb.write(fileOut);  
        }catch(Exception e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}
