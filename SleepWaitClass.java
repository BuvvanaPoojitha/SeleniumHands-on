package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SleepWaitClass {
	@Test
	public void googleSearch() {
		String URL ="https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("Selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement searchResult = driver.findElement(By.xpath("//li[@role='presentation'][4]"));
		searchResult.click();
		
		
		driver.quit();
	}

}
