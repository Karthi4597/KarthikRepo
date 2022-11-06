package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.baseTest;

public class mylisteners implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String scriptname = result.getMethod().getMethodName();
		
	}

}
