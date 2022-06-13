package com.TesthealthCare;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.genric.PageBaseTest;
import com.healthcare.HomePage;
import com.healthcare.Loginpage;

public class TestHomePage extends PageBaseTest{

	public static void main(String[] args) {
	}
		 private HomePage objHomePage;
		 
		 public void  initilizeWebDriver() {
			 objHomePage=new HomePage();
		
	}
		 @BeforeClass
		 public void getHomePage() {
			 this.initilizeWebDriver("https://ebs4-qa2.simplifyhealthcare.com/");
			 objHomePage.initilizeWebDriver("https://ebs4-qa2.simplifyhealthcare.com/");
			 this.initilizeWebDriver();
}
		 @Test
		   public void getLoginPageInfo() {
			 objHomePage.checkPorttProducts();
			 objHomePage.checkConfigPortfPolio();
			 objHomePage.checkPackageBuild();
			 objHomePage.getcheckModule();
			 objHomePage.getNotification();
			 objHomePage.checkProductsBuild();
			 objHomePage.getQuotes(); 
			 objHomePage.checkAlTasks();
			 objHomePage.checkCompletedTasks();
			 objHomePage.checkOpenTasks();
			 objHomePage.checkQuotesForModeLoad();
			 objHomePage.checkSearchButton();
			 
			 
			 
			 
			 
			 
    }
}













