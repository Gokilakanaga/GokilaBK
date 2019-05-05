package com.aig.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class utilTest {

	@Test
	public static String screenShot(WebDriver dr,String scrnme)
	{
		try 
		{
			TakesScreenshot tkescrsht = (TakesScreenshot) dr;
			File src = tkescrsht.getScreenshotAs(OutputType.FILE);
			String dst = "E:\\workspace\\exmple1\\Testextentreport\\reports\\"+scrnme+".png";

			File dstntn = new File(dst);
			FileUtils.copyFile(src, dstntn);
			return dst;
		} 
		
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}

		
	}

}
