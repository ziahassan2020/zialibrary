package com.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// 1. Give me the count of links on the page
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Total Links are: "+driver.findElements(By.tagName("a")).size());
		
		//2. get the link count only in footer section
		//Limit scope the webdriver. Create a subset or mini driver for footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("Footer links are: "+footerDriver.findElements(By.tagName("a")).size());
		//System.out.println(driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size());
		
		//3. I want to link count only in first column
		System.out.println("First Column: "+driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).size());
		// OR
		System.out.println("Otherway "+footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).size());
		// OR
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Third way: "+columnDriver.findElements(By.tagName("a")).size());
		
		//4. click on each link in the column and check the page is open
		
		for(int i=1; i< columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(2000);
			
//			driver.navigate().back();
		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
//		Set<String> ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		String parentId = it.next();
//		System.out.println(driver.getTitle());
//		for(int j=1; j < ids.size(); j++)
//		{						
//			String childId = it.next();			
//			driver.switchTo().window(childId);			
//			System.out.println(driver.getTitle());
//		}
			
	}

}
