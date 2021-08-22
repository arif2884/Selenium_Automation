package com.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.AutoPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutoSteps {
	WebDriver driver;
	AutoPage APage;

	@Given("^user go the the automation practic homepage$")
	public void user_go_the_the_automation_practic_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		APage = new AutoPage(driver);

	}

	@When("^user click on the sign in button$")
	public void user_click_on_the_sign_in_button() throws Throwable {

		APage.clickOnTheSignInButton();

	}

	@And("^user enter valid email and password$")
	public void user_enter_valid_email_and_password() throws Throwable {

		APage.enterEmailAndPassword();

	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		APage.clickOnSigninBttn();
	}

	@Then("^user navigate to the welcomepage$")
	public void user_navigate_to_the_welcomepage() throws Throwable {

		APage.navigateToTheWelcomePage();

	}

	@And("^user verify the page title \"([^\"]*)\"$")
	public void user_verify_the_page_title(String args) throws Throwable {

		APage.vrifyThePageTitle();
		String expectedTitle = "My account - My Store";
		String actualTitle = driver.getTitle();
		Assert.assertTrue("title does not match", actualTitle.equals(expectedTitle));

	}

	@Then("^user go to the upper left corner and click on Dresses$")
	public void user_go_to_the_upper_left_corner_and_click_on_Dresses() throws Throwable {

		APage.clickOnDresses();

	}

	@And("^user print all the price values in descending order$")
	public void user_print_all_the_price_values_in_descending_order() throws Throwable {

		APage.printAllPriceInDesending();

	}

	@Then("^user select the second dress from that list$")
	public void user_select_the_second_dress_from_that_list() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + APage.SecondPrice + "')])[2]")).click();

	}

	@Then("^user click on proceed to check out button$")
	public void user_click_on_proceed_to_check_out_button() throws Throwable {
		APage.proceedToCheckOutButton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

	}

	@And("^user verify the total price and the shipping fee on checkout page$")
	public void user_verify_the_total_price_and_the_shipping_fee_on_checkout_page() throws Throwable {

		APage.verifyTotalpriceAndShippingfee();

	}

	@Then("^user sign out$")
	public void user_sign_out() throws Throwable {
		APage.signOut();

	}

	@And("^user close the window$")
	public void user_close_the_window() throws Throwable {
		APage.closeTheWindow();
		driver.close();

	}

}
