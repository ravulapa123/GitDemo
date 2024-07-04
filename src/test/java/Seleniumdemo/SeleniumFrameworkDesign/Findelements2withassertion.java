package Seleniumdemo.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Findelements2withassertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Implicit wait here waits for 5 secons of max, if the lement finds before 5 secnods it will fetch it.
		//This will take care of synchonization issue
			driver.manage().window().minimize();
			driver.get("https://rahulshettyacademy.com/locatorspractice");
			driver.findElement(By.id("inputUsername")).sendKeys("rahil");
			driver.findElement(By.name("inputPassword")).sendKeys("22");
			driver.findElement(By.className("signInBtn")).click();
			// only in Xpath not in CSs you can traverse from sibling to parent or parent to siblling
			    //header/div/button[1]following-sibling::button[1]
			    //header/div/button[1]/patent::div
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.cssSelector("p.error")).getText(), "* Incorrect username or password");
			driver.navigate().back();
			driver.navigate().forward();

	}

}
