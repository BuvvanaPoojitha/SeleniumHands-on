package seleniumhandson;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipexception {
	@Test
	public void first() {
		System.out.println("Testing1");
	}
@Test
	public void second() {
		System.out.println("Testing2 ");
	}
@Test(enabled=true)
	public void third() {
		System.out.println("Testing3");
	}
@Test
	public void fourth() {
		System.out.println("Testing4");
		throw new SkipException("incomplete");
	}
@Test(enabled=false)
    public void fifth() {
	    System.out.println("Testing5");
}

}
