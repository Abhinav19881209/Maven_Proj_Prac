package TestCases;

import org.testng.annotations.Test;

public class ExmapleTest2 {

	@Test(priority =1,groups = { "Group 2" })
	public void testexample1() {
	
		System.out.println("Test a--"+Thread.currentThread().getId());
		
	}
	
	@Test(priority =0,groups = { "Group 1" })
	public void testexample2() {
	
		System.out.println("Test b--"+Thread.currentThread().getId());
		
	}
	
//	@Test(priority =0,groups = { "Group 3" })
//	public void testexample3() {
//	
//		System.out.println("Test c");
//		
//	}
//	
//	@Test(priority =0,groups = { "Group 5" })
//	public void testexample4() {
//	
//		System.out.println("Test d");
//		
//	}
//	
//	@Test(priority =0,groups = { "Group 2" })
//	public void testexample5() {
//	
//		System.out.println("Test e");
//		
//	}
//	
//	@Test(priority =0,groups = { "Group 1" })
//	public void testexample6() {
//	
//		System.out.println("Test f");
//		
//	}

//	@BeforeTest
//	public void testBefore1() {
//		
//		System.out.println("Before Test");
//		
//	}
//	
//	@AfterTest
//	public void testAfter1() {
//		
//		System.out.println("after Test");
//		
//	}
//	
//	@BeforeMethod
//	public void methodBefore1() {
//		
//		System.out.println("Before method");
//		
//	}
//	
//	@AfterMethod
//	public void methodAfter1() {
//		
//		System.out.println("After method");
//		
//	}
	


	
	
}
