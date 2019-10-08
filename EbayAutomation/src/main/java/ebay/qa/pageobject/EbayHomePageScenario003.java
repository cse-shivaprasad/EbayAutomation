package ebay.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePageScenario003 {
	
	public EbayHomePageScenario003(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='gh-ac']")
	public WebElement searchBox;
	
	@FindBy(xpath="//*[@id='gh-btn']")
	public WebElement searchButton;
	
	@FindBy(xpath="//a[@class='pg  curr']")
	public WebElement paginationSection;
	
	@FindBy(xpath="//a[contains(@class,'pg ')]")
	public WebElement paginationGrid;
}