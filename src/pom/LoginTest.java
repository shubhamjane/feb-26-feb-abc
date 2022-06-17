package pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	LoginPage lp;
	public static WebDriver driver;
	@BeforeTest
	public void initailizeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeClass
	public void intializeBoject() {
		lp=new LoginPage(driver);
	}
	@Test(priority=0)
	public void verifybutton() {
		Assert.assertTrue(lp.isButtonPresent());
	}
	@Test(priority=1)
	public void verifyLogin() {
		lp.login("Admin", "admin123");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
