package seleniumhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	@Test
	public void DragDraft() {
		String URL ="https://demoqa.com/droppable";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions demo = new Actions(driver);
		demo.dragAndDrop(from, to).perform();
		driver.close();
		
		
		
		
	}

}
