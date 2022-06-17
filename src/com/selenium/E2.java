package com.selenium;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
	public static String m1(int r,int c) throws Exception {
		//String path = System.getProperty(("");
		File file = new File("C:\\Users\\shubh\\eclipse-workspace\\JavaProject\\Data_1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String value = sheet.getRow(r).getCell(c).getStringCellValue();
		wb.close();
		return value;
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement user=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		WebElement button = driver.findElement(By.xpath("//input[@name='Submit']"));
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		user.sendKeys(m1(0,0));
		pass.sendKeys(m1(0,1));
		button.click();
		driver.close();
	}

}
