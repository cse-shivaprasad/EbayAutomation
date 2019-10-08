package ebay.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePageScenario002 {
	
	public EbayHomePageScenario002(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='gh-ac']")
	public WebElement searchBox;
	
	@FindBy(xpath="//*[@id='gh-btn']")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id='gh-shop-a']")
	public WebElement shopCategoryDropDown;
	
	@FindBy(xpath="//span[@class='b-breadcrumb__text b-link--tertiary truncate']")
	public WebElement categoryBreadCrumText;
}