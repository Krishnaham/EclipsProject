package com.gmail.pages;

import org.openqa.selenium.By;

public class Amadeus_Homepage {
	
	public static By Signin =By.xpath("//a[@data-qa-test='sign_in_button']");
	public static By Email = By.xpath("//div[@id='eMail']/input");
	public static By password =By.id("passwordInput");
	public static By submitbuttom =By.xpath("//button[@type='submit']");
}
