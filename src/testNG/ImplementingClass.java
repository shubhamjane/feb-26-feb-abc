package testNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementingClass extends OrangeHMR implements ITestListener{
	CaptureScreenShot ref;
	@Override
	public void onTestFailure(ITestResult result) {
		ref = new CaptureScreenShot();
		String name = result.getName();
		try {
			ref.capture(driver, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		ref = new CaptureScreenShot();
		String name = result.getName();
		try {
			ref.capture(driver, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
