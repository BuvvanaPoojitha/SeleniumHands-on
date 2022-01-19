package selenium.wait;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWebTable {
	
		@SuppressWarnings("deprecation")
		@Test
		public void webtabledata(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.rediff.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
			driver.findElement(By.xpath("//*[@id='moremoney']/ul/li[3]/a")).click();
			driver.findElement(By.xpath("//*[@id='showMoreLess']")).click();
			List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
			System.out.println("no of rows"+rows.size());
			List<WebElement> column=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
			System.out.println("no of columns"+column.size());	
			List<WebElement> rowdata=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[3]/td"));  //specific row data
			System.out.println("--------3rd Row-------");
			for (WebElement rowdatas : rowdata) {
				System.out.println(rowdatas.getText());
			}
			
			List<WebElement> columndata=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[3]/td"));  //specific column data
			System.out.println("--------1st column-------");
			for (WebElement columndata1 : columndata) {
				System.out.println(columndata1.getText());
			}
			System.out.println("--------complete table data-------");
			for (WebElement columndata2 : rows) {
				System.out.println(columndata2.getText());
			}
		}


}
