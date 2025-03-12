package week4.day16;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SalesForceTC1 extends ProjectSpecificMethod {
	@Test
	public void testCase1() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Raghul");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String enteredtext="Salesforce Automation by Raghul";
		String expectedtext = driver.findElement(By.xpath("(//a[@class='forceActionLink']/div)[2]")).getText();
		if(enteredtext.equalsIgnoreCase(expectedtext)) {
			System.out.println("name verified: "+expectedtext);
		}
		else
			System.out.println("invalid name");
	}

}
