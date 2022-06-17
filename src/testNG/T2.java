package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T2{
	WebDriver driver;
	@BeforeTest
	public void initailRequriment() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	}
  @Test(groups="regression")
  public void verifyTitel() {
	 String actualTitel = driver.getTitle();
	 String expectedTitel ="Practice Page";
	 Assert.assertEquals(actualTitel, expectedTitel);
  }
  @Test(groups="regression")
  public void verifyurl() {
	 String url = driver.getCurrentUrl();
	System.out.println(url);
  }
  @AfterTest
  public void end() {
	  driver.close();
  }
}
