package com.gmail.sendkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gmail.utils.SleepCls;

public class EnterTxt {
	
	public static void sendText(WebDriver driver,By by,String text)
	{
		System.out.println("Enterning Text :" + text );
		System.out.println("************************************************");
		driver.findElement(by).sendKeys(text);
		SleepCls.sleepClass(2);
	}

}
