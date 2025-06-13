package utils;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChoice {
	
	public void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	public static WebDriver driver;
	public WebDriver openBrowser() throws Exception {
		ExcelUtils ex=new ExcelUtils();
		
		String browser=ex.readFromProps("browser");
		
		
		if(browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equals("ff"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
		
	}

}
