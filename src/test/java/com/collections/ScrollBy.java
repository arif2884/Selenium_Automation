package com.collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		 
		//Finding an element using the selenium webdriver and highlighting it
		WebElement emailTxt = driver.findElement(By.id("opentab"));  
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", emailTxt); 
		
		// Finding an element using the selenium webdriver and change the background color.
		String javascript = "document.getElementById('opentab').style.background='blue'";  
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;  
		jsExecutor1.executeScript(javascript); 
		
		//Scrolling a webpage
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");

	}

}
