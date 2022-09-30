package Pages;

import org.apache.batik.extension.svg.FlowDivElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAcc {
	
	//Declaration
		@FindBy (xpath = "//input[@name='firstname']") 
		private WebElement firstname;
		
		@FindBy (xpath = "//input[@name='lastname']") 
		private WebElement lastname;
		
		@FindBy (xpath = "//input[@name='reg_email__']") 
		private WebElement email;
		
		@FindBy (xpath = "//input[@name='reg_email_confirmation__']") 
		private WebElement reEmail;
		
		@FindBy (xpath = "//input[@name='reg_passwd__']") 
		private WebElement newPass;
		
		@FindBy (xpath = "//select[@name='birthday_day']") 
		private WebElement day;
		
		@FindBy (xpath = "//select[@name='birthday_month']") 
		private WebElement month;
		
		@FindBy (xpath = "//select[@name='birthday_year']")
		private WebElement year;
		
		@FindBy (xpath = "(//input[@type='radio'])[3]")
		private WebElement customButton;
		
		@FindBy (xpath = "//select[@name='preferred_pronoun']")
		private WebElement pronoun;
		
		@FindBy (xpath = "(//button[text()='Sign Up'])[1]")
		private WebElement signUp;
	

    //Initialization
		public CreateNewAcc(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//Use
		public void sendFirstname() {
			firstname.sendKeys("Doryu");
		}
		
		public void sendLastname() {
			lastname.sendKeys("King");
		}
		
		public void sendEmail() {
			email.sendKeys("doryuking19@gmail.com");
		}
		
		public void sendReEmail() {
			reEmail.sendKeys("doryuking19@gmail.com");
		}
		
		public void sendNewPass() {
			newPass.sendKeys("Doryu The King");
		}
		
		public void clickOnCustomButton() {
			customButton.click();
		}
		
		public void clickOnPronoun() {
			pronoun.click();
		}
		
		public void clickOnSignUp() {
			signUp.click();
		}
		
	
}
