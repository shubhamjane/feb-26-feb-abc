package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {
	public void capture(WebDriver driver,String name) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"\\ScreenShot\\"+name+".png");
		FileHandler.copy(source, file);
		System.out.println("Screen Shot took");
	}
}


