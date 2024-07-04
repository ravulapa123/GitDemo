package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTestComponents.BaseTest;
import pageObjects.LandingPage;

public class Errorvalidation extends BaseTest{

	@Test
	public void incorrectPassword() throws IOException, InterruptedException
	{
		LandingPage LandingPage1 =new LandingPage(driver);
		LandingPage1.loginApplication("anshika@gmail.com", "Iamking@32323000");
		Assert.assertEquals(LandingPage.getErrorMessage(),"Incorrect email or password.");
		
		

	}
}
