package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InsertDataFromElxelByTestNG {
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@BeforeTest
	public String getData(int r,int c) throws IOException{
		String path = System.getProperty("user.dir")+"//TestNG Test Data.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String value = sheet.getRow(r).getCell(c).getStringCellValue();
		return value;
	}
	int r=0,c=0;
	String s;
	@DataProvider(name="testdata")
	public String featchData() throws IOException {
		for(int a=0;a<=r;a++) {
			for(int b=0;b<=c;b++) {
				s = getData(r,c);
				System.out.println(s);
				c++;
			}r++;
		}	
		return s;
	}
	@Test(dataProvider="testdata")
  public void login(String user, String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
  }
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
