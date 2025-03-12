package week4.day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	ChromeOptions options;
	ChromeDriver driver;
	@Parameters({"url","username","password"})

	@BeforeMethod
	public void preCondition1(String link, String user, String pass) throws InterruptedException {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get(link);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='slds-icon-waffle']/ancestor::button[contains(@class,'slds-button')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.scrollToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).perform();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();

	}
	@AfterMethod
	public void postCondition1() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		

	}

}
