package W6;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{
	@Override
	public void onStart (ITestContext result) {

	}
	@Override
	public void onFinish (ITestContext result) {
		
	}
	@Override
	public void onTestFailure (ITestResult result) {
		System.out.println("The name of the testcase fail: " + result.getName());
	}
	@Override
	public void onTestSkipped (ITestResult result) {
		 System.out.println("The name of the testcase skipped: " + result.getName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
		
	}
	@Override
	public void onTestStart (ITestResult result) {
		System.out.println(result.getName() + "Test case started");
	}
	@Override
	public void onTestSuccess (ITestResult result) {
		System.out.println("The name of the testcase success: " + result.getName());
	}

}
