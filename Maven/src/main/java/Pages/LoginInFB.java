package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInFB {
//Declaration
	@FindBy (xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement password ;
	
	@FindBy (xpath = "//button[text()='Log In']")
	private WebElement login ;
	

	//Initialization
	public LoginInFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//Actions / use
	public void sendEmail() {
		boolean result = email.isEnabled();
		if(result == true)
		{
			email.sendKeys("8408885416");
		}
		else {
			System.out.println("Email is Disabled");
		}
	}
	public void sendPassword() {
		password.sendKeys("Iluvudoryu");
	}
	public void clickOnLogin() {
		login.click();
	}
	
}
