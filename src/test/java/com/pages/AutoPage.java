package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutoPage {
	static String SecondPrice;

	public AutoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(how = How.XPATH,using = "//*[@class='login']")
	private static WebElement SignIn;
	
	@FindBy(how = How.XPATH,using = "//*[@id='email']")
	private static WebElement Email;
	
	@FindBy(how = How.XPATH,using = "//*[@name='passwd']")
	private static WebElement Passwprd;
	
	@FindBy(how = How.XPATH,using = "//*[@id='SubmitLogin']")
	private static WebElement Signinbtn;
	
	@FindBy(how = How.XPATH,using = "//*[@class='navigation_page']")
	private static WebElement myAccountWord;
	
	@FindBy(how = How.XPATH,using = "(//*[contains (text(),'Dresses')])[5]")
	private static WebElement dresses;
	
	
	@FindBy(how = How.XPATH,using = "//*[@class='product-desc']/following-sibling::div[1]")
	private static List<WebElement> AllPrices;
	
//	@FindBy(how = How.XPATH,using = "(//*[contains(text(),'"+SecondPrice+"')])[2]")
//	private static WebElement SecondItem;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'Proceed to checkout')]")
	private static WebElement AddToCart;
	
	@FindBy(how = How.XPATH,using = "//*[@id='total_price']")
	private static WebElement verify;
	
	
	public void clickOnTheSignInButton() {
	SignIn.click();	
		
	}

	public void enterEmailAndPassword() {
		Email.sendKeys("gmarif2884@gmail.com");
		Passwprd.sendKeys("08071517");	
	}

	public void clickOnSigninBttn() {
		Signinbtn.click();	
	}

	public void navigateToTheWelcomePage() {
		String expected = "My account";
		String actual = myAccountWord.getText().trim();
		Assert.assertTrue("Word does not match", actual.equals(expected));
		
		
	}
	public void vrifyThePageTitle() {
		
		
	}

	public void clickOnDresses() {
		dresses.click();
		
		
	}

	public void printAllPriceInDesending() {
		ArrayList<String> NewList = new ArrayList<String>();
		for(int i=0; i<AllPrices.size();i++) {
			NewList.add(AllPrices.get(i).getText().toString());
			
		}
		Collections.sort(NewList, Collections.reverseOrder());
		System.out.println("List of prices in sorted order: "+NewList);
		String SecondPrice = NewList.get(1);
		System.out.println("Price of the second dress" +SecondPrice);
	}

	public void selectTheSecondDress() {
		//SecondItem.click();

		
		
	}

	public void clickOnAddToCart() {
		AddToCart.click();
		
	}

	public void verifyTotalpriceAndShippingfee() {
		
		
	}






	}

