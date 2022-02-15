package TestCases;
import org.testng.Assert;
import org.testng.annotations.*;

import UtilityPackage.Driverutil;

public class BaseClass extends Driverutil {
	
	static String baseURL ="https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"; 
	
	
	@BeforeTest
	public void setup() throws Exception {
		setPropety();
		launchURL(baseURL);	
	}
	
	@AfterTest
	public void EndSession() {
		
		closeSession();
	}
	
//	@BeforeMethod
//	public void launchURL() {
//		
//		launchURL(baseURL);
//	}
//	
//	@AfterMethod
//	public void closeURL() {
//		
//		closeBrowser();
//	}

}
