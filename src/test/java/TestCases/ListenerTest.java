package TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * ITestListener has following methods

OnStart- OnStart method is called when any Test starts.
onTestSuccess- onTestSuccess method is called on the success of any Test.
onTestFailure- onTestFailure method is called on the failure of any Test.
onTestSkipped- onTestSkipped method is called on skipped of any Test.
onTestFailedButWithinSuccessPercentage- method is called each time Test fails but is within success percentage.
onFinish- onFinish method is called after all Tests are executed.
 */


public class ListenerTest implements ITestListener {
	
	@Override		
    public void onFinish(ITestContext Result) 					
    {		
		System.out.println("Test Finished");		
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
            System.out.println("Test Started");		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :"+Result.getName());					
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }		

	
	

}
