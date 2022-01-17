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

public class DropdownMethods {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
	@Test
	public void multiselectdropdown(){
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		WebElement abc =driver.findElement(By.id("cars"));
		Select xyz=new Select(abc);
		System.out.println(xyz.isMultiple()); //boolean multi selection or not
		xyz.selectByIndex(2);
		xyz.selectByIndex(3);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getFirstSelectedOption
		System.out.println(xyz.getFirstSelectedOption().getText()); //Firstselected option displayed
		System.out.println("@@@@@@@@");
		//getAllSelectedOptions
		List<WebElement> allvalues=xyz.getAllSelectedOptions(); //selected values displayed
		for (WebElement values : allvalues) {
			System.out.println(values.getText());
		}
		xyz.deselectAll();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
