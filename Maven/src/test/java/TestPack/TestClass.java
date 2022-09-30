package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Pages.LoginPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class TestClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation software\\Update auto\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
				
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openMessengerLink();
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.openRooms();
		
		RoomsPage roomsPage = new RoomsPage(driver);
		roomsPage.contactToMeHelpCenter();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
//Verify 		
		driver.get("https://www.facebook.com/");
		
		LoginPage loginPage1 = new LoginPage(driver);
		loginPage1.openMessengerLink();
		
		MessengerPage messengerPage1 = new MessengerPage(driver);
		messengerPage1.openRooms();
		
		RoomsPage roomsPage1 = new RoomsPage(driver);
		roomsPage1.goBackToMessenger();
		
		String url1 = driver.getCurrentUrl();
		String title1 = driver.getTitle();
		
		if(url1.equals("https://www.messenger.com/") && title1.equals("Messenger")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
