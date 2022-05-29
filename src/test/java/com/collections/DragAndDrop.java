package com.collections;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);							
				wait.withTimeout(30, TimeUnit.SECONDS); 			
				wait.pollingEvery(5, TimeUnit.SECONDS) ;			
				wait.ignoring(NoSuchElementException.class);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Element which need to drag
		WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement from1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
		
		// Element where need to drop
		WebElement to = driver.findElement(By.xpath("//*[@class='placeholder']"));
		WebElement to1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		//Using action class for drag and drop
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		act.dragAndDrop(from1, to1).build().perform();
  
	}

}
