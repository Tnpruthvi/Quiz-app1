package ui;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Listener is working: Test started - " + result.getName());
	}


	
