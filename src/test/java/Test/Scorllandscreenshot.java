package Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scorllandscreenshot
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
	public void test() throws IOException, InterruptedException
	{
		//title verification
		
		String expected="Eyeglasses, Sunglasses, Contact Lens Online - Lenskart IN";
		String actual=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(expected, actual);
		
		//check response code
		
		URL ob= new URL("https://www.lenskart.com/");
		
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
		}
		else
		{
			System.out.println("invalid url");
		}
		
		//scroll down
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"idf_banner-0\"]/div/center/a/img")).click();
		
		
		//screenshot of element about us,glass
		
		Thread.sleep(9000);
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"footerContent\"]/div[1]/div[1]/div[2]/h2"));
		File src = wb.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./screenshot//about.png"));
		
		
		}

}
