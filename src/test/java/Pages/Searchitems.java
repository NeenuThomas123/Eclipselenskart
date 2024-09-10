package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchitems 
{
	WebDriver driver;
	
	By searchbutton=By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/div/form/input");
	
	By eyebutton=By.xpath("//*[@id=\"lrd1\"]");
	
	By screenbutton=By.xpath("//*[@id=\"lrd2\"]");
	
	By kidsbutton=By.xpath("//*[@id=\"lrd11\"]");
	
	By contactbutton=By.xpath("//*[@id=\"lrd4\"]");
	
	By storebutton=By.xpath("//*[@id=\"lrd9\"]");
	
	public Searchitems(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalue(String search)
	{
		driver.findElement(searchbutton).sendKeys(search);
	}
	
	public void searchclick()
	{
		driver.findElement(eyebutton).click();
		
		driver.findElement(screenbutton).click();
		
		driver.findElement(kidsbutton).click();
		
		driver.findElement(contactbutton).click();
		
		driver.findElement(storebutton).click();
	}
		

}
