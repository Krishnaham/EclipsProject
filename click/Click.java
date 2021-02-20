package com.gmail.click;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gmail.utils.SleepCls;

public class Click {
	
	public static void clickCls(WebDriver driver, By by)
	{
		System.out.println("*****************************************");
		System.out.println("Clicking on the given element"+by);
		System.out.println("*****************************************");
		driver.findElement(by).click();
		System.out.println("Clicked successfully");
		System.out.println("**************************************************************");
		SleepCls.sleepClass(2);
		
	}
	
	public static void clickCheckBox(WebDriver driver, By by)
	{
		System.out.println("*****************************************");
		System.out.println("Clicking on the given element"+by);
		System.out.println("*****************************************");
		WebElement elem=driver.findElement(by);
		if(!elem.isSelected() && elem.isEnabled() && elem.isDisplayed())
			elem.click();
		else
			System.out.println("Element is not in clickbale state");
		System.out.println("Clicked successfully");
		System.out.println("**************************************************************");
		SleepCls.sleepClass(2);
		
	}
	
	public static void clickByJavaScript(WebDriver driver, By by)
	{
		System.out.println("*****************************************");
		System.out.println("Clicking on the given element using hava script: "+by);
		System.out.println("*****************************************");
		WebElement elem=driver.findElement(by);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", elem);
		System.out.println("Clicked successfully through java script");
		System.out.println("**************************************************************");
		SleepCls.sleepClass(2);
		
	}

}
