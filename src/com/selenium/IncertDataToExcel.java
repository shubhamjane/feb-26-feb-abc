package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncertDataToExcel {
	public static void writedata(int r, int c, String value) throws IOException {
		String path= System.getProperty("user.dir")+"//Data_2.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.createRow(r);
		XSSFCell cell=row.createCell(c);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
	static String s;
	public static void getlist() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1280)");
		
		List <WebElement> row = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr"));
		int rowsize =row.size();
		
		List <WebElement> column = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td"));
		int columnsize =column.size();
		int z=0;
		for(int i=2;i<=rowsize;i++) {
			for(int j=1;j<=columnsize;j++) {
				if(j==3) {
				s=driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				writedata(z,0,s);
				}
			}z++;
		}
		Thread.sleep(3000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		
		getlist();
	}

}
