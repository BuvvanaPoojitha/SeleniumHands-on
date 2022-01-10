package seleniumhandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BlockInfobars {
	@Test
	public void Optionsclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--disable-notifications");
		CO.addArguments("--disable-infobars");
		WebDriver Driver=new ChromeDriver(CO);
		Driver.manage().window().maximize();
		//Driver.get("https://www.bing.com");
		Driver.get("https://www.carwale.com/");
	}

}
