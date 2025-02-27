package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleatLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		// driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
		// driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8825828586");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String firstLeadIdElement = driver.findElement(By.xpath("//td[contains(@class,'cell-first')]//a")).getText();
		System.out.println(firstLeadIdElement);
		driver.findElement(By.xpath("//td[contains(@class,'cell-first')]//a[1]")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[contains(@name,'id')]"))
				.sendKeys(firstLeadIdElement);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement verify = driver.findElement(By.xpath("//div[text()='No records to display']"));

		if (verify.isDisplayed()) {
			System.out.println("Lead id Deleated");
		} else {
			System.out.println("Lead id is not Deleated");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
