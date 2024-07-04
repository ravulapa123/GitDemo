package Seleniumdemo.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinksSoftAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chome.driver", "C:\\Users\\vpachava\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//Get all the URLs of the links using selenium
			//Java method will call URLs and gets you the status code
			//if Status code is >400 then that URL is not working and then the link which tied to URL is not working
			List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
			
			for (WebElement link :links)
			{
		System.out.println(link.getText()+ link.getAttribute("href"));
	}

	}}
