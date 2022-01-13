package UdemyHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetText {
	@Test
	public void Text(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		String abc=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/h2")).getText();
		System.out.println(abc);
		Assert.assertEquals(abc, "Facebook helps you connect and share with the people in your life.");
		String abc1=driver.findElement(By.xpath("//*[@id='email']")).getAttribute("placeholder");
		System.out.println(abc1);
		Assert.assertEquals(abc1, "Email address or phone number");
		
	}

}
