package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Searchitems;

public class Searchtest
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
		driver.get("https://www.lenskart.com/");
		Thread.sleep(9000);
		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(5000);
		
		Searchitems se=new Searchitems(driver);
		se.setvalue("Aviator");
		
		Thread.sleep(5000);
		se.searchclick();
				
	}

}
