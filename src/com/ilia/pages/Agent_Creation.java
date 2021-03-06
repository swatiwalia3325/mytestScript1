package com.ilia.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Agent_Creation {
	

	public static void ButtonOnclick(WebDriver driver, String xpath) throws Exception {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	@Before
	public static void fillTextBox(WebDriver driver, String xpath, String input) {
		driver.findElement(By.xpath(xpath)).sendKeys(input);
		
	}
	@Test
	public static void timeOut(WebDriver driver, Integer time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	
	

}
