package com.gmail.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.gmail.basePackage.BaseCls;
import com.gmail.click.Click;
import com.gmail.pages.CreateReport;
import com.gmail.pages.Login;
import com.gmail.sendkey.EnterTxt;
import com.gmail.utils.ExplicitWait;

public class Test01 extends BaseCls {
	
	Test01() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority = 0)
	public void loginMethd() {
	EnterTxt.sendText(driver, Login.username, "zcsefe4");
	EnterTxt.sendText(driver, Login.password, "SgZh2hGQ");
	Click.clickCls(driver, Login.submitbutton);
	
	
	}
	
	
	}	
		
	
	
