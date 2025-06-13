package utils;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	
	public static Logger log= LogManager.getLogger(SeleniumHelper.class);
	
	public void chekBoxCheck(WebDriver driver, WebElement ele)
	{
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		boolean b=ele.isSelected();
		if(flag)
		{
			if(!b)
			ele.click();	
			log.info("Checked checkbox");
		}
		else
		{
			log.error("not able to  Check checkbox");
			System.out.println("this webelement is not displayed or enabled");
		}
	}
	
	
	public void loadURL(WebDriver driver, String URL)
	{
		driver.get(URL);
	}

	
	public void dropDownByVisibleText(WebDriver driver, WebElement dw,String visibleText)
	{
		
		boolean flag=dw.isDisplayed();
		flag&=dw.isEnabled();
		if(flag) {
		
		Select sel=new Select(dw);
		sel.selectByVisibleText(visibleText);
		log.info("selected value from the dropdown is "+visibleText);
		}
		else
		{
			log.error("not able to deal dropdown "+visibleText);
			System.out.println("Drowdown is not selected");
		}
	}


	public void performClick(WebDriver driver, WebElement ele, String eleDetails){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.click();
			log.info("clicked "+ eleDetails);
		}
		else
		{
			log.error("not clicked "+ eleDetails);
			System.out.println(eleDetails+ "this webelement is not displayed or enabled");
		}


	}
	
	public void sendDataTB(WebDriver driver, WebElement ele,String data, String eleDetails){
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.clear();
			ele.sendKeys(data);
			log.info("sent data to text box "+ eleDetails);
		}
		else
		{
			log.error("data not sent "+ eleDetails);
			System.out.println(eleDetails+ "this webelement is not displayed or enabled");
		}


	}
	
	
	public String retriveDataFields(WebDriver driver, WebElement ele, String eleDetails){
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		String data="";
		if(flag)
		{
			log.info("retrived text is  "+ data);
			return data=ele.getText();
			
		}
		else
		{
			log.error("not able to retrive the text "+ eleDetails);
			System.out.println(eleDetails+ "this webelement is not displayed or enabled");
		}

		return data;
	}
	
	
	


}
