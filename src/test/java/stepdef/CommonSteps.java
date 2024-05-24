package stepdef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	private WebDriver driver;
	private String browser = "Chrome";
	
	@Before
	public void setup() {
		
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
	}
	
	
	@After
	public void tearDown() throws Exception{
		
		driver.quit();
		Thread.sleep(1000);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
