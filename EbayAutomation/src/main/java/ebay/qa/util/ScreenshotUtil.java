package ebay.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static void takeScreenshoot(WebDriver webdriver,String filePath) throws IOException
	{
		TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(filePath);
		FileUtils.copyFile(srcFile, destFile);		
	}
}
