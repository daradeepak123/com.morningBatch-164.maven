package testNGBasics;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.EntitleMentPage;
import pageObjects.LeavePage;

public class LeaveTest2 extends BaseClass{
	
	LeavePage lp;
	EntitleMentPage emp;
	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		lp=new LeavePage(driver);
		emp=new EntitleMentPage(driver);
		lp.clickleaveMenu(driver);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		lp.clickleaveMenu(driver);
		
	}

	
	@Test
	public void validateEntitleMent()
	{
		lp.clickReportsMenu(driver);
		lp.clickEntitleMent(driver);
		
		emp.retriveTitleOfPage();
		
	}
	
	
	
	
	
	
}
