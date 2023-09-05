package com.technohaven.bd.VATPROMPT_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoodsServiceSetup extends BaseDriver 
{
	@Test
	public void GOODSSERVICESETUPMETHOD() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("http://192.168.10.15:81/LogIn.aspx");
		
		DriverUtility util = new DriverUtility(driver);
		util.InputIdValue("ContentPlaceHolder1_txtUserId", "tcl");
		
		
		util.InputIdValue("ContentPlaceHolder1_txtPassword", "123");
		
		
		WebElement login = driver.findElement(By.id("ContentPlaceHolder1_btnLogin"));
		login.click();
		
		
		util.selectByVisibleBothText("ContentPlaceHolder1_drpSchema", "Runners Motors Limited");
		
        
        util.GoButtonId("ContentPlaceHolder1_btnBusinessUnit");
        Thread.sleep(1000);
        
		
		//GOODS/SERVICESETUP
		
		
        util.selectById("HyperLink3"); //Goods/ServiceSetup Hover click
        Thread.sleep(1000);

        util.selectById("MainContent_HyperLink4"); //Goods/ServiceSetup Button click
        Thread.sleep(1000);
        
        util.selectById("MainContent_tvwCategoryn6"); //2. AUTOMATION TEST CATEGORY CATEGORY CLICK
        Thread.sleep(1000);
        
        util.selectById("MainContent_btnAddItems"); //2. AUTOMATION TEST CATEGORY Add Items CLICK
        Thread.sleep(2000);
        
		/*
		 * util.selectById("MainContent_drpItemCategory"); //Category Name DropDown Click 
		 * Thread.sleep(2000);
		 */
        
        util.selectByIdValue("MainContent_drpItemCategory","1237"); //Category Name Dropdown value select
        Thread.sleep(2000);
        
        util.InputIdValue("MainContent_txtItemName", "Automation Item 1"); //Item Name TextBox
        Thread.sleep(2000);
        
        util.selectByIdValue("MainContent_drpProductType","F"); //Product Type-> Item-> Goods select
        Thread.sleep(2000);
        
        util.selectByIdValue("MainContent_drpTypeofMsnt","3"); //Measurement Type Dropdown value Select 
        Thread.sleep(2000);
        
        util.selectByIdValue("MainContent_drpUnit","1"); //Unit Dropdown value Select 
        Thread.sleep(2000);
        
        util.selectByIdValue("MainContent_drpHSCode","73"); //HS Code Dropdown Value value Select 
        Thread.sleep(2000);
        
        util.selectById("MainContent_chkIsTruncated"); //Reduced Checkbox click 
        Thread.sleep(2000);
        
        util.selectById("MainContent_btnSave"); //Save Button Click
        Thread.sleep(2000);
        
	}

}
