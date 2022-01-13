package UdemyHandson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLink {
	@SuppressWarnings("deprecation")
	@Test
	public void Text(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://edition.cnn.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(WebElement link : Links){
			System.out.println(link.getText());
		}
	}
}
