package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcludeTCs {
	@Test(groups="smoke")
	public void first() {
		System.out.println("i am smoke");
		Assert.assertEquals("GitHub", "GitHub");
	}
	
	@Test
	public void second() {
		String name = "i am second2";
		System.out.println(name);
	}
	@Test(groups="Regression")
	
	public void third() {
		System.out.println("i am third3");

	}
	@Test(groups="Unit")
	public void fourth() {
		System.out.println("i am fourth4");
	}
}
