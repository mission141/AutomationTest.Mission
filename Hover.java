package automationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseDriver{
	
	@Test(priority = 0)	
	public void startWebsite() throws InterruptedException {
			
			driver.get("https://www.daraz.com.bd/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void hover() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		WebElement automotive = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement motorbykes = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(automotive).perform();
		Thread.sleep(3000);
		
		action.moveToElement(motorbykes).perform();
		Thread.sleep(2000);
		
		helmet.click();
		Thread.sleep(2000);
		
	}

}
