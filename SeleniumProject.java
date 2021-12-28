package seleniumhandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject {
	@Test
	public void Facebook() {
		String URL ="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		String pageTitle= driver.getTitle();
		System.out.println("title" +pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
	}


}
