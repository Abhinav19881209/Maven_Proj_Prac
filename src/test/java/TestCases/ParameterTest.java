package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	
	@Parameters ({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("open chrome browser--"+Thread.currentThread().getId());
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("open firefox browser--"+Thread.currentThread().getId());
		}else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("open IE browser");
		}else {
			System.out.println("another browser");
		}
		
	}
	
//	@Parameters ({"str"})
	@Test(dataProvider ="ProvideDatatoTC",dataProviderClass=DataProviderClass.class)
	public void login_TestCase(String str,String name) {
		
		System.out.println("Parameter for Logintest--"+str);
		System.out.println("Parameter for Logintest--"+name);
	}

//	@Parameters ({"count"})
//	@Test(dataProvider ="ProvideDatatoTC")
//	public void search_TestCase1(int count) {
//		
//		System.out.println("parameter for search_TestCase1--"+count);
//	}
	
//	@Parameters ({"str1"})
//	@Test(dataProvider ="ProvideDatatoTC")
//	public void search_TestCase2(String str1) {
//		
//		System.out.println("Para for search_TestCase2--"+str1);
//	}
//	
	@Test(dataProvider ="ProvideDatatoTC",dataProviderClass=DataProviderClass.class)
	public void search_TestCase3(String string,String value) {
		
		System.out.println("Para for search_TestCase2--"+string);
		System.out.println("Para for search_TestCase2--"+value);
	}

}
