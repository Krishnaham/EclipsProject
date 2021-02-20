package com.gmail.test;


import com.gmail.basePackage.BaseCls;
import com.gmail.click.Click;
import com.gmail.sendkey.EnterTxt;
import com.gmail.utils.SleepCls;
import com.gmail.pages.Amadeus_Homepage;
import org.testng.annotations.Test;

public class AmadeusLoginTest extends BaseCls{
	
	AmadeusLoginTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void loginMethod()
	{
		
		Click.clickCls(driver, Amadeus_Homepage.Signin);
		EnterTxt.sendText(driver, Amadeus_Homepage.Email, "kkulkarni307@gmail.com");
		EnterTxt.sendText(driver, Amadeus_Homepage.password, "Login1@341");
		Click.clickCls(driver, Amadeus_Homepage.submitbuttom);
	}
	
	

}
