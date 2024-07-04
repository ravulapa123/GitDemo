package Seleniumdemo.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdowns {
//STATIC DROP DOWNS
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Implicit wait here waits for 5 seconds of max, if the element finds before 5 seconds it will fetch it.
		//This will take care of synchronization issue
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise");
			
			//for static drop down will have Select tags, hence use the select class in the selenium.
			WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdown =new Select(staticDropdown);
		dropdown.selectByVisibleText("INR");
			
		//use loops for clicking the same button multiple times
		
		driver.findElement (By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		//for vs While loop: if you know number of iterations in advance use for, if need to repeat an action untill a specific condition is is met use while.
		
		for(int i=0; i<4;i++) {
		driver.findElement (By.id("hrefIncAdt")).click();//click 4 times
		Thread.sleep(5000);
/*int i=0;
while(i<4)
{
	driver.findElement (By.id("hrefIncAdt")).click();//click 4 times
	i++;
}*/
		}
	}
	}

