package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumHelper;



public class AdminPage {
	WebDriver ldriver;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement uName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//button")
	WebElement lgnBTN;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	WebElement fPassword;
	
	SeleniumHelper sh=new SeleniumHelper();
	
	
	
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	public void login(WebDriver driver,String unameTxt,String pwdTxt)
	{
		sh.sendDataTB(driver, uName, unameTxt, "username text box");
		sh.sendDataTB(driver, pwd, pwdTxt, "password text box");
		sh.performClick(driver, lgnBTN, "login button");
	}
	
}
