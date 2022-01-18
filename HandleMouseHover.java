package UdemyHandson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleMouseHover {
	/*@Test
	public void MouseHoverFunction(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americangolf.co.uk/");
		WebElement abc1=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[5]/a"));
		Actions action =new Actions(driver);
		action.moveToElement(abc1).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
	/*@SuppressWarnings("deprecation")
	@Test
	public void dragable(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[1]/a")).click();
		driver.switchTo().frame(0);
		WebElement test=driver.findElement(By.xpath("//*[@id='draggable']"));
		Actions demo = new Actions(driver);
		demo.dragAndDropBy(test, 50, 10).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}*/
	
	@SuppressWarnings("deprecation")
	@Test
	public void dragdrop(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions demo=new Actions(driver);
		demo.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}

}
