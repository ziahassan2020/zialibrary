package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ssl {

	public static void main(String[] args) {
		// SSL Certification
		//Capabilities are General chrome profiles
		DesiredCapabilities dc = DesiredCapabilities.chrome();
	//	dc.acceptInsecureCerts(); // this browser has a knowledge to accept certificates.this profile accepts insecure https certificate
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//belongs to local browser
		ChromeOptions c = new ChromeOptions(); 
		//now passing chrome profile to existing chrome options
		c.merge(dc); //merging a profile into your actual local browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
	}

}
