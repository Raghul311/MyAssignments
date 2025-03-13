package week4.day16dynamic;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week4.day16.ProjectSpecificMethod;

public class SalesForcedyno extends ProjectSpecificMethod {

	@DataProvider(name="userData")
	public String[][] senddata() {
		int i=1;
		String[][] data = new String[2][2];
		data[0][0] = "Raghul "+i+"";
		data[0][1]="TCS";
		i++;
		data[1][0] = "Raghul "+i+"";
		data[1][1]="CTS";
		return data;
	}

	@Test(dataProvider = "userData")
	public void testcase3(String name, String cname) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//a[@class='slds-button slds-button_reset']/ancestor::div[contains(@class,'slds-p-left_none slds-p-right_x-small')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by "+name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);

	}
}
