package Seleniumdemo.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Thread.sleep(2000);
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			//list all the elements using findelements method and iterate over and select the option using enhanced for loo using break.
			List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
			
			for(WebElement option :options)
			{
				if (option.getText().equalsIgnoreCase("india"))
				{option.click();
				break;
				
				}
			}
			driver.close();
	}

}
