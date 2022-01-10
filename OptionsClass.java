package seleniumhandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OptionsClass {
	@Test
	public void Optionsclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		ChromeOptions CO=new ChromeOptions();
		CO.setHeadless(true);
		//CO.setHeadless(false);
		WebDriver Driver=new ChromeDriver(CO);
		Driver.get("https://www.facebook.com/");
		String pageTitle= Driver.getTitle();
		System.out.println("title" +pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
	}
}
