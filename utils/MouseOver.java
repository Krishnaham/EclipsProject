package com.gmail.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void mouse(WebDriver driver, By by)
	{
		System.out.println("*****************************************");
		System.out.println("Moving mouse to specified element"+by);
		System.out.println("*****************************************");
		 Actions a = new Actions(driver);
		 a.moveToElement(driver.findElement(by)).build().perform();
		 System.out.println("Moved cursor successfully");
		 System.out.println("**************************************************************");
		 SleepCls.sleepClass(2);
	}

}
