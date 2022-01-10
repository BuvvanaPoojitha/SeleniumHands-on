package seleniumhandson;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SetBrowserNotifications {
	@Test
	public void Optionsclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		ChromeOptions CO=new ChromeOptions();
		CO.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS_AND_NOTIFY);
		//CO.addArguments("--disable-notifications");
		WebDriver Driver=new ChromeDriver(CO);
		Driver.manage().window().maximize();
		Driver.get("https://www.carwale.com/");
	}


}
