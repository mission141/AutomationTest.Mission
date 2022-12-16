package automationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkbox extends BaseDriver{
	
	@Test(priority = 0)	
	public void startWebsite() throws InterruptedException {
			
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);
		}
	@Test(priority = 1)
	public void checkBox() throws InterruptedException {
		WebElement name = driver.findElement(By.xpath("//input[@id='male']"));
			name.click();
			Thread.sleep(3000);
			
			WebElement day = driver.findElement(By.xpath("//input[@id='friday']"));
			day.click();
			Thread.sleep(3000);
		
	}

}
