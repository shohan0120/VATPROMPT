package com.technohaven.bd.VATPROMPT_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SaleGoods extends BaseDriver{

    @Test
    public void SaleGoodsMethod() throws InterruptedException
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

        //SaleGoods
        util.GoButtonId("HyperLink4"); //VAT Transaction Menu button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_HyperLink16"); // বিক্রয় চালানপত্র button click
        Thread.sleep(1000);

        util.selectByIdValue("MainContent_drpRegType","1"); //Registration Type Dropdown select
        Thread.sleep(1000);

        util.selectByIdValue("MainContent_drpParty","9031"); //Customer Name dropdown select
        Thread.sleep(1000);

        util.selectByIdValue("MainContent_drpItem","22969.1"); //Item dropdown select
        Thread.sleep(1000);

        util.InputIdValue("MainContent_txtFinalQuantity","1"); //Quantity textbox Value add
        Thread.sleep(1000);

        util.GoButtonId("MainContent_div_a");//A click event to Add Quantity
        Thread.sleep(1000);

        util.InputIdValueClear("MainContent_txtUnitPrice","70"); //unit Price textbox Value add
        Thread.sleep(1000);

        util.GoButtonId("MainContent_div_a");//A click event to Calculate Price
        Thread.sleep(1000);

        util.GoButtonId("MainContent_btnAdd");//Add Item button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_ClientButton");//Add Payment button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_chkCash");//Add Payment -> Cash checkbox click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_OKButton");//Add Payment -> OK button click
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        util.GoButtonId("MainContent_btnSave");//Add Payment -> Cash checkbox click
        Thread.sleep(1000);


    }
}
