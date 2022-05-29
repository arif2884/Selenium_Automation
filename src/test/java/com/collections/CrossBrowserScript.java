package com.collections;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserScript {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		// Check if parameter passed as 'chrome'
		if (browser.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		// Check if parameter passed from TestNG is 'firefox'
		else if (browser.equalsIgnoreCase("Firefox")) {
			// create firefox instance
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			WebDriverManager.edgedriver().setup();
			// create Edge instance
			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void testParameterWithXML() {
		driver.get("http://demo.guru99.com/V4/");
		// Find user name
		WebElement userName = driver.findElement(By.name("uid"));
		// Fill user name
		userName.sendKeys("guru99");
		// Find password
		WebElement password = driver.findElement(By.name("password"));
		// Fill password
		password.sendKeys("guru99");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
