package Seleniumdemo.SeleniumFrameworkDesign;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshot {
	
		public static void main(String[] args) throws MalformedURLException, IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chome.driver", "C:\\Users\\vpachava\\Documents\\chromedriver.exe");
			//ChromeOptions options =new ChromeOptions();//for running proxy, handle sssl certifications issues
			//options.setAcceptInsecureCerts(true);
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				driver.manage().window().maximize();
				//driver.manage().deleteAllCookies();//you delete a specific cookie as well.
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
				File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
          }}