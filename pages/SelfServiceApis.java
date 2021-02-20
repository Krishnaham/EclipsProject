package com.gmail.pages;

import org.openqa.selenium.By;

public class SelfServiceApis {
	
	public static By ssa = By.xpath("(//a[@class='menu-item'])[1]");
	public static By air = By.xpath("//span[@data-qa-test='ssp_catalog_menu_item_0_link']");
	public static By fis = By.xpath("//a[contains(@href ,'/self-service/category/air/api-doc/flight-inspiration-search')]");
	public static By rn = By.xpath("//a[contains(text(),'Register now')]");
	public static By firstname= By.id("sr-first-name");
	public static By lastname= By.id("sr-last-name");
	public static By country= By.id("sr-country");
	public static By emailadd= By.id("sr-email-address");
	public static By bussarea= By.id("sr-business-area");
	public static By companyfullname= By.id("sr-full-company-name");
	public static By password= By.id("sr-password");
	public static By confpassword= By.id("sr-password-confirm");
	public static By text= By.id("sr-captcha-text");
	public static By tandc= By.xpath("//input[@type='checkbox']");
	public static By createaccount= By.xpath("//button[contains(text(),'Create account')]");
	public static By gettxt= By.xpath("//form[@id='sr-form-container']/ul/li/span");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
