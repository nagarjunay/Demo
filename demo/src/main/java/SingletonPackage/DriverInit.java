package SingletonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {
	
	private static DriverInit instanceDriver = null;
	private WebDriver driver;
	
	private DriverInit() {
		
	}
	 
	public WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static DriverInit getInstantce() {
		if(instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;
	}
	
	
}
