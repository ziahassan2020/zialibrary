package com.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		// provide month and date // Apr 14
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//Month
		// False of negation is true (!)
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(("June"))) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			Thread.sleep(1000);
		}
		
		// Date		
		List<WebElement> dates = driver.findElements(By.className("day"));
		//Grab the common attribute and put it into the list and itrate
		int count = driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++) {			
			if (driver.findElements(By.className("day")).get(i).getText().equalsIgnoreCase("28"))
			{				
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		 
		
	}

}
