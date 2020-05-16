package com.miscObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("http://www.makemytrip.com");
		driver.get("http://www.expedia.com");
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']//span[@class='icons-container']")).click();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
		source.clear();			
		source.sendKeys("KHI");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);		
		source.sendKeys(Keys.ENTER);
		
		// destination
		WebElement destination = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
		destination.clear();
		Thread.sleep(2000);
		destination.sendKeys("JFK");
		Thread.sleep(2000);
		/*for (int i=1;i<5;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}*/
		int i = 1;
		while (i < 6) {
			destination.sendKeys(Keys.ARROW_DOWN);
			i++;
		}
		
		destination.sendKeys(Keys.ENTER);	
		
		driver.findElement(By.xpath("//div[@id='traveler-selector-hp-flight'] //button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")).click();
		//51-13:47
		
	}

}
