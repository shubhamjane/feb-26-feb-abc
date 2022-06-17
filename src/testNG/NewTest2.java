package testNG;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(groups="regression")
  public void name() {
	  System.out.println("This is name method");
  }
  @Test(groups="sanity")
  public void nameFather() {
	  System.out.println("This is nameFather method");
  }
  @Test(groups="sanity")
  public void nameSurname() {
	  System.out.println("This is nameSurname method");
  }
}
