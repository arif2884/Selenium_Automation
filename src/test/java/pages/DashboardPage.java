package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@name='txtUsername']")
	private static WebElement username;
	
	@FindBy (xpath = "//*[@id='txtPassword']")
	 WebElement password;
	
	@FindBy (xpath = "//*[@value='LOGIN']")
	private static WebElement loginBtn;
	
	@FindBy (xpath= "//*[contains(@id,'welcome')][position()=1]")
	private static WebElement welcomeWord;
	@FindBy (xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b")
	private static WebElement admin;
	@FindBy (xpath = "//*[@id='searchSystemUser_userType']")
	private static WebElement userrole;
	@FindBy (xpath = "//*[@class='searchbutton']")
	private static WebElement search;
	@FindBy (xpath = "//*[contains(text(),'Dominic.Chase')]")
	private static WebElement name;
	@FindBy (xpath = "//*[contains(text(),'Logout')]")
	private static WebElement logoutBtn;


	public void enterUsernameAndPassword() {
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		
	}

	public  WebElement getUserrole() {
		return userrole;
	}

	public  void setUserrole(WebElement userrole) {
		DashboardPage.userrole = userrole;
	}

	public void clickOnLoginButton() {
		loginBtn.click();
		
	}

	public void verifyWelcomeWord() {
		String expected = "Welcome";
		String actual = welcomeWord.getText().trim();
		Assert.assertTrue("Word does not match", actual.contains(expected));
		
	}

	public void verifyUsername() {
		String expected = "Welcome";
		String actual = welcomeWord.getText().trim();
		Assert.assertTrue("Word does not match", actual.contains(expected));
		
		
	}
	public void clickOnAdminTab() {
		
		admin.click();
	}

	public void searchBttn() {
		search.click();
		
	}
	public void userVerifyAdminName() {
		
		String expected = "Dominic.Chase";
		String actual = name.getText().trim();
		System.out.println("this name from admin list: "+actual);
		Assert.assertTrue("Word does not match", actual.contains(expected));
		
	}

	public void logout() {
		welcomeWord.click();
		logoutBtn.click();
		
	}






	
		
	

}
