package automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static String browser = "edge";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		
		
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		// System.out.println(driver.getPageSource());
		driver.quit();
	}
}
