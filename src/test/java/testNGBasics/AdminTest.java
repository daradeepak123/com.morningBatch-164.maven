package testNGBasics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import utils.BrowserChoice;


public class AdminTest extends BaseClass{
	
	
	
	@BeforeMethod
	public void preConditionOnAdmin()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
	@AfterMethod
	public void postConditionOnAdmin()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
	
	
	@Test(enabled=false)
	public void testMethod()
	{
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	long l=Calendar.getInstance().getTimeInMillis();
        
        File destination = new File("screenshot"+l+".png");
        
        // Copy screenshot to desired location using Java NIO
        try {
			Files.copy(screenshot, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		
	}
	@Test
	public void objectLearn()
	{
		Object o="hello";
		System.out.println(o);
	}
	
	@Test(enabled=false)
	public void testMethod1()
	{
		
		WebElement header=driver.findElement(By.xpath("//h5[text()='System Users']"));
		String headerText=sh.retriveDataFields(driver, header, "header text field");
		System.out.println(headerText);
	}

}
