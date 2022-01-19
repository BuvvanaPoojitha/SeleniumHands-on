package selenium.wait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleAutoSuggestion {
	@Test
	public void DragDraft() {
		String URL ="https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//@SuppressWarnings("deprecation")
		/*WebDriverWait abc=new WebDriverWait(driver, 20);
		abc.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[@role='listbox']/li"))));*/
		List<WebElement> autosuggets=driver.findElements(By.xpath("//*[@role='listbox']/li"));
		System.out.println(autosuggets.get(3).getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
