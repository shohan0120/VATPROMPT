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
	
	public void selectById(String Id) {
		WebElement button = driver.findElement(By.id(Id));
		button.click();
     }
	public void InputeIdValue(String id, String inputValue) {
		WebElement element = driver.findElement(By.id(id));
		element.click();
		element.sendKeys(inputValue);
	}
	public void selectByIdValue(String id, String value) {
		WebElement dropdownElement = driver.findElement(By.id(id));
        Select select = new Select(dropdownElement);
        select.selectByValue(value);
	}
	public void selectByIdText(String id, String visibleText) {
		WebElement dropdownElement = driver.findElement(By.id(id));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);
	}
	
	public void selectByVisibleBothText(String visibleText1, String visibleText2) {
		WebElement dropdownElement = driver.findElement(By.id(visibleText1));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText2);
     }
	
	

	
	
}