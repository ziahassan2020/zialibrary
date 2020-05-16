package com.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[2]")).click();
		driver.findElement(By.xpath("//tr/th[2]")).click();
//		List<WebElement> fruitName = driver.findElements(By.cssSelector("tr td nth-child[2]"));
		List<WebElement> fruitNameXpath = driver.findElements(By.xpath("//tr/td[2]"));
		
	//	System.out.println(fruitName);
		ArrayList<String> fruitArrayOriginal = new ArrayList<String>();
		ArrayList<String> fruitArraySorted = new ArrayList<String>();
		for(int i=0;i<fruitNameXpath.size();i++) {			
			fruitArrayOriginal.add(fruitNameXpath.get(i).getText());
		}
				
		for(String s: fruitArrayOriginal ) {			
			fruitArraySorted.add(s);
		}
		Collections.sort(fruitArraySorted);  //Ascending order
		Collections.reverse(fruitArraySorted); // Descending order
		System.out.println(fruitArrayOriginal);
		System.out.println(fruitArraySorted);	
		Assert.assertTrue(fruitArrayOriginal.equals(fruitArraySorted));
				
//		if(fruitArrayOriginal==fruitArraySorted) {
//			System.out.println("Sorted");
//		}
//		else {
//			System.out.println("UnSorted");
//		}
	}

}
