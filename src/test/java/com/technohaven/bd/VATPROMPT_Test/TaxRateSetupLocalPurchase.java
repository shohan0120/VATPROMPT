package com.technohaven.bd.VATPROMPT_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TaxRateSetupLocalPurchase extends BaseDriver{

        @Test
        public void GoodsServiceSetupMethod() throws InterruptedException
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


            //Tax Rate Setup - Local Purchsae
            util.GoButtonId("HyperLink3"); //Goods/Service Setup Menu button click
            Thread.sleep(1000);

            util.GoButtonId("MainContent_HyperLink14"); //Tax Rate Setup button click
            Thread.sleep(1000);

            util.selectByIdValue("MainContent_ddlCategory","1237"); //Category Name Dropdown click
            Thread.sleep(1000);

            util.selectByIdValue("MainContent_drpSubCategory","1238"); //Sub-Category Name Dropdown click
            Thread.sleep(1000);

            util.selectByIdValue("MainContent_ddlItemName","22969"); //Item Name Dropdown click
            Thread.sleep(1000);

            util.InputIdValueClear("MainContent_dgvItemTaxCategoryFalse_txtTaxVavue_3","5"); //VAT value Input
            Thread.sleep(1000);

            ///LOCAL PURCHASE DROPDOWN
            util.selectByIdValue("MainContent_drpTransactionType","2"); //Transaction Type Local Purchase select Dropdown click
            Thread.sleep(1000);
            ///LOCAL PURCHASE DROPDOWN


            util.GoButtonId("MainContent_btnSave"); //Save Button click
            Thread.sleep(1000);
        }

    }


