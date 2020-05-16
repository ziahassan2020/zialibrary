package com.globalVariable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class getFromFile {
	
	public WebDriver driver=null;
	
	@Test
	public void Login() throws IOException {
		System.out.println("***");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ziaha\\git\\SeleniumAutomationOnline\\SeleniumAutomationOnline\\src\\main\\java\\com\\globalVariable\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		if (prop.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			//driver = new InternetExplorerDriver();
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}

}
