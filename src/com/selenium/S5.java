package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		//Simple Alert 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		driver.switchTo().alert().accept();
		//Input type alert
		driver.findElement(By.cssSelector("input#name")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		String alert = driver.switchTo().alert().getText();
		if(alert.contains("Puen")) {
		System.out.println("Test Case Pass");
			driver.switchTo().alert().accept();
		}else {
			System.out.println("Test Case Fail");
			driver.switchTo().alert().dismiss();
		}
	}

}
