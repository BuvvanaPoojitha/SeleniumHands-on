package UdemyHandson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWebTable {
	@SuppressWarnings("deprecation")
	@Test
	public void webtabledata(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='moremoney']/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("//*[@id='div_bseindices']/div/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id='showMoreLess']")).click();
		List rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("no of rows"+rows.size());
		List column=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("no of columns"+column.size());
		
	}

}
