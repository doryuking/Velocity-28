package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePageFB;
import Pages.LoginInFB;


public class TestClassFB {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation software\\Update auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		LoginInFB loginPage = new LoginInFB(driver);
		loginPage.sendEmail();
		loginPage.sendPassword();
		loginPage.clickOnLogin();
		
		HomePageFB homePage = new HomePageFB(driver);
		homePage.clickOnCreateButtton();
		homePage.clickOnMessengerTab();
		homePage.clickOnNotificationTab();
	}

}
