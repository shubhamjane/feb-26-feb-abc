package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testNG.ImplementingClass.class)
public class OrangeHMR {
 public static WebDriver driver;
	@BeforeTest
	public void initailizeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
	}
	@Test
	public void verifyTitle() {
		String actTitel = driver.getTitle();
		String excTitel = "Orange";
		Assert.assertEquals(actTitel, excTitel);
		System.out.println("Assert");
  }
	@Test
	public void verifyLink() {
		String actUrl = driver.getCurrentUrl();
		String excUrl = "https://opensource-.orangehrmlive.com/";
		SoftAssert ss = new SoftAssert();
		ss.assertEquals(actUrl, excUrl);
		System.out.println("Soft Assert");
		ss.assertAll();
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
