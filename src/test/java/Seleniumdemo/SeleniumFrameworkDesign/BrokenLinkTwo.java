package Seleniumdemo.SeleniumFrameworkDesign;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinkTwo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chome.driver", "C:\\Users\\vpachava\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();//you delete a specific cookie as well.
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//Get all the URLs of the links using selenium
			//Java method will call URLs and gets you the status code
			//if Status code is >400 then that URL is not working and then the link which tied to URL is not working
			List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
			  SoftAssert a =new SoftAssert();

		      for(WebElement link : links)
		      {

		          String url= link.getAttribute("href");

		          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

		          conn.setRequestMethod("HEAD");

		          conn.connect();

		          int respCode = conn.getResponseCode();

		          System.out.println(respCode);

		          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);


		      }
		      a.assertAll();
	}
	}


