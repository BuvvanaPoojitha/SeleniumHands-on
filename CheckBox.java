package seleniumhandson;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CheckBox {
	@Test
	public void login() {
		String URL ="https://www.sugarcrm.com/request-demo/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement searchBox = driver.findElement(By.name("firstname"));
		searchBox.sendKeys("Selenium");
		driver.findElement(By.id("doi0")).click();
		driver.findElement(By.name("interest_market_c")).click();
		
		
		
		
	
	}
}
