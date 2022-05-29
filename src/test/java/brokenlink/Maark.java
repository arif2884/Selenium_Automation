package brokenlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maark {

	public static void main(String[] args) throws InterruptedException {
//		 String s1="2aabbcbbbadef";    
//	        String substr = s1.substring(3,9); // Starts with 0 and goes to end  
//	        System.out.println(substr);  
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://www.google.com");
		
		
		
		WebElement elem = driver.findElement(By.name("q"));
		elem.sendKeys("Java");
		Select drop = new Select(elem);
		drop.deselectByVisibleText("java compiler");
		
		
		/* List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		//List<WebElement> list = driver.findElements(By.xpath("//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[3]/div/div[2]/div[1]/span")); 
		 
		System.out.println("total number of suggestions in search box:::===>" + list.size());
	
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java online compiler")){
				list.get(i).click();
				break;
			}
			
		}*/
		

	}

}
