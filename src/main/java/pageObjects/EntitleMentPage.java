package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.SeleniumHelper;

public class EntitleMentPage {
	
	WebDriver ldriver;
	public EntitleMentPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	SeleniumHelper sh=new SeleniumHelper();
	@FindBy(xpath="//h5")
	WebElement title;
	
	public void retriveTitleOfPage()
	{
		String data=sh.retriveDataFields(ldriver, title, "title");
		Assert.assertEquals(data, "Leave Entitlements and Usage Report");
	}
	
	
	
	

}
