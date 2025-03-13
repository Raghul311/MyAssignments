package week4.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod {
	@Test
	public void SalesF() throws InterruptedException {
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications");
		 * options.addArguments("--incognito"); ChromeDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 * driver.get("https://login.salesforce.com/"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(
		 * "bhuvanesh.moorthy@testleaf.com");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Testleaf@2025");
		 * driver.findElement(By.xpath("//input[@id='Login']")).click();
		 * Thread.sleep(2000); driver.findElement( By.xpath(
		 * "//div[@class='slds-icon-waffle']/ancestor::button[contains(@class,'slds-button')]"
		 * )).click(); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[text()='View All']")).click();
		 * Thread.sleep(2000); Actions ac = new Actions(driver);
		 * ac.scrollToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"
		 * ))).perform();
		 * driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		 * driver.findElement(By.xpath("//div[text()='New']")).click();
		 */
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

	}

}
