package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTest {


	@Test(priority =3,groups = { "Group 1" })
	public void testexample1() {
	
		System.out.println("Test 1--"+Thread.currentThread().getId());
		
	}
	
	@Test(priority =0,groups = { "Group 2" })
	public void testexample2() {
	
		System.out.println("Test 2--"+Thread.currentThread().getId());
		
	}
	
//	@Test(priority =0,groups = { "Group 1" })
//	public void testexample3() {
//	
//		System.out.println("Test 3");
//		
//	}
//	
//	@Test(priority =0,groups = { "Group 2" })
//	public void testexample4() {
//	
//		System.out.println("Test 4");
//		
//	}
//	
//	@Test(priority =0,groups = { "Group 1" })
//	public void testexample5() {
//	
//		System.out.println("Test 5");
//		
//	}
//	
//	@Test(priority =0,groups = { "Group 2" })
//	public void testexample6() {
//	
//		System.out.println("Test 6");
//		
//	}
//
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
