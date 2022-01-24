package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingTCs {
	@Test(groups="smoke")
	public void first() {
		System.out.println("i am first");
		Assert.assertEquals("GitHub", "GitHub");
	}
	
	@Test
	public void second() {
		String name = "i am second";
		System.out.println(name);
	}
	@Test(groups="Regression")
	
	public void third() {
		System.out.println("i am third");

	}
	@Test(groups="smoke")
	public void fourth() {
		System.out.println("i am fourth");
	}

}
