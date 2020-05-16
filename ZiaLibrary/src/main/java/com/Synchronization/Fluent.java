package com.Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(30, SECONDS)
//			       .pollingEvery(5, SECONDS)
//			       .ignoring(NoSuchElementException.class)
		
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//		       return driver.findElement(By.id("foo"));
//		     }
//		   });
			       
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
				
		WebElement foo = wait.until(new Function<WebDriver,WebElement>() {			
			public WebElement apply(WebDriver driver) {
				WebElement finish = driver.findElement(By.cssSelector("[id='finish'] h4"));
				if (finish.isDisplayed())
				{
					return finish;
				} 
				else				
					return null;				
			}
		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());	
		
	}

}
