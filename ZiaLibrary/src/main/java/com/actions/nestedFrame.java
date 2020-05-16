package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frameset")).size());
	//	driver.switchTo().frame(0);		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame("frame-top");
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector("frame[name='frame-top']")).getText());
		driver.switchTo().defaultContent();
	}

}
