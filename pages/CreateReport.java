package com.gmail.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.sl.usermodel.ObjectData;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.gmail.config.ReadConfFile;
import com.gmail.utils.Constants;
import com.gmail.utils.ExcelReder;

public class CreateReport {
	
	
@Test(dataProvider="testprovider")
public void test(String username,String pwd) {
	System.out.println("username is: "+username);
	System.out.println("password is: "+pwd);
}


@DataProvider(name="testprovider")
public Object[][] excelData()
{
	
	ArrayList<String> data1=new ArrayList<String>();
	ArrayList<String> data=ExcelReder.fileReader(Constants.currentPrjpath+File.separator+"Datafiles"+File.separator+ReadConfFile.getProperty("excelFileName"),ReadConfFile.getProperty("excelSheetName"));
	for(String d:data) {
		if(d.contains("yes")) {
			data1.add(d.split("yes")[0]);
		}
	}
	
	Object[][] obj=new Object[data1.size()][data1.get(0).split("\\|").length];
	int count=0;
	for(String d1:data1) {
		for(int i=0;i<d1.split("\\|").length;i++) {
			obj[count][i]=	d1.split("\\|")[i];
		}
		count++;
	}
	return obj;
	
}

}
