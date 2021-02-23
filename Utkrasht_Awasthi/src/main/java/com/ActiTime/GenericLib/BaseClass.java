package com.ActiTime.GenericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ActiTime.objectRepository.LoginPage;

public class BaseClass {

	public static  WebDriver driver;
	public DataUtility data = new DataUtility();
	public WebDriverCommonUtils wlib = new WebDriverCommonUtils();
	
	@BeforeSuite
	public void configBS()
	{
	 System.out.println("-------------DataBase Connect");	
	}
	
	@BeforeClass
	public void configBC() throws IOException
	{
	    System.out.println("---------Browser launching starts------------");
	    String browser = data.getDataFromProperty("browser");
	    if(browser.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	    	driver = new ChromeDriver(); 
	    }else if(browser.equals("firefox")) {
	    	System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
	    	driver = new FirefoxDriver();
	    }
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get(data.getDataFromProperty("url"));
	    System.out.println("---------Browser Launch Ends----------");
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		System.out.println("-----------Login Starts-------------");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.login(data.getDataFromProperty("username"), data.getDataFromProperty("password"));
		
		System.out.println("------------Login Ends--------------");
	}
	@AfterMethod
	public void configAM()
	{
		
		
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("-------------Close Browser--------------");
		driver.quit();
	}
	@AfterSuite
	public void configAF()
	{
		System.out.println("-------------Data Disconnect---------------");
	}
}
