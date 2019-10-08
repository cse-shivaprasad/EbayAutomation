package ebay.qa.stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebay.qa.constant.BrowserType;
import ebay.qa.factory.BrowserFactory;
import ebay.qa.pageobject.EbayHomePageScenario001;
import ebay.qa.pageobject.EbayHomePageScenario002;
import ebay.qa.pageobject.EbayHomePageScenario003;
import ebay.qa.util.HomePageUtil;
import ebay.qa.util.PriceCompareUtil;
import ebay.qa.util.ScreenshotUtil;


public class ResultStepDefinition {
	
	private Logger logger = LoggerFactory.getLogger(ResultStepDefinition.class);
	
	private WebDriver driver;
	
	private EbayHomePageScenario001 scnario001Page;
	private EbayHomePageScenario002 scnario002Page;
	private EbayHomePageScenario003 scnario003Page;
	
	
	//===================    Scenario - 1 ======================================================================== 
	
	@Given("^I am a non-registered customer And I navigate to www.ebay.co.uk in browser \"(.*)\"$")
	public void navigateToEbayWebsite(String browser) {
		logger.debug("Navigating to ebay.co.uk");
		driver = BrowserFactory.getFactoryInstance().getBrowserInstance(browser);
		scnario001Page = new EbayHomePageScenario001(driver);
		HomePageUtil.launchEbayWebsite(driver);
	}
	
   @When("^I search for an item \"(.*)\"$")
   public void searchForItem(String searchItem)
   {
	   logger.debug("Searching for specific item "+searchItem);
	   
	   HomePageUtil.searchSpecificItem(searchItem, scnario001Page.searchBox, scnario001Page.searchButton);
	   
	   logger.debug("Obtained Search Result  "+searchItem);
   }
   
   @Then ("^I get a list of matching results for item \"(.*)\"$")
   public void listMatchingResults(String searchItem) throws Exception{
	   
	   String actualSeachedItem = driver.findElement(By.xpath("//b[contains(text(),'"+searchItem+"')]")).getText();
	   
	   Assert.assertEquals(actualSeachedItem, searchItem);
	   
	   logger.debug("Validated the search text from the label on UI "+searchItem);
   }
   
   @Then("^Resulting items cards show: postage price, No of bids, price or show BuyItNow tag$")
   public void verifyTagsAndLabels() throws Exception{
	   
	   WebElement webElement = scnario001Page.buyItNowLabel;
	   
	   Assert.assertNotNull(webElement);
	   
	   logger.debug("Validated the 'Buy it now' from the label on UI ");
   }
   
  @Then("^I can sort the results by Lowest Price And the results are listed in the page in the correct order$")
  public void sortWithLowestPrice() throws Exception
  {
	  scnario001Page.bestMatchLink.click();
	  scnario001Page.lowestPriceLink.click();
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0, 300);");
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> productPriceElementList = driver.findElements(By.xpath("//span[@class=' bold prRange']"));
	  List<Double> extractedPricesList = PriceCompareUtil.getExtractedPriceList(productPriceElementList);
	  logger.debug("Original textList "+extractedPricesList);
	  
	  List<Double> sortedPrices = new ArrayList<Double>(extractedPricesList);
	  Collections.sort(sortedPrices);
	  logger.debug("Sorted List "+sortedPrices);
	 
	  Assert.assertEquals(sortedPrices,extractedPricesList);

	  ScreenshotUtil.takeScreenshoot(driver, "SortWithLowestPrice.jpeg");
	  logger.debug("Clicked on Lowest Price link from UI ");
  }
  
  
  @Then("^I can sort the results by Highest Price And the results are listed in the page in the correct order$")
  public void sortWithHighestPrice() throws Exception{
	  scnario001Page.bestMatchLink.click();
	  scnario001Page.highestPriceLink.click();
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0, 1150);");
	  ScreenshotUtil.takeScreenshoot(driver, "SortWithHighestPrice.jpeg");
	  logger.debug("Clicked on Highest Price link");
  }
  
  @Then("^I can filter the results by 'Buy it now' And all the results shown in the page have the 'Buy it now' tag$")
  public void filterWithBuyitNow() throws Exception{
	  scnario001Page.buyItNowTag.click();
	  Assert.assertTrue(scnario001Page.buyItNowTag.isDisplayed());
	  logger.debug("Validated Buy in now label from UI");
  }
  
  //===================    Scenario -2 ========================================================================  
  
  @Given("^I am a non-registered customer And I navigate to www.ebay.co.uk to do category specific search in browser")
  public void navigateToEbayWebsiteForCategorySpecificSearch() {
	  	driver = BrowserFactory.getFactoryInstance().getBrowserInstance(BrowserType.CHROME);
		scnario002Page = new EbayHomePageScenario002(driver);
		HomePageUtil.launchEbayWebsite(driver);
		logger.debug("Executing the scenario 2 and launching the ebay portal");
	}

  @When("^I enter a search term and select a specific Category \"(.*)\"$")
  public void searchForCategory(String category) throws Exception
  {
	  scnario002Page.shopCategoryDropDown.click();
	  driver.findElement(By.xpath("//a[contains(text(), '"+category+"')]")).click();	
	  
	  ScreenshotUtil.takeScreenshoot(driver, "CategorySearchScenario.jpeg");
	  
	  logger.debug("Searched for specific category item "+category+" and screenshot captured");
  }
  
  @Then("^I get a list of matching results And I can verify that the results shown as per the the selected category \"(.*)\"$")
  public void filterBasedonCategory(String category) throws Exception{
	 
	  //String categoryExtracted = driver.findElement(By.xpath("//span[@class='b-breadcrumb__text b-link--tertiary truncate']")).getText();
	  String categoryExtracted = scnario002Page.categoryBreadCrumText.getText();
	  Assert.assertEquals(category, categoryExtracted);
	  logger.debug("Validated the category "+category+" extracted from the UI");
  }

  
  
//===================    Scenario -3 ======================================================================== 
  
  @Given("^I am a non-registered customer And I navigate to www.ebay.co.uk to search a specific item$")
	public void navigateToEbayWebsiteForSpecificItem() {		
	  driver = BrowserFactory.getFactoryInstance().getBrowserInstance(BrowserType.CHROME);
	  scnario003Page = new EbayHomePageScenario003(driver);
	  HomePageUtil.launchEbayWebsite(driver);
	  logger.debug("Launching the browser for the scenario 2");
	}
	
  @When("^I search for a specific item \"(.*)\"$")
  public void searchForSpecificItem(String specificSearchItem)
  {
	  	HomePageUtil.searchSpecificItem(specificSearchItem, scnario003Page.searchBox, scnario003Page.searchButton);
	    logger.debug("Searching for a specific item "+specificSearchItem);
  }
 
  @Then("^I get a list of matching results And the results show more than one page$")
  public void listMultiplePageMatchingResults() throws Exception{
	 WebElement element = scnario003Page.paginationSection;
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", element);
	 Thread.sleep(1000);
	 
	 logger.debug("Validating the pagination scenario");
  }
 
  @Then("^the user can navigate through the pages to continue looking at the items$")
  public void navigateToNextPage() {
	 
	 List<WebElement> multiplePageElements = driver.findElements(By.xpath("//a[contains(@class,'pg ')]"));
	  for(int i =0 ; i<multiplePageElements.size(); i++) {
		  if(i == 1) {
			  multiplePageElements.get(i).click();
			  return;
		  }
	  }
	  Assert.assertTrue(multiplePageElements.size() > 1);
	  
	  logger.debug("Checked multiple pages links by clicking on next page and counting the total pages");
  }
 
  @After
  public void tearDown() {
	  driver.close();
  }
}


