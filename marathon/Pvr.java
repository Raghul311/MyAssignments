package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class Pvr {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//div[@class='date-show']/span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(1000);
		// select theater
		driver.findElement(
				By.xpath("//div[@class='p-dropdown-items-wrapper']//span[text()='INOX The Marina Mall, OMR, Chennai']"))
				.click();
		Thread.sleep(1000);
		// date
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[2]")).click();
		Thread.sleep(1000);
		// movie
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[1]")).click();
		Thread.sleep(1000);
		// timing
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']//span[text()='Tamil'])[2]")).click();
		Thread.sleep(1000);
		// book button
		driver.findElement(By.xpath("//div[@class='quick-lefts ']//span")).click();
		Thread.sleep(3000);
		// t&C
		driver.findElement(By.xpath("(//div[@class='accpet-btn-flow-seat']/button)[2]")).click();
		Thread.sleep(2000);
		// seat
		driver.findElement(By.xpath("//span[contains(@id,'CL.CLUB')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='register-btn']")).click();
		Thread.sleep(2000);
		String seatno = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("seat no---> " + seatno);
		Thread.sleep(2000);
		String Grandtotal = driver.findElement(By.xpath("(//div[contains(@class,'grand-tota')]//span)[2]")).getText();
		System.out.println("Total---> " + Grandtotal);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')])[2]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
