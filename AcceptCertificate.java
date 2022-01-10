package seleniumhandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AcceptCertificate {
	@Test
	public void OptionsClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		ChromeOptions CO=new ChromeOptions();
		//CO.setAcceptInsecureCerts(false);
		CO.setAcceptInsecureCerts(true);
		WebDriver Driver=new ChromeDriver(CO);
		Driver.get("https://cacert.org");
	}

}
