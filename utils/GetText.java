package com.gmail.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetText {
	
	public static String getTxt(WebDriver driver, By by) {
		
		WebElement elem = driver.findElement(by);
		
		String str =elem.getText();
		System.out.println(str);
		return str;
		
	}
	
	

}
