package ebay.qa.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class PriceCompareUtil {

	public static Double getItemPriceValue(String priceRangeValue) throws Exception{
		if(priceRangeValue != null & priceRangeValue.contains("to")){
			int toIndex = priceRangeValue.indexOf("to");
			return Double.parseDouble(priceRangeValue.substring(1,toIndex).trim());
		}
		else if(priceRangeValue != null){
			return Double.parseDouble(priceRangeValue.substring(1).trim());
		}
		return null;
	}
	
	public static List<Double> getExtractedPriceList(List<WebElement> productPriceElementList) throws Exception{
		List<Double> priceList = new ArrayList<Double>();
		  List<String> originalTextList = new ArrayList<String>();
		  for (WebElement e : productPriceElementList){
			  originalTextList.add(e.getText());
			  priceList.add(PriceCompareUtil.getItemPriceValue(e.getText()));
		  }
		  return priceList;
	}
}
