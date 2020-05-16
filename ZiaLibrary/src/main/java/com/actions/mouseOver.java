package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions action = new Actions(driver);	
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//action.moveToElement(move).build().perform();
//		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
//		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		// it builds the action string and execute it. To execute use perform
		//It moves to Specific Element
		
		// Right click
		action.moveToElement(move).contextClick().build().perform();
	
		
		

		
	}

}
