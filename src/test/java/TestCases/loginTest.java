package TestCases;

import static org.testng.Assert.assertEquals;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import PageObject.PageObjectInterface;
import UiMethods.*;


public class loginTest extends BaseClass implements PageObjectInterface{

	
	@Test
	public void verifyTheLoginWithValidCredentials() throws InterruptedException {
		
		Assert.assertTrue(lpobj.loginPageTitle("Your store. Login"));
		
		System.out.println(lpobj.loginPageTitle("Your store. Login"));
		
		lpobj.enterLoginPassword("admin@yourstore.com", "admin");
		
		lpobj.clickOnlogin();
		
		lpobj.navigateToNext();
		Thread.sleep(4000);
		
		System.out.println(lpobj.DashboardPageTitle("Dashboard / nopCommerce administration"));
		//lpobj.DashboardPageTitle("Dashboard / nopCommerce administration");
		//Assert.assertTrue(lpobj.DashboardPageTitle("Dashboard / nopCommerce administration"));
	
	}
	
	
	
	
	
	
}
