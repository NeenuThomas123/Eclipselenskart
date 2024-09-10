package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Lensregister;

public class Registertest 
{
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void url() throws InterruptedException
	{

		driver.get("https://www.lenskart.com");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		
	 }
	
	@Test
	public void test() throws InterruptedException
	{
		Lensregister ob=new Lensregister(driver);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div[3]/div[2]/span[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/div/div[2]/div[4]/button")).click();
		Thread.sleep(5000);
		
		ob.setvalues("Neenu", "Thomas", "8078741720", "neenukaduvanal123@gmail.com", "neenu@123");
		Thread.sleep(5000);
		
		ob.register();
	}
}
	
