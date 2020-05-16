package com.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/26808/sl-vs-wi-2nd-t20i-west-indies-tour-of-sri-lanka-2020");
		WebElement table = driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();		//
//		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
//		
//		for(int i=0;i<count-2;i++)
//		{
//			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
//		}
		int calcTotal = 0;
		//element by by child index
		List<WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		for (int i=0;i<rows.size()-2;i++)
		{
			//System.out.println(rows.get(i).getText());
			calcTotal = calcTotal+Integer.parseInt(rows.get(i).getText());
			
		}
		int extra = Integer.parseInt(table.findElement(By.cssSelector("[id='innings_1'] [class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
		int actualTotal = Integer.parseInt(table.findElement(By.cssSelector("[id='innings_1'] [class='cb-col cb-col-8 text-bold text-black text-right']")).getText());
		//Another way by siblings traverse sibling to sibling
		System.out.println("By Siblings Extras: "+driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println("By Siblings Total: "+table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		int totalSum = extra+calcTotal;
		System.out.println("Actual Total: "+actualTotal+" Calculated Total: "+totalSum);
		if (totalSum == actualTotal) 
		{
			System.out.println("Both Total Matched Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
	

}
