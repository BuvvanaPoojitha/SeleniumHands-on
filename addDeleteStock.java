package UdemyHandson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class addDeleteStock {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@Test
	public void addstock(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055571\\workspace\\Hands-on\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='useremail']")).sendKeys("anshulc55@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys(Keys.ENTER); 
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='portfolioid']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Testing");
		driver.findElement(By.xpath("//*[@id='addStock']")).click();
		driver.findElement(By.xpath("//*[@id='addstockname']")).sendKeys("nes");
		driver.findElement(By.xpath("//*[@id='13510022']")).click();
		driver.findElement(By.xpath("//*[@id='stockPurchaseDate']")).click();
		selectDateIncalender("25/09/2022");
	}
	public void selectDateIncalender(String Date){
		Date currentDate=new Date();
		//System.out.println(currentDate);
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date expectedDate=dateFormat.parse(Date);
			String day = new SimpleDateFormat("dd").format(expectedDate);
			String month = new SimpleDateFormat("MMM").format(expectedDate);
			String year = new SimpleDateFormat("yyyy").format(expectedDate);
			//System.out.println(day + month + year);
			String expectedMonthYear= month+" "+year;
			//System.out.println(expectedMonthYear);
			while(true){
				String displayDate=driver.findElement(By.className("dpTitleText")).getText();
				
				if(expectedMonthYear.equals(displayDate)){
					driver.findElement(By.xpath("//td[text()= '"+day+"']")).click();
					System.out.println("Both Dates are equal");
					break;
				}
				else if (expectedDate.compareTo(currentDate)>0){
					driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[4]/button")).click();
				}
				else{
					driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[2]/button")).click();
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
