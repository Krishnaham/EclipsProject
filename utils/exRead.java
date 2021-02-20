package com.gmail.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exRead {
	
	public static ArrayList<String> excelRead(String filepath, String sheetname)
	{
		ArrayList<String> list =new ArrayList<String>();		
		try {
			FileInputStream file = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			int lastrow = sheet.getLastRowNum();
			int lastcol = sheet.getRow(1).getLastCellNum();
			for(int r=1;r<=lastrow;r++)
			{
				String rowData="";
				Row row=sheet.getRow(r);
				for(int c=0;c<lastcol;c++)
				{
					Cell cell=row.getCell(c);
					switch(cell.getCellType())
					{
					case STRING: System.out.print(cell.getStringCellValue());
					rowData+=cell.getStringCellValue()+"|";
					break;
					case NUMERIC: System.out.print(cell.getNumericCellValue());
					rowData+=cell.getNumericCellValue()+"|";
					break;
					case BOOLEAN: System.out.print(cell.getBooleanCellValue());
					rowData+=cell.getBooleanCellValue()+"|";
					break;				
					}
					
						
				}
				
				list.add(rowData);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The data returning from excel reader is: "+list);
		return list;
		
		
		
	}
}

		


