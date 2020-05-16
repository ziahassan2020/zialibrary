package com.Synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {

	public static void main(String[] args) {
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Carrot","Potato"};
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait example. it defines globally
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);	
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();  ////tagName[contains(@attribute,’value’)]		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");		
		driver.findElement(By.cssSelector("button.promoBtn")).click();	
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	public static void addItems(WebDriver driver, String[] itemsNeeded ) {
		String[] name;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++) {			
			//Brocolli - 1 kg
			name = products.get(i).getText().split("-");
			//name[0] = Brocolli;
			//name[1]=1-KG;
			String formattedName=name[0].trim();			
			List itemsNeededList = Arrays.asList(itemsNeeded);	
			int j=0;
			if (itemsNeededList.contains(formattedName)){
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j==itemsNeeded.length) {
					break;
				}
				
			}
		}
	}

}
