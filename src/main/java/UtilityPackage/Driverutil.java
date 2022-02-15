package UtilityPackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Driverutil {
	
	static WebDriver driver;
	//static WebDriverWait wait;
	
//	public static void setPropety() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinav.Abhinav-PC\\Desktop\\drivers\\New\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	}
 
   public static WebDriver getDriver() {
    	return driver;
    }
   
	public static void setPropety() throws Exception {
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinav.Abhinav-PC\\Desktop\\Selenium\\chromedriver_New.exe");
		driver = new ChromeDriver();
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
   
   	@SuppressWarnings("deprecation")
	public static WebDriverWait setWaitDriver() {
 		
   		WebDriverWait wait = new WebDriverWait(driver,10);
 		return wait;
 	}
   	
	 public static void launchURL(String URL) {
		 
		 getDriver().get(URL);
	 }


	public static void closeBrowser() {
		getDriver().close();
	
	}
	

	public static void closeSession() {
		getDriver().quit();
	
	}
}
