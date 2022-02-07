package Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver = null;

	@BeforeMethod
	public void initialize() throws IOException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver"); 
		driver = new ChromeDriver();
		 

		/*System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
		driver = new FirefoxDriver();*/

		// To maximize browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// To open the Drata page
		driver.get("https://drata.com/");
	}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
	}
}
