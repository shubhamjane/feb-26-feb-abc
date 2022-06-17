package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseOfDataProviderAnotation {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider="testdata")
  public void login(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
  }
	@DataProvider(name="testdata")
	public String [][]getData(){
		
		String [][] data= {{"abcd@gmail.com","abcd@123"},{"xyz@gmail.com","xyz@123"}};
		return data;
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}
