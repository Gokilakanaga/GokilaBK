package com.aig.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewLoginPagePOM {

	WebDriver dr ;

	public NewLoginPagePOM(WebDriver Idr)
	{
		this.dr = Idr;

	}

	@FindBy(how = How.XPATH , using = "//input[@id='u_0_j']")
	WebElement frstName;

	@FindBy(how = How.XPATH , using = "//input[@id='u_0_l']" )
	WebElement lstName;

	@FindBy(how = How.XPATH , using = "//input[@id='u_0_o']")
	WebElement phNumber;

	@FindBy(how = How.XPATH , using = "//input[@id='email']")
	WebElement usrnme;

	@FindBy(how = How.XPATH , using = "//input[@id='pass']")
	WebElement pwd;

	@FindBy(how = How.XPATH , using = "//label[@id='loginbutton']")
	WebElement lgnbtn;

	public void facebookLogin(String fName, String lName ,String pNumber) 
	{
		frstName.sendKeys(fName);
		lstName.sendKeys(lName);
		phNumber.sendKeys(pNumber);

	}

	public void fblogn (String usernme, String passwrd)
	{
		usrnme.sendKeys(usernme);
		pwd.sendKeys(passwrd);

	}

	public void lgnbtn()
	{
		lgnbtn.click();

	}

	public void extrpt(ExtentReports report , ExtentTest logs,ITestResult rst)
	{
		report = new ExtentReports("E:\\SELENIUM\\reports\\");
		logs = report.startTest("test+++++++++++++++");

		logs.log(LogStatus.PASS, "opened successfully");

		if(rst.getStatus() == ITestResult.FAILURE)
		{
			String srcpath = utilTest.screenShot(dr,rst.getName());
			String img = logs.addScreenCapture(srcpath);
			logs.log(LogStatus.FAIL, "fail+++++++++++++",img);

		}
		report.endTest(logs);
		report.flush();
		dr.get("E:\\SELENIUM\\reports\\htmlrpt.html");
	}
}
