package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='left-pane-results-container']/div)[1]")).click();
		String result = driver.findElement(By.xpath("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']//span)[1]")).getText();
		String result2 = driver.findElement(By.xpath("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']//span)[3]")).getText();
		System.out.println(result + " " + result2);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini')]//span)[1]")).getText();
		String amount = driver.findElement(By.xpath("(//span[@class='a-price']//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Product name: "+ name);
		System.out.println("Product price: "+ amount);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
