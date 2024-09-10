package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Itemdetails
{
	WebDriver driver;
	
	
	By wishlist=By.xpath("//*[@id=\"header\"]/div[2]/div/div[3]/div[3]/div");
	
	By cart=By.xpath("//div[@class=\"AddToCartButtonWrapper--1cmdmnz gHNVbD\"]");
	
	public Itemdetails(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void showdetails() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(wishlist).click();
		
		Thread.sleep(5000);
		driver.findElement(cart).click();
	}
}