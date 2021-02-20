package com.gmail.utils;

public class SleepCls {
	
	public static void sleepClass(int seconds){
		
		System.out.println("************************************************");
		System.out.println("Sleeping for "+seconds+" seconds");
		System.out.println("************************************************");
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
