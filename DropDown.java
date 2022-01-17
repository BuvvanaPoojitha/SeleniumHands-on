package UdemyHandson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DropDown {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
	@Test
	 public void selectDOB(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WebElement abc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy' and @role='button']"));
		 abc.click();
		 WebElement xyz=driver.findElement(By.xpath("//*[@id='month']"));
		 
		 // select by index
		 Select select=new Select(xyz);
		 select.selectByIndex(3);
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //select by value
		 select.selectByValue("11");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //selectByVisibleText
		 select.selectByVisibleText("Jun");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //getOptions
		 List<WebElement> monthvalues=select.getOptions();
		 for(WebElement month : monthvalues){
			 System.out.println(month.getText());
		 }
		 
		 
	 }

}
