package com.miscObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To determines its a static drop down. Developer must used Select tag in html
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(2);
		s.selectByValue("USD");
		s.selectByVisibleText("INR");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		
		driver.findElement(By.id("divpaxinfo")).click();	
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));		
		adult.selectByValue("3");
		
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByValue("2");
		
		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));	
		infant.selectByValue("1");
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
