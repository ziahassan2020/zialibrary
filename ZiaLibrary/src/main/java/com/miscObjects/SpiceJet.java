package com.miscObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		//Radio button one way or roundtrip etc.
	//	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5"))
		{
			System.out.println("Its Not Enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Its Enabled");
			Assert.assertTrue(false);
		}
		
		// Pickup and destination address
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		// Date section
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
	//	driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	//	driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		Thread.sleep(2000);
		// Passenger
		driver.findElement(By.id("divpaxinfo")).click();	
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));		
		adult.selectByValue("3");
		
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByValue("2");
		
		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));	
		infant.selectByValue("1");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Currency
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	//	s.selectByIndex(2);
		s.selectByValue("USD");
	//	s.selectByVisibleText("INR");
		
		// Check Box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		Thread.sleep(2000);
		//Search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
//		driver.findElement(By.xpath("input[@value='Search']")).click();
	//	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
