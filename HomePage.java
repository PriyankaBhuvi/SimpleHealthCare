package com.healthcare;


import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.genric.PageBaseTest;

public class HomePage extends PageBaseTest{
	
	
    By getPorttProducts=By.xpath("//div[@class='pull-left cardtitle']");
    By getConfigPortfPolio=By.xpath("//div[@class='bluetext']");
    By getProductsBuild=By.xpath("//a[@role='presentation']");
    By getPackageBuild=By.xpath("//a[@data-toggle='tab']");
    By checkModule=By.xpath("//div[@class='pull-right mr56 carousalpagination']");
    By getNotifications=By.xpath("//div[@class='bellnotification centeredmsg']");
    By getQuotes=By.xpath("//h1[@class='page-title fnt18medium']");
    By checkSearchButton = By.xpath("//button[@class='btn toggle-btn']");
    By getDashBoardRepots =By.xpath("//a[@id='executivedashBoard']");
    By checkSelectForModeLoad = By.xpath("//select[@id='drpViewModeLoad']");
    By checkTasks = By.xpath("//div[@class='fnt18medium p-0 mt20 mb15 mt15']");
    By checkOpenTasks = By.xpath("//input[@id='chkOpenTasks']");
    By checkCompletedTasks = By.xpath("//input[@id='chkCompletedTasks']");
    By checkAlTasks = By.xpath("//input[@id='chkAllTasks']");
    
   public void checkPorttProducts() {
	   getDriver().findElement(getConfigPortfPolio).click();

}
    public void checkConfigPortfPolio() {
    	Actions actions = new Actions(getDriver());
   WebElement element =getDriver().findElement(getConfigPortfPolio);
   element.click();
   actions.moveToElement(element);
   
    }
    
    public void checkProductsBuild() {
    	getDriver().findElement(getPackageBuild).click();
    	
    }
    
    public void checkPackageBuild() {
    	getDriver().findElement(getPackageBuild).click();
    	
    }
    
    public void getcheckModule() {
    	getDriver().findElement(checkModule).click();

    }
    
    public void getNotification() {
    	getDriver().findElement(getNotifications).click();
    	
    }
    
    public void getQuotes() {
    	Actions actions = new Actions(getDriver());
    	WebElement quotes =getDriver().findElement(getQuotes);
    	quotes.click();
        actions.moveToElement(quotes);
    }
    
    public void checkSearchButton() {
		getDriver().findElement(checkSearchButton).click();
	
		WebElement elementSearch = getDriver().findElement(checkSearchButton);
		elementSearch.sendKeys("Search");
		elementSearch.click();
	}
    
    public void getDashBoardRepots() {
  	   getDriver().findElement(getDashBoardRepots).click();
}
    	
    public void checkQuotesForModeLoad() {
    	WebElement element = getDriver().findElement(checkSelectForModeLoad);
		Select selectLoad = new Select(element);
		selectLoad.selectByVisibleText("Summary");
   }
		
    public void checkOpenTasks() {
    	getDriver().findElement(checkOpenTasks).click();

    }
    public void checkCompletedTasks() {
    	getDriver().findElement(checkCompletedTasks).click();
}  	
    public void checkAlTasks() {
    	getDriver().findElement(checkAlTasks).click();
  }
    
  }