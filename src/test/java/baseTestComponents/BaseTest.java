package baseTestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.LandingPage;

public class BaseTest {
	private LandingPage LandingPage;
	public WebDriver driver;

	public WebDriver driverInitialiazation() throws IOException {
		// properties calss to read global properties
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ravul\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			// System.setProperty("Webdriver.chrome.driver","C:\\Users\\vpachava\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("edge")) {
			// System.setProperty("Webdriver.edge.driver",
			// "C:\\Users\\vpachava\\Documents\\msedgedriver.exe");
			driver = new EdgeDriver();
		} 
		else if (browserName.equals("fireFox"))

		{
			// System.setProperty("Webdriver.gecko.driver","C:\\Users\\vpachava\\Documents\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
	}
	
@BeforeMethod (alwaysRun=true)//this will for groups to run
	public LandingPage LaunchApplication() throws IOException
	{
		driver=driverInitialiazation();
		LandingPage = new LandingPage(driver);
		LandingPage.goTolandingPageURL();
		return LandingPage;
	}


@AfterMethod(alwaysRun=true)//this will for groups to run
public void tearDown()
	{
	driver.close();
	}
}
