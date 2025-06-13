package testNGBasics;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import pageObjects.LoginPage;
import utils.BrowserChoice;
import utils.ExcelUtils;
import utils.SeleniumHelper;

public class BaseClass{
	

	

	static WebDriver driver;
	static BrowserChoice bc=new BrowserChoice();
	static SeleniumHelper sh=new SeleniumHelper();
	static ExcelUtils ex=new ExcelUtils();
	
	@BeforeTest
	public void beforeTest() throws Exception
	{
		driver=bc.openBrowser();
		sh.loadURL(driver, ex.readFromProps("url"));
		XSSFSheet sht=ex.returnSheetData(System.getProperty("user.dir")+"/src/main/resources/employee.xlsx", "Sheet2");

		
//		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
//		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
//		WebElement lgnBtn=driver.findElement(By.xpath("//button"));
//		
//		
//		sh.sendDataTB(driver, uname, sht.getRow(0).getCell(0).toString(), "username text box");
//		sh.sendDataTB(driver, pwd, sht.getRow(0).getCell(1).toString(), "password text box");
//		sh.performClick(driver, lgnBtn, "username text box");
		
		LoginPage lp=new LoginPage(driver);
		lp.login(driver, sht.getRow(0).getCell(0).toString(), sht.getRow(0).getCell(1).toString());
		
	}
	
	@AfterTest
	public void afterTest()
	{
		bc.quitBrowser(driver);
	}
	
	
	
	

}
