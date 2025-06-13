package testNGBasics;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.DashBoardPage;
import utils.BrowserChoice;
import utils.ExcelUtils;
import utils.SeleniumHelper;

public class DashBoardTest extends BaseClass{


	DashBoardPage db;
	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		db=new DashBoardPage(driver);
		db.clickDBTab(driver);
		
	}
	
	@AfterMethod
	public void afterMethod()
	{

		db.clickDBTab(driver);
	}
	
	
	@Test
	public void assignLeaveButtonTest() throws Exception
	{
		WebElement assignLeaveButton=driver.findElement(By.xpath("//button[@title='Assign Leave']"));
		sh.performClick(driver, assignLeaveButton, "");
		
	}
	
	@Test
	public void testMethod()
	{
		WebElement header=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		String headerText=sh.retriveDataFields(driver, header, "header text field");
		Assert.assertEquals(headerText, "Dashboard");
	}
	
	@Test
	public void testMethod1()
	{
		WebElement assignLeave=driver.findElement(By.xpath("//p[text()='Assign Leave']"));
		String headerText=sh.retriveDataFields(driver, assignLeave, "header text field");
		Assert.assertEquals(headerText, "Assign Leave");
	}
	
	@Test
	public void testMethod2()
	{
		WebElement assignLeave=driver.findElement(By.xpath("//p[text()='Leave List']"));
		String headerText=sh.retriveDataFields(driver, assignLeave, "header text field");
		Assert.assertEquals(headerText, "Leave List");
	}
	
	@Test
	public void testMethod3()
	{
		
		WebElement assignLeave=driver.findElement(By.xpath("//p[text()='Timesheets']"));
		String headerText=sh.retriveDataFields(driver, assignLeave, "header text field");
		Assert.assertEquals(headerText, "Timesheets");
	}


}
