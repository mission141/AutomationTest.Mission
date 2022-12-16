package automationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator extends BaseDriver {
	
@Test(priority = 0)	
public void startWebsite() throws InterruptedException {
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,430)");
	}
@Test(priority = 1)
public void testLocators() throws InterruptedException {
	WebElement gender = driver.findElement(By.id("name"));
		gender.sendKeys("M H Mission");
		Thread.sleep(3000);
		
	WebElement mobile = driver.findElement(By.id("phone"));
		mobile.sendKeys("0199009900");
		Thread.sleep(3000);

	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("msn@live.com");
		Thread.sleep(3000);
		
	WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("3.141592654");
		Thread.sleep(3000);
		
	WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Mirpur-1206");
		Thread.sleep(3000);

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);
}
}
