package com.gmail.test;

import org.testng.annotations.Test;

import com.gmail.basePackage.BaseCls;
import com.gmail.click.Click;
import com.gmail.pages.SelfServiceApis;
import com.gmail.sendkey.EnterTxt;
import com.gmail.utils.GetText;
import com.gmail.utils.MouseOver;
import com.gmail.utils.SleepCls;

public class SelfServiceAPITest extends BaseCls{
	
	@Test
	public void ssaTest()
	{
		MouseOver.mouse(driver, SelfServiceApis.ssa);
		Click.clickCls(driver, SelfServiceApis.air);
		Click.clickCls(driver, SelfServiceApis.fis);
		Click.clickCls(driver, SelfServiceApis.rn);
		EnterTxt.sendText(driver, SelfServiceApis.firstname, "Krishna");
		EnterTxt.sendText(driver, SelfServiceApis.lastname, "Kulkarni");
		EnterTxt.sendText(driver, SelfServiceApis.country, "India");
		EnterTxt.sendText(driver, SelfServiceApis.emailadd, "kkulkarni307@gmail.com");
		EnterTxt.sendText(driver, SelfServiceApis.bussarea, "Airport");
		EnterTxt.sendText(driver, SelfServiceApis.companyfullname, "Harman");
		EnterTxt.sendText(driver, SelfServiceApis.password, "Login@1234");
		EnterTxt.sendText(driver, SelfServiceApis.confpassword, "Login@1234");
		EnterTxt.sendText(driver, SelfServiceApis.text, "lsdlskmf");
		
		Click.clickByJavaScript(driver, SelfServiceApis.tandc);
		Click.clickByJavaScript(driver, SelfServiceApis.createaccount);
		String actualText=GetText.getTxt(driver, SelfServiceApis.gettxt);
		
		
		
		
		
		
		
		
		
		
	}

}
