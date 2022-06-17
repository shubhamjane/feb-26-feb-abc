package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {
	
	public static void writeData(int r, int c, String val) throws IOException {
		String path= System.getProperty("user.dir")+"//Data_1.xlsx";
		File file =new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.createRow(r);
		XSSFCell cell= row.createCell(c);
		cell.setCellValue(val);
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		for (int i=0; i<=4;i++) {
			String [] ar= {"Pune","Aurangabad","Nashik","Kolhapur", "Mumbai"};
			writeData(i,0, ar[i]);
		}
	}

}
