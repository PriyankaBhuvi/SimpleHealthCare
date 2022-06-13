package com.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageBaseTest {

	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;
	 
    public void initilizeWebDriver (String strUrl) {
  	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace1\\PageFactory\\Driver\\chromedriver.exe");
  	driver = new ChromeDriver();
  	this.setDriver(driver);
  			 	  driver.get(strUrl);
 			  
  			  driver.manage().window().maximize();
    }
 
       
 public void tearDown() {
   	  driver.quit();
     }

     public void implicitlyWait() {
 		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }

}
	
	