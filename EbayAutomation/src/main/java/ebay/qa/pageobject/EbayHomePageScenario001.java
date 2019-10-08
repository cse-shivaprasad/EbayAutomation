package ebay.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePageScenario001 {
	
	public EbayHomePageScenario001(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='gh-ac']")
	public WebElement searchBox;
	
	@FindBy(xpath="//*[@id='gh-btn']")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id='gh-shop-a']")
	public WebElement shopCategoryDropDown;
	
	@FindBy(xpath="//span[contains(@class,'small sel tgl_button last_b')]")
	public WebElement buyItNowLabel;	
	
	@FindBy(xpath="//span[@class='b-breadcrumb__text b-link--tertiary truncate")
	public WebElement categoryBreadCrumtext;
	
	@FindBy(xpath="//*[@class='btn btn-s btn-ter dropdown-toggle']")
	public WebElement bestMatchLink;
	
	@FindBy(xpath="//a[contains(text(),'Lowest price')]")
	public WebElement lowestPriceLink;
	
	@FindBy(xpath="//a[contains(text(),'Highest price')]")
	public WebElement highestPriceLink;
	
	@FindBy(xpath="//span[contains(text(), 'Buy it now')]")
	public WebElement buyItNowTag;	
}