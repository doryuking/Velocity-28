package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class verifyRoomsPage {
	
	private WebDriver driver;
	private RoomsPage roomsPage;
	private LoginPage loginPage;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation software\\Update auto\\chromedriver.exe");		
	    driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openRoomPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openMessengerLink();
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.openRooms();
		
		RoomsPage roomsPage = new RoomsPage(driver);
		//roomsPage.contactToMeHelpCenter();
		
	}
	
	@Test
	public void verifyContactToMeHelpCenterButton() {
		System.out.println("Test1");
		
		roomsPage.contactToMeHelpCenter();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@Test
	public void verifyReturnToMessengerButton() {
		System.out.println("Test2");
		
        roomsPage.goBackToMessenger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("After Method");
		
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class");
		
		driver.close();
	}

}
