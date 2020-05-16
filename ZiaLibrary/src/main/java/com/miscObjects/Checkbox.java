package com.miscObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com");
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
		//driver.findElement(By.id("//button[@id='tab-flight-tab-hp'] //span[@class='icons-container']")).click();
		Thread.sleep(2000);		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='flight-add-hotel-checkbox-hp-flight']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='flight-add-hotel-checkbox-hp-flight']")).isSelected());
		//driver.findElement(By.xpath("//input[@id='flight-add-hotel-checkbox-hp-flight']")).click();
		driver.findElement(By.cssSelector("input[name='addHotel']")).click();		//
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='flight-add-hotel-checkbox-hp-flight']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='flight-add-hotel-checkbox-hp-flight']")).isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 16);
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
