package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="txtUsername")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(css="input#btnLogin")
	private WebElement button;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public boolean isButtonPresent() {
		boolean isbutton = button.isDisplayed();
		return isbutton;
	}
	public void login(String user,String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		button.click();
	}
}
