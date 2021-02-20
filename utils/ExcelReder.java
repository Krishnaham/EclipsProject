package com.gmail.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReder {
	
	public static ArrayList<String> fileReader(String filepath, String sheetno)
	{
		ArrayList<String> data=new ArrayList<String>();
		//data.get(0)=India	Delhi	7000000

		try {
			FileInputStream input = new FileInputStream(filepath);
			
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(input);
				
				XSSFSheet sheet = workbook.getSheet(sheetno);
				
				int rows =sheet.getLastRowNum();
				int cols=sheet.getRow(1).getLastCellNum();
				
				for(int r =1; r<=rows;r++)
				{
					String rowData="";
					XSSFRow row=sheet.getRow(r);
					for(int c=0;c<cols;c++)
					{
						XSSFCell cell=row.getCell(c);
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
						System.out.print(" | ");
						
					}
					System.out.println();
					//rowData = ({India|Delhi|7000000|})
					data.add(rowData);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	
//	public static void main(String[] args) {
//		
//		String excelfilepath = ".//Datafiles/Countrydetails.xlsx";
//		
//		ExcelReder.fileReader(excelfilepath, "Sheet2");
//		
		
	

}

