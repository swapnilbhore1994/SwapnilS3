package com.bankproject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

public static WebDriver driver;
	
	public void launchWebsite() {
		String projectpath = System.getProperty("user.dir");// To get current directory
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
	}

}

