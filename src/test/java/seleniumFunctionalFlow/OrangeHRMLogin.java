package seleniumFunctionalFlow;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;
import utils.BrowserChoice;
import utils.ExcelUtils;
import utils.SeleniumHelper;

public class OrangeHRMLogin {
	
	

	
	
	static WebDriver driver;

	static SeleniumHelper sh=new SeleniumHelper();
	
	

	public static void main(String[] args) throws Exception {
		
		ExcelUtils ex=new ExcelUtils();
		BrowserChoice bc=new BrowserChoice();
		
		driver=bc.openBrowser();
		driver.get(ex.readFromProps("url"));
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement lgnBtn=driver.findElement(By.xpath("//button"));
		
		XSSFSheet sht=ex.returnSheetData(System.getProperty("user.dir")+"/src/main/resources/employee.xlsx", "Sheet2");
		
		sh.sendDataTB(driver, uname, sht.getRow(0).getCell(0).toString(), "username text box");
		sh.sendDataTB(driver, pwd, sht.getRow(0).getCell(1).toString(), "password text box");
		sh.performClick(driver, lgnBtn, "username text box");
		
		
		
		Thread.sleep(5000);
		
		bc.quitBrowser(driver);
		

	}

}
