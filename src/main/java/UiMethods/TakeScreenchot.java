package UiMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UtilityPackage.Driverutil;

public class TakeScreenchot extends Driverutil implements UiOpeartion{
	
	static WebElement element = null;

	 public static WebElement getElement(By elementpath) {
		   
	     element = getDriver().findElement(elementpath);
	   
	   return element;
	   
   }

public  String takeScreenshot(String testStepsName) {
		
		try {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"/TC_Screenshot/"+testStepsName+".png";
		File screenshotDest= new File(path);
		
			FileUtils.copyFile(temp, screenshotDest);
			
			return path;
		} catch (IOException e) {
			System.out.println("Some exception occured." + e.getMessage());
			return "";
		}
				
	}
	
}
