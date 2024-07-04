package Seleniumdemo.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
			driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
			
			//Count of number of Check boxes: select the common tag for all the check boxex and use find elements and size.
			System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
			System.out.println(driver.findElements(By.tagName("a")).size());
			/*In this example, we navigate to a web page, collect all the links using driver.findElements(By.tagName(“a”)), and 
			then iterate through each link. We used the HttpURLConnection class to check the response status of each link’s URL. 
			If the response code is 200, the link is considered valid; otherwise, it’s marked as a broken link*/
	}

}
