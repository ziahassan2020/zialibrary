package com.miscObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).isSelected());
	}

}
