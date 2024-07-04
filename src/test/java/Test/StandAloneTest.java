package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseTestComponents.BaseTest;
import pageObjects.LandingPage;
import baseTestComponents.Retry;

public class StandAloneTest extends BaseTest{

	@Test(groups = {"submitOrder"}, retryAnalyzer = Retry.class)
	public void submitOrder() throws IOException, InterruptedException
	{
		LandingPage LandingPage1 =new LandingPage(driver);
		LandingPage1.loginApplication("anshika@gmail.com", "Iamking@000");
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		// below we are using java stream for filtering and selecting the products.
		WebElement prod = products.stream().filter(product -> 
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		driver.findElement(By.cssSelector("li[class='totalRow'] button[type='button']")).click();
	
	Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();

	}
	
	@Test (dataProvider="getData")//(dependsOnMethods= {"submitOrder"} ...this test runs after the above test case
	public void incorrectPassword2(HashMap<String,String> input)
	{
		LandingPage LandingPage1 =new LandingPage(driver);
		LandingPage1.loginApplication(input.get("email"),input.get("password"));
		
		Assert.assertEquals(LandingPage.getErrorMessage(),"Incorrect email or password.");
	
	}
		
	@DataProvider 
	public Object[][] getData()
	{
	HashMap<String, String> map=new HashMap<String, String>();
	map.put("email", "anshika@gmail.com");
	map.put("password", "Iamking@32323000");
	
	return new Object[][] {{map}};
	}

	}


