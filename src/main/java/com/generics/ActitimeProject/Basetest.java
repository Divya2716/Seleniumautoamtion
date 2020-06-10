package com.generics.ActitimeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements AutoConstant{

	    public WebDriver driver;
	    
	    @BeforeMethod
	    
	    public void OpenBrowser()
	    {
	        System.setProperty(chrome_key, chrome_value);
	        driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get(url);
	    }

	    @AfterMethod
	    public void CloseBrowser()
	    {
	     //driver.quit();
	    }

}
