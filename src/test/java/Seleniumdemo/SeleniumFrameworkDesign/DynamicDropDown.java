package Seleniumdemo.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	//use index for dynamic elements
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Implicit wait here waits for 5 secons of max, if the lement finds before 5 secnods it will fetch it.
		//This will take care of synchonization issue
			driver.manage().window().minimize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise");
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click(); 
			//use index for dynamic elements as shown above if some clients do not like use parent child relationships by using Xpath as shown below
			driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AIP'])")).click(); 
			Thread.sleep(2000);
			driver.close();
	}

}
