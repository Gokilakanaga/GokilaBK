package com.aig.mdel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {

	public static WebDriver dr;
	public static WebDriver browserFactory(String brName, String appURL)
	{
		if(brName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\WEBDRIVER\\New folder\\chromedriver.exe");
			dr = new ChromeDriver();
		}
		else if (brName.equalsIgnoreCase("mozilla"))
		{
			
			System.setProperty("webdriver.gecko.driver", "D:\\software\\Selenium\\WEBDRIVER\\geckodriver.exe");
			dr = new FirefoxDriver();
	
		}
		else if (brName.equalsIgnoreCase("IE"))
		{
			
		}
		/*else 
		{
			
		}*/
		dr.get("https://www.facebook.com");
		return dr;
		
	}

}
