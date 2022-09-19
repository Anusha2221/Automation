import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	@Test
	public void login() throws InterruptedException {
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\anusha.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://mobileworld.banyanpro.com/");
		  driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		  driver.manage().window().maximize();
	     
	       driver.findElement(By.id("username")).sendKeys("anu");
	       Thread.sleep(2000);
	       driver.findElement(By.id("password")).sendKeys("anu@2221");
	   
			Thread.sleep(2000);
		
	       driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
	      
		  
	}
	}
}
