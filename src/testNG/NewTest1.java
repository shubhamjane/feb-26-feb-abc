package testNG;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(groups="sanity")
  public void login() {
	  System.out.println("login method");
  }
  @Test(groups="sanity")
  public void logout() {
	  System.out.println("logout method");
  }
  @Test(groups="regression")
  public void singup() {
	  System.out.println("singup method");
  }
}
