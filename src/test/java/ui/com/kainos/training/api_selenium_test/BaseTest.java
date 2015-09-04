package ui.com.kainos.training.api_selenium_test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ui.com.kainos.training.api_selenium_test.pages.HomePage;
import ui.com.kainos.training.api_selenium_test.pages.LoginFailed;
import ui.com.kainos.training.api_selenium_test.pages.LoginPage;

public class BaseTest {
	
	protected static WebDriver driver;
	protected static LoginPage loginPage;
	protected static HomePage homePage;
	protected static LoginFailed loginFailed;
	
	@BeforeClass
	public static void setUpWebDriver() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginFailed = new LoginFailed(driver);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
