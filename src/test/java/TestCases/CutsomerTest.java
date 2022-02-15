package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObject.PageObjectInterface;


public class CutsomerTest extends BaseClass implements PageObjectInterface{

	
	
	@Test
	public void verifycustomerLink() throws InterruptedException {
			
		
		
		lpobj.enterLoginPassword("admin@yourstore.com", "admin");
		
		lpobj.clickOnlogin();
		
		System.out.println(lpobj.DashboardPageTitle("Dashboard / nopCommerce administration"));
		
		//Thread.sleep(4000);
		custobj.clickOnCustomerLink();
		
		//Thread.sleep(4000);
		
		custobj.clcikOnAddBtn();
		//Thread.sleep(4000);
		
	
		custobj.enterTextFieldForCustomer("Jimmy@gmail.com", "Jimmy", "Jimmy", "Jimmy123", "M", "12/09/1988", "test.pvt", "(Your store name)", "Vendors","Vendor 1", "test");
	
		custobj.clickOnSave();
		
		
		
		System.out.println("test case success");
	}
	
}
