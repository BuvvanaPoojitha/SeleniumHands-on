package seleniumhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest {
	private static final String ExceptedConditions = null;

	@Test
	public void loginRediff() {
		String URL ="https://www.rediff.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='useremail']")).sendKeys("anshulc55@rediffmail.com");
		
		driver.findElement(By.xpath("//*[@id=\'userpass\']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@id=\'userpass\']")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\'username\']/a")).isDisplayed();
		driver.close();
		
		
	
		
		
	}

}
