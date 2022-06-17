package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImpliciteWait1 {
	WebDriver driver;
	@BeforeTest
	public void initailizeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void verifyTitle() {
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		FluentWait <WebDriver> fwait = new FluentWait<WebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1));
		fwait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
  }

	@AfterTest
	public void terminateBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
