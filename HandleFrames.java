package UdemyHandson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleFrames {
	@SuppressWarnings("deprecation")
	@Test
	public void Text(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Button")).click();
		WebElement   title=driver.findElement(By.className("entry-title"));
		System.out.println(title.getText());
		Assert.assertEquals(title.getText(), "Button");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement insideframe=driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']"));
		Assert.assertEquals(insideframe.getText(), "A button element");
		insideframe.click();
		driver.switchTo().parentFrame();
		WebElement example1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h2"));
		Assert.assertEquals(example1.getText(),"Examples");
			
			
	}
}
