package com.gmail.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.gmail.utils.Constants;

public class ReadConfFile {
	
	public static Properties prop =null;
	
	public static String getProperty(String key)
	{
		if(prop==null)
		{
			prop= new Properties();
		try {
			prop.load(new FileReader(Constants.currentPrjpath+File.separator+"src/main/java/com/gmail/config/Config.properties"));
			return prop.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		
		}
		}
		else {
			return prop.getProperty(key);
		}
	}

}
