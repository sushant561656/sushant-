package Excale;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WritedataInExacle {
	@Test
	public void dataToExale() throws EncryptedDocumentException, IOException
	{
		FileInputStream fil=new FileInputStream("/Users/shubham/eclipse-workspace/com.crm.AdavanceSelenium/src/test/resources/gift.xlsx");
		Workbook wb=WorkbookFactory.create(fil);
		Sheet sheet = wb.getSheet("Gift Card");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(4);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("anydesk");
		FileOutputStream fos=new FileOutputStream("/Users/shubham/eclipse-workspace/com.crm.AdavanceSelenium/src/test/resources/gift.xlsx");
	    wb.write(fos);
		wb.close();
	
	
	}
}
