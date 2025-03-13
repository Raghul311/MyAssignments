package week4.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class editLeaddyno extends projectSpecific{
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		String data[][] = new String[2][2];
		data[0][0] = "98408";
		data[0][1] = "TCS";

		data[1][0] = "8825";
		data[1][1] = "CTS";

		return data;

	}
	@Test(dataProvider = "fetchData")
	public void exicteEditLead1(String pno, String cname) throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if (text.contains("Qeagle")) {
			System.out.println("Lead is editted successfully");
		} else {
			System.out.println("Lead is not editted");
		}
		// driver.close();

	}
}

