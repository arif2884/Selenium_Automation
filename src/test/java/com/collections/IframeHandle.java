package com.collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {
	
	public static void main(String[] args) {	
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	
	int size=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total number of Iframe is : "+size);
	
	driver.switchTo().frame("frame1");
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("This text captured from an Iframe: "+text);
	//Or
//	driver.switchTo().frame("frame1");
//	WebElement element=driver.findElement(By.xpath("(//h1[contains(text(),'This is a sample page')])[1]"));
//	System.out.println(element.getText());
	
	driver.switchTo().defaultContent();
	
	driver.close();

}
}
