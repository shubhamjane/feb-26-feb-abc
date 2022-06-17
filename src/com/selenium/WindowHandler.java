package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		String parentPage = driver.getWindowHandle();
		System.out.println(parentPage);
		
		driver.findElement(By.cssSelector("a#opentab")).click();
		System.out.println();
		Set <String> allWindow = driver.getWindowHandles();
		for(String s:allWindow) {
			if(s!=parentPage) {
				driver.switchTo().window(s);
			}
			System.out.println(s);
		}
		driver.findElement(By.linkText("About us")).click();
	}
}
