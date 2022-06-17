package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T1 {
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void initailRequriment(String type) {
		if (type.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		} else {
			if (type.equals("edge")) {
				System.setProperty("webdriver.edge.driver", "F:\\edge\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
			}
		}
	}

	@Test(groups = "sanity")
	public void verifyTitel() {
		String autalTitel = driver.getTitle();
		String expextedTitel = "Practice Page";
		boolean a = (autalTitel.equals(expextedTitel));
		System.out.println(a);
	}

	@Test(groups = "regression")
	public void verifyUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	@AfterTest
	public void end() {
		driver.close();
	}
}
