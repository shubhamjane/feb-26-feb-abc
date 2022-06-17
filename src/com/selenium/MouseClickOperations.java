package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickOperations {

	public static void mouseClick() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(singleClick).click().perform();
		String singleClickText = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
		if(singleClickText.contains("dynamic click")) {
			System.out.println("Click Test Case Pass");
		}
		
		act.contextClick(rightClick).perform();
		String rightClickText = driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
		if(rightClickText.contains("right click")) {
			System.out.println("Right Click Test Case Pass");
		}
		
		act.doubleClick(doubleClick).perform();
		String doubleClickText = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		if(doubleClickText.contains("double click")) {
			System.out.println("Double Click Test Case Pass");
		}
		
		driver.close();
	}
	public static void main(String[] args) {
		mouseClick();
	}

}
