package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web");
		Thread.sleep(3000);
		WebElement source =  driver.findElement(By.id("fromPlaceName"));
		source.clear();
		source.sendKeys("BENG");
		Thread.sleep(2000);
		source.sendKeys(Keys.DOWN);
	//	source.sendKeys(Keys.DOWN);
		System.out.println(source.getText());
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//if double qoute inside a double quote then use back slash
		String script = "return document.getElementByxpath(\"//input[@id='fromPlaceName']\").value;";
	//	String script = "return document.getElementById(\"fromPlaceName\").value;"; 
		String text = (String) js.executeScript(script);
		System.out.println("TEXT IS: "+text);
//		Boolean flag = true;
//		while (flag) {
//			source.sendKeys(Keys.DOWN);
//			if (((String) js.executeScript(script)).contains("AIRPORT")) {
//				flag = false;
//				System.out.println((String) js.executeScript(script));
//				
//			}
//		}		
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			i++;
			source.sendKeys(Keys.DOWN);
			//Thread.sleep(1000);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i>10) {
				break;
			}
		}
		if(i>10) {
			System.out.println("Element Not found");
		}
		else {
			System.out.println("Element found");
		}

	}

}
