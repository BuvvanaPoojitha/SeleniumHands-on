package seleniumhandson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=3)
	public void first() {
		System.out.println("Welcome to Eclipse ");
		Assert.assertEquals("GitHub", "GitHub");
	}
	
	@Test(priority=1)
	public void second() {
		String name = "Helsanki";
		Assert.assertEquals(name, "Helsanki");
	}
	@Test(priority=2)
	
	public void third() {
		System.out.println("Testing");
		Assert.assertFalse(false);

	}
	@Test
	public void fourth() {
		System.out.println("this is Nemo");
	}

}


