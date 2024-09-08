package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	
	static WebDriver driver;
	@SuppressWarnings({ "deprecation", "deprecation" })
	@Parameters({"browserName"})
	@Test
	public static void amazonBrowserTest(String browserName) throws MalformedURLException {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
			System.out.println("Connection Established in Chrome Browser");
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			 FirefoxOptions options = new FirefoxOptions();
			 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
			 System.out.println("Connection Established in Firefox Browser");
		}
		
		if(browserName.equalsIgnoreCase("edge")) 
		{
		     EdgeOptions options = new EdgeOptions();
		     driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
			 System.out.println("Connection Established in Edge Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
