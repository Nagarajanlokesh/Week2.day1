package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		 
		 // To maximize the window we use below code 
		 
		 driver.manage().window().maximize();
		 
		 WebElement uName = driver.findElement(By.xpath("//input[@id = 'username']"));
		 
		 uName.sendKeys("DemoSalesManager");
		 
		 driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		 
		 
		 driver.findElement(By.xpath("//input[contains(@class, 'decorative')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		 
		 
		 WebElement companyName = driver.findElement(By.xpath("//input[@name='companyName' and @id = 'createLeadForm_companyName']"));
		 companyName.sendKeys("Tcs");
		 
		 WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstName' and @id = 'createLeadForm_firstName' ]"));
		 firstName.sendKeys("Loki");
		 
		 WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastName' and @id = 'createLeadForm_lastName' ]"));
		 lastName.sendKeys("Nagarajan");
		 
		 
		 WebElement createlead = driver.findElement(By.xpath("//input[@class = 'smallSubmit']"));
		 createlead.click();
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 

	}

}
