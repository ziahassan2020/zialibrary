package com.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

public class childWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://accounts.google.com/signin");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(ParentId);
		System.out.println(driver.getTitle());

	}

}
