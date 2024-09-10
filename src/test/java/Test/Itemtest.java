package Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Itemdetails;

public class Itemtest
{
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.lenskart.com/");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"lrd2\"]")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
			    
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		        driver.findElement(By.xpath("//*[@id=\"143903\"]/a/div[2]/img")).click();
		         
		        Thread.sleep(5000);
		        
		        Thread.sleep(5000);
				Itemdetails it=new Itemdetails(driver);
				it.showdetails();
		        
		         driver.close();
	}
			driver.switchTo().window(parentwindow);

}
		
		
		
	

}
}
