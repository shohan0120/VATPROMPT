package com.technohaven.bd.VATPROMPT_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PurchaseGoods extends BaseDriver{

    @Test
    public void PurchaseGoodsMethod() throws InterruptedException
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

        //LocalPurchaseGoods
        util.GoButtonId("HyperLink4"); //VAT Transaction Menu button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_HyperLink4"); // ক্রয় চালানপত্র button click
        Thread.sleep(1000);

        util.selectByIdValue("MainContent_drpRegType","1"); //Registration Type Dropdown click
        Thread.sleep(1000);

        util.selectByIdValue("MainContent_drpParty","9029"); //Supplier Name Dropdown click
        Thread.sleep(1000);

        util.InputIdValue("MainContent_txtChallanNo","Automation Challan 1"); //Ref.Challan No 6.3 value Input
        Thread.sleep(1000);

        util.selectByIdValue("MainContent_drpItem","22969"); //Item Dropdown select
        Thread.sleep(1000);

        util.InputIdValue("MainContent_txtQuantity","10"); //Quantity value Input
        Thread.sleep(1000);

        util.GoButtonId("MainContent_part_a");//A click event to Add Quantity
        Thread.sleep(1000);

        util.InputIdValue("MainContent_txtPurchaseUnitPrice","51"); //Unit Price value Input
        Thread.sleep(1000);

        util.GoButtonId("MainContent_part_a");//A click event to calculate price
        Thread.sleep(1000);

        util.GoButtonId("MainContent_msgBox_btnOK"); //Unit Price Difference OK button Click

        util.GoButtonId("MainContent_btnAdd");//Add Item button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_ClientButton");//Add Payment button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_chkCash");//Add Payment -> Cash checkbox button click
        Thread.sleep(1000);

        util.GoButtonId("MainContent_OKButton");//Add Payment -> OK button click
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        util.GoButtonId("MainContent_btnSave");//Add Payment -> Save button click
        Thread.sleep(10000);



    }
}
