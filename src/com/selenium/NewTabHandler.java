package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com/intl/en-GB/gmail/about/");
		
		//case 1
		driver.switchTo().window(parentWindow);
		
		//case 2
		
		/*Set <String> tabs = driver.getWindowHandles();
		for(String s:tabs) {
			if(s.equals(parentWindow)) {
				driver.switchTo().window(s);
			}
		}*/
	}

}
