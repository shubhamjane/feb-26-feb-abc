package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//WebElement emailbox = driver.findElement(By.name("email"));
		//emailbox.sendKeys("abc@gmail.com");
		//WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("12345674565525");
		//WebElement loginbutton = driver.findElement(By.xpath(null));
		//loginbutton.click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
	}

}
