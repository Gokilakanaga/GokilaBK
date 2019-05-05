package com.aig.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import helper.browserFactory;

public class FacebooklogibValidation {

	WebDriver dr = browserFactory.browserFactory("mozilla", "https://www.facebook.com");
	ExtentReports rpt;
	ExtentTest logs;
	ITestResult rst;
	NewLoginPagePOM obj = PageFactory.initElements(dr, NewLoginPagePOM.class);

	@Test
	public void  testExecution()
	{
		//WebDriver dr = browserFactory.browserFactory("mozilla", "https://www.facebook.com");
		dr.manage().window().maximize();





		//obj.facebookLogin("tst", "tst", "231939219");
		obj.fblogn("tst", "tst");
		obj.lgnbtn();
		//obj.extrpt(rpt, logs, rst);

		Assert.assertEquals("facebook", "google");
	}

	@AfterMethod
	public void result(ITestResult rst)
	{

		obj.extrpt(rpt, logs, rst);
		
		/*if(rst.getStatus() == ITestResult.FAILURE)
		{
			String srcpath = utilTest.screenShot(dr,rst.getName());
			String img = logs.addScreenCapture(srcpath);
			logs.log(LogStatus.FAIL, "fail+++++++++++++",img);

		}
		rpt.endTest(logs);
		rpt.flush();
		dr.get("E:\\workspace\\exmple1\\Testextentreport\\reports\\htmlrpt.html");
*/
	}

}
