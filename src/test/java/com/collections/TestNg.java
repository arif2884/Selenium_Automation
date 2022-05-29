package com.collections;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");

	}

	@Test
	public void verifyPageTitle() {
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);
		Assert.assertEquals(title, "My Store");
	}

	@Test
	public void verifyLogo() {
	boolean logo = driver.findElement(By.cssSelector("#header_logo > a > img")).isDisplayed();
	Assert.assertTrue(logo);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
