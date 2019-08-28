package ListnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case started and the Test Case details are :"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case successfully passed and the details are :"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case failed and the details are :"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped and the details are :"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
