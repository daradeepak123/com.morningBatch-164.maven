package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovy.transform.Final;
import utils.SeleniumHelper;

public class LeavePage {
	SeleniumHelper sh=new SeleniumHelper();
	WebDriver ldriver;
	public LeavePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Reports ']")
	WebElement reportsMenu;
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement leaveTab;
	
	@FindBy(xpath="//a[text()='Leave Entitlements and Usage Report']")
	WebElement entitleMent;
	
	
	public void clickleaveMenu(WebDriver driver)
	{
		sh.performClick(driver, leaveTab, "leave tab");
	}
	
	public void clickReportsMenu(WebDriver driver)
	{
		sh.performClick(driver, reportsMenu, "reports menu");
	}
	
	public void clickEntitleMent(WebDriver driver)
	{
		sh.performClick(driver, entitleMent, "entitlement sub tab");
	}

}
