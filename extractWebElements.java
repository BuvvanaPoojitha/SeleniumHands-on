package UdemyHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class extractWebElements {
	@Test
	public void GetElemnts() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://edition.cnn.com/");
		WebElement abc=driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]"));
		List<WebElement> links= abc.findElements(By.tagName("a"));
		System.out.println("Number of links"+links.size());
		for(WebElement link : links){
			String demo=link.getText();
			if(!demo.isEmpty()){
				System.out.println(demo);
			}
		}
	
}

}
