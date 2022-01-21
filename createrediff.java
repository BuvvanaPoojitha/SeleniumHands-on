package UdemyHandson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class createrediff {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
	@Test
	public void CreatePortfolio(){
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='useremail']")).sendKeys("anshulc55@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys(Keys.ENTER); 
		driver.findElement(By.xpath("//*[@id='createPortfolio']")).click();
		driver.findElement(By.xpath("//*[@id='create']")).clear();
		driver.findElement(By.xpath("//*[@id='create']")).sendKeys("number");
		driver.findElement(By.xpath("//*[@id='createPortfolioButton']")).click();
		driver.findElement(By.xpath("//*[@id='username']/a")).isDisplayed();
		
	}

}
