package dashboard.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dashboard.pages.DashboardPage;

public class DashStepDef {
	WebDriver driver;
	DashboardPage dashpage;
	
	@Given("^user go to Orange Hrm home page$")
	public void user_go_to_Orange_Hrm_home_page() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();    
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		dashpage = new DashboardPage(driver);
		dashpage.enterUsernameAndPassword();
	    
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		dashpage.clickOnLoginButton();   
	    
	}

	@Then("^user navigate to the welcome page$")
	public void user_navigate_to_the_welcome_page() throws Throwable {
	dashpage.verifyWelcomeWord();    
	    
	}

	@Then("^user verify the page title as \"([^\"]*)\"$")
	public void user_verify_the_page_title_as(String title) throws Throwable {
	
	String expected = title;
	String actual = driver.getTitle();
	Assert.assertTrue("title does not match", actual.contains(expected));
	    
	}

	@Then("^user verify username is displays at top right$")
	public void user_verify_username_is_displays_at_top_right() throws Throwable {
	dashpage.verifyUsername();
	    
	}
	@Then("^user logout$")
	public void user_logout() throws Throwable {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dashpage.logout();   
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	driver.close();
	driver.quit();
	}

}
