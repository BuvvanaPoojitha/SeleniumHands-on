package seleniumhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadFlie {
	@Test
	public void login() {
		String URL ="https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement Choose =driver.findElement(By.id("fileupload1"));
		Actions demo = new Actions(driver);
		demo.moveToElement(Choose).click().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Choose.sendKeys("C:\\Users\\91956\\linux commands.txt");
		
		
		
	}
}
