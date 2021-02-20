package com.gmail.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

public class WriteDatatoPropFile1 {
		
	@Test
	//read the data from the user file and add it map
	public void readData() throws IOException
	{
		HashMap<String, String> map =new HashMap<String, String>();
		BufferedReader reader=new BufferedReader(new FileReader(Constants.currentPrjpath+File.separator+"src\\main\\java\\com\\gmail\\config\\JenkinFile.txt"));
		String line="";
		while((line=reader.readLine())!=null) {
			if(line.split("=").length>1) {
				map.put(line.split("=")[0].trim(), line.split("=")[1].trim());
			}
			
		}
	
		//add the config file to new map
		HashMap<String, String> mapConfg =new HashMap<String, String>();
		reader.close();
		reader=new BufferedReader(new FileReader(Constants.currentPrjpath+File.separator+"src\\main\\java\\com\\gmail\\config\\Config.properties"));
		 line="";
		while((line=reader.readLine())!=null) {
			if(line.split("=").length>1) {
				mapConfg.put(line.split("=")[0].trim(), line.split("=")[1].trim());
			}
			
		}
		
		//comparing Jenkin file and Configfile
		reader.close();
		for(String key:mapConfg.keySet()) {
			if(map.containsKey(key)) {
				mapConfg.put(key, map.get(key));	
			}
		}
		//creating Writing the data in new config file
		FileWriter writer=new FileWriter(Constants.currentPrjpath+File.separator+"replacedConfiguration.properties");
		for(String key:mapConfg.keySet()) {
			writer.write(key+"="+mapConfg.get(key));
			writer.write("\n");
		}
		writer.close();
		
	}

}
