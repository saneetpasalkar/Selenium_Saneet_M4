package com.shoppersStack.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners_utility implements ITestListener,ISuiteListener {
@Override
public void onTestFailure(ITestResult result) {
Java_Utility java=new Java_Utility();
TakesScreenshot ts=(TakesScreenshot) BaseTest.listnerDriver;
File temp=ts.getScreenshotAs(OutputType.FILE);
File dest=new File(FrameworkConstants_Utility.screenshotPath+java.localDateTime()+".png");
try {
	FileHandler.copy(temp, dest);
} catch (IOException e) {
	// TODO: handle exception
	e.printStackTrace();
}

}
	
	
}
