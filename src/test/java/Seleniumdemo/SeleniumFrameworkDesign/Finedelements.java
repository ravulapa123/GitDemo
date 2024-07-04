package Seleniumdemo.SeleniumFrameworkDesign;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Finedelements {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//Implicit wait here waits for 5 secons of max, if the lement finds before 5 secnods it will fetch it.
	//This will take care of synchonization issue
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rahil");
		driver.findElement(By.name("inputPassword")).sendKeys("22");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//CSS Selector
		    //   tag name.class name
		    //   tag name#Id value
		   //     #ID Value
		   //     .Class Name
		    //   tagname[attribute='value']
		    //      tagname[attribute='value']:nth-child(index)
		//           tagname tagname ()...from parent to child
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("anand");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("anand");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("anand");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234565656");
		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("ABC");
		//Xpath 
		      //tagname[@attribute='value']
		      //tagname[@attribute='value'] [Index)
			  //tagname/tagname[Index]  ...from parent to child
		//driver.close();
		//driver.quit();
	}}	
		