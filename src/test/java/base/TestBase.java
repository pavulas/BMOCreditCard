package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	private static WebDriver driver;
	private static TestBase testBase;

	private TestBase() {
		String strbrowser = "edge";

		if (strbrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (strbrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().deleteAllCookies();
	}

	public static void initDriver() {
		if (testBase == null) {
			testBase = new TestBase();

		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void openURL(String url) {
		driver.get(url);
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		testBase = null;
	}

}
