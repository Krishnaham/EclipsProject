package com.gmail.basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gmail.config.ReadConfFile;

public class BaseCls {
	
	public WebDriver driver=null;
	
	public BaseCls()
	{
		String browser = ReadConfFile.getProperty("browser");
		System.out.println("***********************************************************************************");
		System.out.println("Intializing the Web Driver");
		System.out.println("***********************************************************************************");
		if(browser.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkulkarni2\\eclipse-workspace\\com.gmail\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kkulkarni2\\eclipse-workspace\\com.gmail\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("IE")) {
			 System.setProperty("webdriver.ie.driver", "C:\\Users\\kkulkarni2\\eclipse-workspace\\com.gmail\\Drivers\\IEDriverServer.exe");
				
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Entered browser does not exist");
			System.out.println("***********************************************************************************");
			System.exit(0);
		}
		System.out.println("***********************************************************************************");
		System.out.println("Intializing the Web driver completed");
		setImplicitWait();
		driver.get(ReadConfFile.getProperty("url"));
		driver.manage().window().maximize();

	}

	private void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadConfFile.getProperty("timeout")), TimeUnit.SECONDS);
		
	}


}
