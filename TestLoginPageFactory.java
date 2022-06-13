package com.TesthealthCare;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.genric.PageBaseTest;
import com.healthcare.Loginpage;

public class TestLoginPageFactory extends PageBaseTest{

	public static void main(String[] args) {
	}
		private Loginpage objLoginPage;
		
		public void  initilizeWebDriver() {
			objLoginPage=new Loginpage();
		
		}
		 @BeforeClass
		 public void getLoginPage() {
			 this.initilizeWebDriver("https://ebs4-qa2.simplifyhealthcare.com/");
			 objLoginPage.initilizeWebDriver("https://ebs4-qa2.simplifyhealthcare.com/");
			 this.initilizeWebDriver();
		 }

	     @Test
	   public void getLoginPageInfo() {
	    	 objLoginPage.setUserName("v-Khushbut");
	    	 objLoginPage.setPassword("Summer@2018#");
	    	 objLoginPage.clickStarted();
	}
	
	
}

