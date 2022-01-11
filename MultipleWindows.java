package FirstProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MultipleWindows {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();  //Parent window
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();  //Child window
		Set<String> abc=driver.getWindowHandles();     //WindowHandles used to know number of windows opened 
		Iterator<String> cd=abc.iterator();
		String parent = cd.next(); // First window parent
		String child = cd.next();  // Second window child
		driver.switchTo().window(child); // navigate to child window
		driver.switchTo().window(parent);  // navigate to parent window
		System.out.println(abc); // display windows in set
	}

}
