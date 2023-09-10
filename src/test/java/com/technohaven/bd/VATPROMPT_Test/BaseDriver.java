package com.technohaven.bd.VATPROMPT_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	static WebDriver driver = null;
	
	@BeforeSuite
	public void start() {
		
		String browser = System.getProperty("browser", "chrome");
		
		if(browser.contains("chrome")) {
			/*
			 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			 */
			 WebDriverManager.chromedriver().setup();
             ChromeOptions chromeOptions = new ChromeOptions();
             chromeOptions.addArguments(new String[]{"--incognito"});
             chromeOptions.addArguments(new String[]{"window-size=1980,1080"});
             chromeOptions.addArguments(new String[]{"--remote-allow-origins=*"});
             this.driver = new ChromeDriver(chromeOptions);
		}else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
}
