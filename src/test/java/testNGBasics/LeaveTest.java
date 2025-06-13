package testNGBasics;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.BrowserChoice;
import utils.ExcelUtils;
import utils.SeleniumHelper;

public class LeaveTest extends BaseClass{

	
	

	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		
	}
	
	@AfterMethod
	public void afterMethod()
	{

		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
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
		System.out.println(headerText);
	}
	
	@Test
	public void testMethod1()
	{
		WebElement assignLeave=driver.findElement(By.xpath("//p[text()='Assign Leave']"));
		String headerText=sh.retriveDataFields(driver, assignLeave, "header text field");
		System.out.println(headerText);
	}
	
	@Test
	public void testMethod2()
	{
		WebElement assignLeave=driver.findElement(By.xpath("//p[text()='Leave List']"));
		String headerText=sh.retriveDataFields(driver, assignLeave, "header text field");
		System.out.println(headerText);
	}
	
	@Test
	public void testMethod3()
	{
		
		WebElement assignLeave=driver.findElement(By.xpath("//p[text()='Timesheets']"));
		String headerText=sh.retriveDataFields(driver, assignLeave, "header text field");
		System.out.println(headerText);
	}


}
