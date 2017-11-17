package configuration;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listners implements ITestListener {

	

	public void onTestStart(ITestResult result) {


		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("start - onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure");
		
	}	

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("start - onTestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("start -onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {
	
		System.out.println("start-onStart");
	
	}

	public void onFinish(ITestContext context) {
	}
	}

