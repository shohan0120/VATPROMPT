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
		util.InputIdValue("ContentPlaceHolder1_txtUserId", "tcl");
	
		util.InputIdValue("ContentPlaceHolder1_txtPassword", "123");

		
		WebElement login = driver.findElement(By.id("ContentPlaceHolder1_btnLogin"));
		login.click();
		Thread.sleep(1000);
		
		util.selectByVisibleBothText("ContentPlaceHolder1_drpSchema", "Runners Motors Limited");

        
        util.GoButtonId("ContentPlaceHolder1_btnBusinessUnit");
		
		WebElement controlpanel = driver.findElement(By.className("title1"));
		controlpanel.click();
		
		//ADDPARTY
		
		
		util.GoButtonId("MainContent_HyperLink6");  //AddPartyClick button
		Thread.sleep(1000);
		
		util.selectByIdValue("MainContent_drpRegistrationType", "8"); //Registration Type
        
		
        util.InputIdValue("MainContent_txtPartyBIN", "1236547896325"); //Party Bin
        
        
        util.selectByIdValue("MainContent_drpBusinessInfo", "5");      //Business Info
        
        util.InputCssValue("#MainContent_txtPartyName","ABC LTD1");     //Party Name
       
        util.InputnameValue("ctl00$MainContent$txtNationalIdNo", "12345678936985214");  //National Id No

        util.selectRadioButtonByIdValue("MainContent_isVc","isVc");
        
        util.GoButtonId("MainContent_btnSave");
     
        Thread.sleep(50000);
        


        

	}
	
	
}
