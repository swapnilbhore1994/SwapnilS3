package com.bankproject.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Loginpage extends Base {

	//WebDriver driver;
	
		@BeforeClass
		public void setUp() {
			launchWebsite();
		}
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}
		
		@Test
		public void testTitle() {
			String pageTitle = driver.getTitle();
			if(pageTitle.equalsIgnoreCase("GTPL Bank Home Page")) {
				System.out.println(" we are on correct page");
			}
			else {
				System.out.println("wrong page....");
			}
		}
		
		@Test
		public void testUrl() {
			String pageTitle = driver.getCurrentUrl();
			if(pageTitle.equalsIgnoreCase("https://demo.guru99.com/V1/index.php")) {
				System.out.println(" we are on correct page");
			}
			else {
				System.out.println("wrong page....");
			}
		}

	}

