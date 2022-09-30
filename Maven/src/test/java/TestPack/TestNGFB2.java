package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePageFB;
import Pages.LoginInFB;

public class TestNGFB2 {
	private WebDriver driver;
	private LoginInFB loginPage;
	private HomePageFB homePage;
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation software\\Update auto\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openFBPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void openLoginPage() {
		System.out.println("Test1");
		LoginInFB loginPage = new LoginInFB(driver);
		loginPage.sendEmail();
		loginPage.sendPassword();
		loginPage.clickOnLogin();
	}
	
	@Test
	public void openHomePage() {
		System.out.println("Test2");
		HomePageFB homePage = new HomePageFB(driver);
		homePage.clickOnCreateButtton();
		homePage.clickOnMessengerTab();
		homePage.clickOnNotificationTab();
	}
	
	@AfterMethod
	public void LogoutFromApplication() {
		System.out.println("After Method");
		System.out.println("LOGOUT");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class");
		driver.close();
	}

}
