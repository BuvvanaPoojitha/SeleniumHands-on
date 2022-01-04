package seleniumhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Petco {
	@Test
	public void Booking() {
		String URL ="https://www.petco.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"topcontent\"]/div[3]/button")).click();
		driver.manage().window().maximize();
		WebElement Value= driver.findElement(By.xpath("//button[@data-track-value=\"Dog\"]"));
		Value.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"topcontent\"]/div[3]/div/div/ul/li[1]/div[3]/ul/section/div[2]/ul/li[1]/div[3]/ul/li[3]/a")).click();
		WebElement Order=driver.findElement(By.cssSelector("select#sort_by"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select atoz=new Select(Order);
		atoz.selectByValue("1");
	}
}
