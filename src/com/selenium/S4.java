package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S4 {
	
	public void screenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"\\ScreenShot\\S4.png");
		FileHandler.copy(source, file);
		driver.close();
	}
	
	public void screenShot1() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Shubh97@");
		driver.findElement(By.tagName("button")).click();
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File file1 = new File(System.getProperty("user.dir")+"\\ScreenShot\\SS4.png");
		FileHandler.copy(source1, file1);
		driver.close();
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		S4 ss = new S4();
		//ss.screenShot();
		ss.screenShot1();
	
	}

}
