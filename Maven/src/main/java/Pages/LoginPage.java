package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	private WebDriverWait wait;
    //Declaration	
		@FindBy (xpath = "//input[@type='text']") 
		private WebElement email;
		
		@FindBy (xpath = "//input[@type='password']") 
		private WebElement password;
		
		@FindBy (xpath = "//button[text()='Log In']") 
		private WebElement logIn;
		
		@FindBy (xpath = "//a[text()='Create New Account']") 
		private WebElement createNewAcc;
		
		@FindBy (xpath = "//a[text()='Messenger']") 
		private WebElement messengerLink;
  
	//Initialization
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			//this.driver = driver;
			wait = new WebDriverWait(driver, 20);
		}
		
	//Use
		public void sendEmail() {
			email.sendKeys("doryuking19@gmail.com");
		}
		
		public void sendPassword() {
			password.sendKeys("Doryu The King");
		}
		
		public void clickOnLogin() {
			logIn.click();
		}
		
		public void clickOnCreateNewAcc() {
			//WebDriverWait wait = new WebDriverWait(driver, 20); //ise global declare kardia & constructor me b likha h 
			wait.until(ExpectedConditions.visibilityOf(createNewAcc));
			createNewAcc.click();
		}
		
		public void openMessengerLink() {
			messengerLink.click();
		}
	
	//We Can Also Written In Other Way
	public void loginFacebook() {
		email.sendKeys("doryuking19@gmail.com");
		password.sendKeys("Doryu The King");
		logIn.click();
		createNewAcc.click();
	}
}
