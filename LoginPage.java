package seleniumhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	@Test
	public void DragDraft() {
		String URL ="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("poojitha2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Poojitha@2000");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
