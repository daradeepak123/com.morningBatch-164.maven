package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovy.transform.Final;
import utils.SeleniumHelper;

public class DashBoardPage {
	SeleniumHelper sh=new SeleniumHelper();
	WebDriver ldriver;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement DBTab;
	
	@FindBy(xpath="//h6")
	WebElement header;
	
	public DashBoardPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickDBTab(WebDriver driver)
	{
		sh.performClick(driver, DBTab, "DB tab");
	}
	
	
	public void retHeader()
	{
		String data=sh.retriveDataFields(ldriver, header, "this is header");
		System.out.println(data);
	}
	
}
