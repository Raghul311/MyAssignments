package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchSelenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.close();
		

	}

}
