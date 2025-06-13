package stepDefinetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import utils.BrowserChoice;

public class LoginTestDef {
	static WebDriver driver;
	static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Given("User opens desired browser")
	public void user_opens_desired_browser() throws Exception {
		
		BrowserChoice bc=new BrowserChoice();
		driver=bc.openBrowser();
		driver.get(url);
		
	}

	@And("User performs login")
	public void user_performs_login() {
		LoginPage lp=new LoginPage(driver);
		lp.login(driver, "Admin", "admin123");
	   
	}

	@Then("User validates is login succesful")
	public void user_validates_is_login_succesful() {
		
		DashBoardPage db=new DashBoardPage(driver);
		db.retHeader();
		   
	}

	@Then("User closes the browser")
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	

}
