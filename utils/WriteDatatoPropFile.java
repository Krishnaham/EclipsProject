package com.gmail.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

public class WriteDatatoPropFile {
		
	@Test
	public void newConfFile() throws IOException
	{
		
		//Reading the file from Jenkinfile and adding it jenkinfile map
		HashMap<String, String> jenkinfile = new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new FileReader(Constants.currentPrjpath+File.separator+"\\src\\main\\java\\com\\gmail\\config\\JenkinFile.txt"));
		String line="";
		
		while((line=br.readLine()) != null)
		{
			if(line.split("=").length>1)
			jenkinfile.put(line.split("=")[0], line.split("=")[1]);
		}
		br.close();
		
		//Reading the file from Config.Properties and adding it confFile map
		HashMap<String, String> confFile =new HashMap<String, String>();
		
		br = new BufferedReader(new FileReader(Constants.currentPrjpath+File.separator+"\\src\\main\\java\\com\\gmail\\config\\Config.properties"));
		line ="";
		while((line=br.readLine())!=null)
		{
			if(line.split("=").length>1)
			confFile.put(line.split("=")[0], line.split("=")[1]);
		}
		
		//Comparing both the maps and adding the data to cofig map
		for(String key:confFile.keySet())
		{
			if(jenkinfile.containsKey(key))
				confFile.put(key, jenkinfile.get(key));
		}
		
		//to write data to new Configfile
		
		FileWriter wr = new FileWriter(Constants.currentPrjpath+File.separator+"\\src\\main\\java\\com\\gmail\\config\\newConffile");
		for(String key:confFile.keySet())
			wr.write(key+"="+jenkinfile.get(key));
			wr.write("\n");
	}
}