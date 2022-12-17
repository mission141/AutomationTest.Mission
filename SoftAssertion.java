package automationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion extends BaseDriver{

	@Test(priority = 0)
	public void startWebsite() throws InterruptedException {
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}

	@Test(priority = 1)
	public void checkAlert() throws InterruptedException {
		
	WebElement JsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
	WebElement JsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
	WebElement JsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
	WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
	

	SoftAssert softAssert = new SoftAssert();
	JsAlert.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);

	String resultText1 = result.getText();
	softAssert.assertEquals(resultText1, "You successfully clicked an ");
	

	JsConfirm.click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
	
	String resultText2 = result.getText();
	Assert.assertEquals(resultText2,"You clicked: Cancel");
	
	
	JsPrompt.click();
	driver.switchTo().alert().sendKeys("Hello Alert !");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	String resultText3 = result.getText();
	Assert.assertEquals(resultText3, "You entered: Hello Alert !");
	
	softAssert.assertAll();
	
	

	}
}
