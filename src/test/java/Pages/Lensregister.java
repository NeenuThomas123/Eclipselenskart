package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lensregister 
{
	WebDriver driver;
	
	By lefname=By.xpath("//*[@id=\"sign-up-form\"]/div/div[2]/div[1]/div[1]/input");
	
	By lelname=By.name("lastName");
	
	By lenum=By.xpath("//*[@id=\"sign-up-form\"]/div/div[2]/div[3]/div[1]/input");
	
	By leemail=By.name("email");
	
	By lepassword=By.name("password");
	
	By register=By.xpath("//*[@id=\"remove-button\"]");
	
	public Lensregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String firstname,String lastname,String number,String email,String password)
	{
		driver.findElement(lefname).sendKeys(firstname);
		
		driver.findElement(lelname).sendKeys(lastname);
		
		driver.findElement(lenum).sendKeys(number);
		
		driver.findElement(leemail).sendKeys(email);
		
		driver.findElement(lepassword).sendKeys(password);
		
	}
	
	public void register()
	{
		driver.findElement(register).click();
	}

}
