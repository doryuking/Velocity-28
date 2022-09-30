package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFB {
//Declaration
	@FindBy (xpath = "//div[@aria-label='Create']")
	private WebElement createButton;
	
	@FindBy (xpath = "(//div[@aria-label='Messenger'])[1]")
	private WebElement messengerTab;
	
	@FindBy (xpath = "//a[@aria-label='Notifications']")
	private WebElement notificationTab;
	
	//Initialization
	public HomePageFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void clickOnCreateButtton() {
		createButton.click();
	}
	public void clickOnMessengerTab() {
		messengerTab.click();
	}
	public void clickOnNotificationTab() {
		notificationTab.click();
	}
}
