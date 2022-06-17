package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphisum {
	//Method-1
	  public static void testmethod(WebDriver driver) throws InterruptedException 
	  {
	   
	 driver.get("https://goo.gl/maps/oLdAYyMZx3G2");
	 System.out.println(driver.getTitle());

	 driver.navigate().to("https://saiprasanthadabala.wordpress.com/");
	 System.out.println(driver.getTitle());

	 driver.navigate().back();
	 Thread.sleep(2000);

	 driver.navigate().forward();
	 Thread.sleep(2000);

	 driver.navigate().refresh();
	 Thread.sleep(2000);

	 driver.quit();
	  }


	  public static void main(String[] args) throws InterruptedException 
	  {
	   System.setProperty("webdriver.gecko.driver","D://Silpa//geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   testmethod(driver);
	   System.setProperty("webdriver.chrome.driver","D://Silpa//chromedriver.exe");
	   testmethod(new ChromeDriver());//Auto upcast
	  }
}
