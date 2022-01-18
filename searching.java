package UdemyHandson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class searching {
	@SuppressWarnings("deprecation")
	@Test
	public void search(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Testing abc=new Testing();
		abc.testing();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
