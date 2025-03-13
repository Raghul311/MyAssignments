package week4.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForceTC2 extends ProjectSpecificMethod {
	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@id,'combobox-button')]")).click();
		driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement alertMsg = driver.findElement(By.xpath("//div[text()='Complete this field.']"));
		String text = alertMsg.getText();
		if (alertMsg.isDisplayed()) {
			System.out.println(("AlertMessage is displayed " + text));
		} else
			System.out.println("Alert message is not visble");
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}

}
