package ebay.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ebay.qa.constant.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	private static BrowserFactory factory ; 
	private BrowserFactory() {
		
	}
	
	public synchronized static BrowserFactory getFactoryInstance() {
		if(factory == null) {
			factory = new BrowserFactory();
		}
		return factory;
	}
	public WebDriver getBrowserInstance(String browserType) {
		
		WebDriver webDriver = null;
		if(browserType.equalsIgnoreCase(BrowserType.CHROME)) {
			WebDriverManager.chromedriver().version("76").setup();
			webDriver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase(BrowserType.IE)) {
			WebDriverManager.iedriver().setup();
			webDriver = new InternetExplorerDriver();
		}
		else if(browserType.equalsIgnoreCase(BrowserType.FIREFOX)) {
			WebDriverManager.firefoxdriver().setup();
			webDriver = new FirefoxDriver();
		}
		return webDriver;
	}
}
