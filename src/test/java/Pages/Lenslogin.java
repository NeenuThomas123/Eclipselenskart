package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lenslogin
{
	WebDriver driver;
	
	By lnmobile=By.xpath("//*[@id=\"sign-in-form\"]/div/div[2]/div[2]/div[1]/input");
	
	By lnlogin=By.xpath("//*[@id=\"remove-button\"]");
	
	By login=By.xpath("//*[@id=\"remove-button\"]");
	
	public Lenslogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String number)
	{
		driver.findElement(lnmobile).sendKeys(number);
		
		driver.findElement(lnlogin).click();
		
		
		}
	
	public void login()
	{
		driver.findElement(login).click();
	}

}
