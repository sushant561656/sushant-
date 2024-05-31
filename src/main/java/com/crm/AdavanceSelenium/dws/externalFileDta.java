package com.crm.AdavanceSelenium.dws;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.CreateExleFile.Excel;

public class externalFileDta{
	
	public static Properties prop() throws IOException
	{
		Properties prp=new Properties();
		FileInputStream fis =new FileInputStream("/Users/shubham/eclipse-workspace/com.crm.AdavanceSelenium/src/test/resources/sush.properties");
		prp.load(fis);
		return prp;
	}
//	
//	public static Properties excel() throws IOException
//	{
//		Properties prp=new Properties();
//		FileInputStream fis =new FileInputStream("/Users/shubham/eclipse-workspace/com.crm.AdavanceSelenium/src/test/resources/gift.xlsx");
//		prp.load(fis);
//		return prp;
		
		
		
//		Object[][] obj = new Object[2][3];
//		FileInputStream fls = new FileInputStream("Login.xlsx");
//		Workbook wb = WorkbookFactory.create(fls);
//		Sheet she = wb.getSheet("Sheet1");
////		obj[0][0] = she.getRow(0).getCell(0).toString();
////		obj[0][1] = she.getRow(0).getCell(1).toString();
//		obj[1][0] = she.getRow(1).getCell(0).toString();
//		obj[1][1] = she.getRow(1).getCell(1).toString();
//		obj[1][3] = she.getRow(1).getCell(1).toString();
//		
//		return obj;
//	}
	
}
