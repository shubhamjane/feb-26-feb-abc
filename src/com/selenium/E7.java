package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7 {

	static String price_list;

	public static void write(int r, int c, char ar) throws Exception {
		File src = new File("C:\\Users\\shubh\\eclipse-workspace\\JavaProject\\Data_2.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = book.getSheetAt(0);
		sheet1.createRow(r).createCell(c).setCellValue(ar);
		FileOutputStream fos = new FileOutputStream(src);
		book.write(fos);
		//book.close();

	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> price = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)", price);
		for (WebElement i : price) {
			price_list = i.getText();
			char[]ar=  price_list.toCharArray();
			System.out.println(ar);
			
			System.out.println("Elements in price column" + price.size());
			for (int ro = 0; ro <= 9; ro++) {

				write(ro, 0, ar[ro]);
			}
}}}
