package com.crm.CreateExleFile;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
    public static void main(String[] args) {
        // Create a Workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Gift Card");

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create Cells
        Cell cell1 = headerRow.createCell(0);
        cell1.setCellValue("Recipient's Name");

        Cell cell2 = headerRow.createCell(1);
        cell2.setCellValue("Recipient's Email");

        Cell cell3 = headerRow.createCell(2);
        cell3.setCellValue("Qty");

        // Create another Row
        Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue("sushant");
        dataRow.createCell(1).setCellValue("sushantkanwade5616@gmail.com");
        dataRow.createCell(2).setCellValue(3);
        
         String s = dataRow.getCell(2).toString();
         System.out.println(s);
     

        // Write the output to a file in the src/trxt/resources folder
        try (FileOutputStream fileOut = new FileOutputStream("src/test/resources/gift.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Closing the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel file created successfully in src/test/resources!");
    }

}
