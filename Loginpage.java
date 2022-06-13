package com.healthcare;

import org.openqa.selenium.By;

import com.genric.PageBaseTest;

public class Loginpage extends PageBaseTest {
	

	
	By inpUsername=By.xpath("//input[@name='UserName']");
	By inpPassword=By.xpath("//input[@name='Password']");
	By btnGetStarted=By.xpath("//button[@type='submit']");


	public void setUserName(String strUserName) {
		getDriver().findElement(inpUsername).sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		getDriver().findElement(inpUsername).sendKeys(strPassword);
	
}
	public void clickStarted() {
		getDriver().findElement(inpUsername).sendKeys();
		
}
	
}