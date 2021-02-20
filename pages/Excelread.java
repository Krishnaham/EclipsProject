package com.gmail.pages;

import java.io.File;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gmail.config.ReadConfFile;
import com.gmail.utils.Constants;
import com.gmail.utils.exRead;

public class Excelread {
	
	@Test(dataProvider="dataprovider")
	public void test(String username, String pwd) {
		System.out.println("User name: " +username);
		System.out.println("Password: " +pwd);
	}
	
	@DataProvider(name="dataprovider")
	public  Object[][] readData(){
		
	ArrayList<String> data1= new ArrayList<String>();
	ArrayList<String> data= exRead.excelRead(Constants.currentPrjpath+File.separator+"Datafiles"+File.separator+ReadConfFile.getProperty("excelFileName"), ReadConfFile.getProperty("excelSheetName"));
	
	
	for(String d:data)
	{
		if(d.contains("yes")) {
			data1.add(d.split("yes")[0]);
		}
	}
		Object[][] obj = new Object[data1.size()][data1.get(0).split("\\|").length];
		System.out.println(data1);
		
		int count =0;
		
		for(String d1:data1)
		{
			for(int i=0;i<d1.split("\\|").length;i++) 
			{
			obj[count][i]=d1.split("\\|")[i];
			}count++;
		}
	
	return obj;
	
}
}
