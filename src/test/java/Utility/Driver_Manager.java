package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Manager {
	
	public static WebDriver driver;

	public void set_driver(String browser) {
		if (driver == null) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			}
		}
	}

	public void browser_setting() {
     driver.manage().window().maximize();
	}
	public void close_browser(){
		driver.quit();
		driver = null;
	}

}


