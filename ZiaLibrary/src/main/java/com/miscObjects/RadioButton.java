package com.miscObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		//driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
	//	System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	//	System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Its Not Enabled");
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
	//	driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	}

}
