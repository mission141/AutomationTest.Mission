package automationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMSN extends BaseDriver {
	@Test(priority = 0)	
	public void startWebsite() throws InterruptedException {
			
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,1200)");
		}
	@Test(priority = 1)
	public void select() throws InterruptedException {
		
		WebElement travel = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));
		
		Select place =new Select(travel);
		Thread.sleep(3000);
		place.selectByVisibleText("Norway");
		Thread.sleep(5000);

		
	}
}
