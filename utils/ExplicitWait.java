package com.gmail.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
		
	public static WebElement ewait(WebDriver driver, By by) {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
	
	

}
