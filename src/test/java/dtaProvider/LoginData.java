package dtaProvider;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import classTask1.Basesh1;

public class LoginData {
	public static Object[][] logindws() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[2][2];
//	obj[0][0]="sush@gmail.com";
//	obj[0][1]="sush1342";
//	obj[1][0]="sush@gmail012.com";
//	obj[1][1]="sush5616";
//	return obj;

		FileInputStream fls = new FileInputStream("Login.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet she = wb.getSheet("Sheet1");
		obj[0][0] = she.getRow(0).getCell(0).toString();
		obj[0][1] = she.getRow(0).getCell(1).toString();
		obj[1][0] = she.getRow(1).getCell(0).toString();
		obj[1][1] = she.getRow(1).getCell(1).toString();
		return obj;
	}

	public static Object[][] loginsh() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[2][2];
		obj[0][0] = "sush@gmail.com";
		obj[0][1] = "sush1342";
		obj[1][0] = "sush@gmail012.com";
		obj[1][1] = "sush5616";
		return obj;
	}

	public static Object[][] loginsh1() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[1][2];
		obj[0][0] = "tejasujagtap1818@gmail.com";
		obj[0][1] = "Tejas@2418";
//	obj[0][0]="sushantkanwade5616@gmail.com";
//	obj[0][1]="Sushant@5616";

		return obj;
	}
	
	public static Object[][] loginsh2() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[1][3];
		obj[0][0] = "admin01@gmail.com";
		obj[0][1] = "admin01";
		obj[0][2] = "5";


		return obj;
	}


}
