package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.Assert;

@Listeners(TestCases.ListenerTest.class)
public class ParallelTestCases {
	
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
	
	@Test
	public void login_TestCase() {
		
		Assert.assertTrue(true);
		System.out.println("login TC--"+Thread.currentThread().getId());
		System.out.println();
	}


	@Test
	public void search_TestCase1() {
		
		Assert.assertTrue(false);
	}
	
	@Test
	public void search_TestCase2() {
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void search_TestCase3() {
		
		Assert.assertTrue(false);
	}
	
	@Test
	public void search_TestCase4() {
		
		Assert.assertTrue(true);
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close the browser--"+Thread.currentThread().getId());;
	}
	
}
