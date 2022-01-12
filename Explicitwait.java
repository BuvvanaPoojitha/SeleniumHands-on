package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait {
	/*@Test
	public void verifyAlert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91956/Downloads/ExplicitWait.html");
		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		WebDriverWait abc=new WebDriverWait(driver, 30);
		abc.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.close();
	}*/
	
	
	
	/*@Test
	public void verifyElementClickable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91956/Downloads/ExplicitWait.html");
		driver.findElement(By.xpath("//*[@id=\"display-other-button\"]")).click();
		WebDriverWait abc=new WebDriverWait(driver, 30);
		abc.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"hidden\"]"))));
	}*/
	
	
	/*@Test
	public void elementSelected() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91956/Downloads/ExplicitWait.html");
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
		WebDriverWait abc=new WebDriverWait(driver, 30);
		abc.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//*[@id=\"ch\"]"))));
	}*/
	
	
	/*@Test
	public void VerifyTextPresent() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91956/Downloads/ExplicitWait.html");
		driver.findElement(By.xpath("//*[@id=\"populate-text\"]")).click();
		WebDriverWait abc=new WebDriverWait(driver, 30);
		abc.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"h2\"]")), "Selenium Webdriver"));
	}*/
	
	
	@Test
	public void VerifyElementVisibile() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91956/Downloads/ExplicitWait.html");
		driver.findElement(By.xpath("//*[@id=\"display-other-button\"]")).click();
		WebDriverWait abc=new WebDriverWait(driver, 30);
		abc.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
	}




}
	
