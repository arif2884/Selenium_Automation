package com.collections;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleCheckBox {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exee");
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://courses.letskodeit.com/practice");
	    driver.manage().window().maximize();
	    
	    
	    //Click on Checkbox
	    //First i stored the all checkboxes into List interface. 
	    //Checkbox is a web-element that is why we stored into web-element type into List.
	    //Find out the size of checkboxes (number of counts) using size() method.
	    //Using For loop and get() method we iterate all checkboxes.
	    //Using click() method we select the checkbox.

	    
	    List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//*[@type='checkbox']"));
	    
	    int size = AllCheckboxes.size();
	    System.out.println(size);
	   
	    for(int i = 0; i<AllCheckboxes.size(); i++) {
	        
	        AllCheckboxes.get(i).click();
	        
	    }
	}
	
	}


