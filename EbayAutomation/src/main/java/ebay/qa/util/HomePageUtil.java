package ebay.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ebay.qa.factory.BrowserFactory;

public class HomePageUtil {

	public static WebDriver createDriver(String browser) {
		return BrowserFactory.getFactoryInstance().getBrowserInstance(browser);
	}
	
	public static void launchEbayWebsite(WebDriver driver) {
		driver.get("https://www.ebay.co.uk/");
		driver.manage().window().maximize();
	}
	
	public static void searchSpecificItem(String specificItem, WebElement searchBoxElement, WebElement searchButtonElement) {
		WebElement searchBoxWebelement = searchBoxElement;
		searchBoxWebelement.click();
		searchBoxWebelement.sendKeys(specificItem);
		searchButtonElement.click();
	}
	
	
}
