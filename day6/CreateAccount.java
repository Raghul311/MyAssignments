package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Raghul kumar S");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaftap");
		driver.findElement(By.id("numberEmployees")).sendKeys("8825828586");
		WebElement elementIndustry= driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select option= new Select(elementIndustry);
		option.selectByValue("IND_SOFTWARE");
		WebElement elementOwnership= driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select option1= new Select(elementOwnership);
		option1.selectByVisibleText("S-Corporation");
		WebElement elementSource= driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select option2= new Select(elementSource);
		option2.selectByValue("LEAD_EMPLOYEE");
		WebElement elementMC= driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select option3= new Select(elementMC);
		option3.selectByVisibleText("eCommerce Site Internal Campaign");
		WebElement elementState= driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select option4= new Select(elementState);
		option4.selectByVisibleText("Texas");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		}

}
