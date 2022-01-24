package seleniumhandson;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beforeaftermethod {
	@BeforeTest
	public void first() {
		System.out.println("i am first");
		Assert.assertEquals("GitHub", "GitHub");
	}
	
	@Test
	public void second() {
		String name = "i am second";
		System.out.println(name);
		Assert.assertEquals(name, "i am second");
	}
	@BeforeMethod
	public void third() {
		System.out.println("i am third");
		Assert.assertFalse(false);

	}
	@AfterTest 
	public void fourth() {
		System.out.println("i am fourth");
	}

}
