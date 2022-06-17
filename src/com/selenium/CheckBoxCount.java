package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCount {

	public void checkBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
		List<WebElement> checkboxname = driver.findElements(By.tagName("label"));
		int x=0;
		for(WebElement list:checkboxname) {
			System.out.println(list.getText());
			x++;
		}
		System.out.println("Total number of check box present on the page is ="+x);
		Thread.sleep(2000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {

		CheckBoxCount ref = new CheckBoxCount();
		ref.checkBox();
	}

}
