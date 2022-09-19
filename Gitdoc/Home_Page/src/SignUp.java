import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SignUp{
	@Test
	public void login() throws InterruptedException {
	{
 
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\anusha.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
        Thread.sleep(2000);	
        driver.findElement(By.linkText("Sign up")).click();
        Thread.sleep(2000);	
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Anu");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sha");
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("anu@gmail.com");
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("anu2221");
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2001");
        Thread.sleep(2000);	
        driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-3 > input[type=radio]")).click();
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("4564545645");
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Hi,I am Anusha M");
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
	    Thread.sleep(2000);	
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
       
        Thread.sleep(2000);	
        
    }     


   }
}