package pom;

import org.testng.annotations.Test;

public class P1 extends LoginTest {

	@Test
	public void verifyURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
