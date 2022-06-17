package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelReader {
	public static String reader(int r, int c) throws IOException {
		String path =System.getProperty("C:\\Users\\shubh\\eclipse-workspace\\JavaProject\\Data.xlsx");
		File file = new File(path);
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String val=sheet.getRow(r).getCell(c).getStringCellValue();
		wb.close();
		return val;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement button=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		//username.sendKeys("Admin");
		
		username.sendKeys(reader(0,0));
		password.sendKeys(reader(0,1));
		button.click();
		driver.close();
	}

}
