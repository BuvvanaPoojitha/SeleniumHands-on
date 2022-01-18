package UdemyHandson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlerts {
	@Test
	public void AlertsHandle(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		Alert demo=driver.switchTo().alert();
		System.out.println(demo.getText());
		demo.accept();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
	}

}
