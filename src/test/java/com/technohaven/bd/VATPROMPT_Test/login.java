package com.technohaven.bd.VATPROMPT_Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class login extends BaseDriver {
@Test

	public void userLogin() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("http://192.168.10.15:81/LogIn.aspx");
		
		DriverUtility util = new DriverUtility(driver);
		util.InputeIdValue("ContentPlaceHolder1_txtUserId", "tcl");
	
		util.InputeIdValue("ContentPlaceHolder1_txtPassword", "123");

		
		WebElement login = driver.findElement(By.id("ContentPlaceHolder1_btnLogin"));
		login.click();
		Thread.sleep(1000);
		
		util.selectByVisibleBothText("ContentPlaceHolder1_drpSchema", "Runners Motors Limited");

        
        WebElement gotobutton = driver.findElement(By.id("ContentPlaceHolder1_btnBusinessUnit"));
		gotobutton.click();
		
		WebElement controlpanel = driver.findElement(By.className("title1"));
		controlpanel.click();
		
		//ADDPARTY
		
		
		WebElement addparty = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[6]"));
		addparty.click();
		Thread.sleep(1000);
		
		
		WebElement registrationType = driver.findElement(By.id("MainContent_drpRegistrationType"));
        Select select2 = new Select(registrationType);
        select2.selectByValue("4"); 
        
		
        util.InputeIdValue("MainContent_txtPartyBIN", "1236547896325");
    
        
        
		WebElement businessInfo = driver.findElement(By.id("MainContent_drpBusinessInfo"));
		Select select3 = new Select(businessInfo);
        select3.selectByValue("5");
        
        
        WebElement partyName = driver.findElement(By.id("MainContent_txtPartyName"));
        partyName.click();
        partyName.sendKeys("ABC LTD");
        Thread.sleep(20000);

        

	}
	
	
}
