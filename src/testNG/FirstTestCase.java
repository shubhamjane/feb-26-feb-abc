package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTestCase {
  @Test (description="This is lemon test case", invocationCount=5)
  public void lemon() {
	  
	  System.out.println("lemon");
  }
  @Test
  public void apple() {
	  
	  System.out.println("apple");
  }
  @Test
  public void banana() {
	  
	  System.out.println("banana");
  }
}
