package com.collections;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		 //Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Page properly loaded or not
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		//Fluent wait
	     FluentWait<WebDriver> wait1 = new FluentWait<>(driver);
	      //Specify the timout of the wait
	      wait1.withTimeout(Duration.ofSeconds(10));
	      //Sepcify polling time
	      wait1.pollingEvery(Duration.ofSeconds(2));
	      //Specify what exceptions to ignore
	      wait1.ignoring(StaleElementReferenceException.class);
								
	
	}

}
