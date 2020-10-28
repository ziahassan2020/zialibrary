package com.hamariWeb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import com.util.Highlighter;
import com.util.ScreenShot;

public class Automation {

	public static void main(String[] args) throws Throwable {

		ArrayList<String> myList = new ArrayList<>();
		myList = Automation.getExcelData("25000");
		System.out.println(myList);
		ScreenShot.emptyScreenShotFolder();
		Automation.testData(myList);
	}

	public static void testData(ArrayList<String> bondNumber) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://hamariweb.com/finance/prizebonds/100-draw-result.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		String[] arrData = new String[5];
		System.out.println("Total Rows: " + rows.size());
		DateFormat format;
		Date drawDate = null, currDate;
		currDate = new Date();
		int priceValue=0;
		String temp=null;
		WebElement viewDetail;
		int lineClick=0;

		format = new SimpleDateFormat("d MMMM, yyyy", Locale.ENGLISH);
	//	for (int i = 1; i < rows.size(); i++) { // runs 32 times (rows)		
		for (int i = 1; i < 5; i++) {			
			for (int j = 1; j <= 6; j++) { // Column
				String x = driver.findElement(By.xpath("(//table)[2]/tbody/tr[" + (i) + "]/td[" + (j) + "]")).getText();
			//	System.out.println("X==>: "+x);
				System.out.println("(//table)[2]/tbody/tr[" + (i) + "]/td[" + (j) + "]");
				if (j == 3) {
					drawDate = format.parse(x);
					System.out.println("Date: " + drawDate);
				} else if (j == 6) {
					System.out.println("View Detail: " + x);
					if (drawDate.compareTo(currDate) < 0) {
						lineClick++;
						System.out.println("Draw Date: "+drawDate+" Line Click: "+lineClick);						
						System.out.println("(//*[text()='View Result'])[" + lineClick + "]");
						//driver.findElement(By.xpath("(//*[text()='View Result'])[" + lineClick + "]")).click();
						viewDetail = driver.findElement(By.xpath("(//*[text()='View Result'])[" + lineClick + "]"));
						Actions ac = new Actions(driver);
						ac.moveToElement(viewDetail).build().perform();
						Highlighter.getcolor(driver, viewDetail, "red");
						ScreenShot.getScreenShot(driver, "View Detail.png");
						ac.click().build().perform();
						for (int k=0;k<bondNumber.size();k++) {	
							driver.findElement(By.xpath("//input[@id='txtId']")).clear();
							driver.findElement(By.xpath("//input[@id='txtId']")).sendKeys(bondNumber.get(k).toString());
							Thread.sleep(2000);
							driver.findElement(By.xpath("//input[@id='txtId']")).sendKeys(Keys.ENTER);
							Thread.sleep(2000);				
							   
							temp = driver.findElement(By.xpath("//*[@id='results']/table/tbody/tr/td[1]")).getText();
							
							if(temp.equalsIgnoreCase(bondNumber.get(k).toString())) {
								priceValue = Integer.parseInt(driver.findElement(By.xpath("//*[@id='results']/table/tbody/tr/td[2]")).getText());
								System.out.println("Draw Date: "+drawDate+" won the price: "+bondNumber.get(k).toString()+" Amount= "+priceValue);
							} else {
								System.out.println("Draw Date: "+drawDate+"Bond #: "+bondNumber.get(k).toString()+" "+temp);
							}												
						}
						Thread.sleep(2000);
						driver.navigate().back(); 
						Thread.sleep(2000);
					}
				}
			}			
		}
	}
	public static ArrayList getExcelData(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream("./DataDriven/BondNumbers.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> columns = firstRow.cellIterator();
				int k = 0;
				int columnNum = 0;
				while (columns.hasNext()) {
					Cell value = columns.next();
					if (value.getStringCellValue().equalsIgnoreCase("BondNum"))
						;
					{
						columnNum = k;
					}
					k++;
				}
				while (rows.hasNext()) {
					Row rowData = rows.next();
// rowData.getCell(columnNum).getStringCellValue().equalsIgnoreCase("");
					Iterator<Cell> cv = rowData.cellIterator();
					while (cv.hasNext()) {
						Cell c = cv.next();
						if (c.getCellType() == CellType.STRING) {
							list.add(c.getStringCellValue());
						} else if (c.getCellType() == CellType.NUMERIC) {
							list.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
					}

				}
			}
		}
		return list;

	}

}
