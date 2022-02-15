package UiMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityPackage.Driverutil;

public class JavaScriptExecutorUtility extends Driverutil implements UiOpeartion  {
	
	static WebElement element = null;

	 public static WebElement getElement(By elementpath) {
		   
	     element = getDriver().findElement(elementpath);
	   
	   return element;
	   
  }
	 
	 /*
	  * JavaScriptExecutor provides two methods "executescript" & "executeAsyncScript" to handle.
Executed the JavaScript using Selenium Webdriver.
Illustrated how to click on an element through JavaScriptExecutor, if selenium fails to click on element due to some issue.
Generated the 'Alert' window using JavaScriptExecutor.
Navigated to the different page using JavaScriptExecutor.
Scrolled down the window using JavaScriptExecutor.
Fetched URL, title, and domain name using JavaScriptExecutor.
	  */

}
