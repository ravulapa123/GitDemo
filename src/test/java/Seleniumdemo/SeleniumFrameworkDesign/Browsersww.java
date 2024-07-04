package Seleniumdemo.SeleniumFrameworkDesign;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsersww {

	public static void main(String[] args) throws InterruptedException {
	
		
		//Selenium Manager: New Pacakge that can handle the below step
	//System.setProperty("Webdriver.gecko.driver", "C:\\Users\\vpachava\\Documents\\geckodriver.exe");	
	//WebDriver driver = new FirefoxDriver();
	
	//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\vpachava\\Documents\\chromedriver.exe");	
	//WebDriver driver = new ChromeDriver();
	
	System.setProperty("Webdriver.edge.driver", "C:\\Users\\vpachava\\Documents\\msedgedriver.exe");	
	WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		//driver.close();
		//driver.quit();

	}

}
