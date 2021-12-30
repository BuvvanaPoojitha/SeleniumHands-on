package seleniumhandson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void first() {
		System.out.println("Welcome to Eclipse ");
		Assert.assertEquals("GitHub", "GitHub");
	}
	
	@Test
	public void second() {
		String name = "Helsanki";
		Assert.assertEquals(name, "Helsanki");
	}
	@Test
	
	public void third() {
		System.out.println("Testing");
		Assert.assertFalse(false);

	}
	@Test
	public void fourth() {
		System.out.println("this is Nemo");
	}

}
