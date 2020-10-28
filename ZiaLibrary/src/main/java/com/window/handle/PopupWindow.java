package com.window.handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindow {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		WebElement click = driver.findElement(By.xpath("//*[text()='Click Here']"));
		click.click();
		click.click();
		click.click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandle = driver.getWindowHandles();
		int i=0;
		for(String handle:allHandle){
			if(!handle.equalsIgnoreCase(parentHandle)) {
				System.out.println("Handle: "+handle);
				driver.switchTo().window(handle).findElement(By.xpath("//*[@name='emailid']")).sendKeys("abcd "+i);
				i++;
			}
		}
		for(String handle:allHandle) {
			driver.switchTo().window(handle).close();
			Thread.sleep(3000);
		}
		driver.quit();

	}

}
