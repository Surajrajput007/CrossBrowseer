package Assignment;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class C {
	public static WebDriver driver;

	@Parameters({ "browserName" })
	public void setup(String browserName) throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		// capabilities.setPlatform(Platform.WIN11);
		// capabilities.setBrowserName("chrome");

		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			System.out.println("Connection Established in Chrome Browser");
		}

		if (browserName.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL("http://loca		driver = new RemoteWebDriver(new URL(\"http://localhost:4444/wd/hub\"),capabilities);lhost:4444"), options);
			System.out.println("Connection Established in Firefox Browser");
		}

		if (browserName.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			System.out.println("Connection Established in Edge Browser");

			driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		}
		
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		;
	}
}