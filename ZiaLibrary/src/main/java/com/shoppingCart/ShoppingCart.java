package com.shoppingCart;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Carrot","Potato"};
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait example
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);
	//	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();  ////tagName[contains(@attribute,’value’)]
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
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
			//check whether name you extracted is present in array or not
			// convert an array into array list. 
			// point Array takes less memory and array list is used when you have complicated scenario to validate
			//In runtime you convert array to array list to save memory
			//It is recommended to have an item in array and when ever you need convert it into array list 
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
	/*		name = products.get(i).getText();	
	 		if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			} */
			int j=0;
			if (itemsNeededList.contains(formattedName)){
				j++;
			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				// length of array not array list
				if (j==itemsNeeded.length) {
					break;
				}
				
			}
		}
	}

}
