package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents{
WebDriver driver;
//create a constructor, that is the first method to execute and best place to write initialization code for driver
	public LandingPage(WebDriver driver)
	{
		//driver initialization
		super(driver);
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	//PageFactory
	@FindBy(id="userEmail")
	WebElement useremailElement;
	
	@FindBy(id="userPassword")
	WebElement passwordElement;
	
	@FindBy(id="login")
	WebElement submitButton;
	
	@FindBy(css="[class*='flyInOut']")
	static
	WebElement errorMessage;


	public void loginApplication(String email, String password)
	{
		useremailElement.sendKeys(email);
		passwordElement.sendKeys(password);
		submitButton.click();
}
	public void goTolandingPageURL()
	{
		driver.get("https://rahulshettyacademy.com/client");
}
	public static String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	
}
