package com.technohaven.bd.VATPROMPT_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverUtility {

	private WebDriver driver;
	private WebElement element;
	
	
	
	public DriverUtility(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void GoButtonId(String Id) {
		WebElement button = driver.findElement(By.id(Id));
		button.click();
     }
	
	public void selectById(String Id) {                        //For Finding Id & Click
		WebElement button = driver.findElement(By.id(Id));
		button.click();
     }
	public void InputIdValue(String id, String inputValue) {    //For TextBox
		WebElement element = driver.findElement(By.id(id));
		element.sendKeys(inputValue);
	}	
	public void InputnameValue(String name, String inputValue) {    //For TextBox
		WebElement element = driver.findElement(By.name(name));
		element.sendKeys(inputValue);
	}
		public void InputCssValue(String css, String inputvalue) {       //For TextBox CSS
			WebElement element = driver.findElement(By.cssSelector(css));
			element.sendKeys(inputvalue);
	}
	public void selectByIdValue(String id, String value) {       //For Dropdown Id
		WebElement dropdownElement = driver.findElement(By.id(id));
        Select select = new Select(dropdownElement);
        select.selectByValue(value);
	}
    
        
	public void selectByIdText(String id, String visibleText) {     //For Dropdown
		WebElement dropdownElement = driver.findElement(By.id(id));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);
	}
	
	public void selectByVisibleBothText(String visibleText1, String visibleText2) {    //For Dropdown
		WebElement dropdownElement = driver.findElement(By.id(visibleText1));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText2);
     }
	
	public void selectRadioButtonByIdValue(String id, String value) {    //For RadioButton
		WebElement radioButton = driver.findElement(By.id("MainContent_isVc")); // Party Type RadioButton
	       String selectedValue = radioButton.getAttribute("isVc");
	       radioButton.click();
     }
	
	

	
	
}