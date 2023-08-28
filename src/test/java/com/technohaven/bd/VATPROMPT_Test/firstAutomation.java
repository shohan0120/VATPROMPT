package com.technohaven.bd.VATPROMPT_Test;

import org.testng.annotations.Test;

public class firstAutomation extends BaseDriver {

	@Test
	public void firstTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("http://192.168.10.15:81/LogIn.aspx");
		Thread.sleep(100000);
	}
}
