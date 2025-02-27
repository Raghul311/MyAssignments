package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateFB {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raghul");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		WebElement webElementDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select option= new Select(webElementDay);
		option.selectByVisibleText("31");
		WebElement webElementMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select option1= new Select(webElementMonth);
		option1.selectByVisibleText("Dec");
		WebElement webElementYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select option2= new Select(webElementYear);
		option2.selectByVisibleText("1999");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8825828586");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Raghul@8223");
		/*WebElement webElementGender = driver.findElement(By.xpath("//input[@value='2'])"));
		webElementGender.click();*/
		WebElement genderRadio = driver.findElement(By.xpath("//input[@value='2']"));
        genderRadio.click();
		
	}

}
