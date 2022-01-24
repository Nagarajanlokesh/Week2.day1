package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestLeaf {

	public static void main(String[] args) {
		
		// We use WebDriverManager class here as we have already added the wendriver dependency in  pom file 
		// chromedriver is file 
		
            WebDriverManager.chromedriver().setup();
		
		// ChromeDriver is Class here, driver is object 
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 // To get the URL we use driver.get 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 // To maximize the window we use below code 
		 
		 driver.manage().window().maximize();
		 
		 
		 // To verify whether we launched correct page - we use driver.gettitle()
		 // Control+2, L is the shortcut to declare variable 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		WebElement username =      driver.findElement(By.id("username"));
		 username.sendKeys("DemoSalesManager");
		 
		 WebElement password =      driver.findElement(By.id("password"));
		 password.sendKeys("crmsfa");
		 
		 WebElement clickButton =      driver.findElement(By.className("decorativeSubmit"));
		 clickButton.click();
		 
		 // CRM/SFA is a link text. Text will be in black colour 
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();

		 
		 
		 
		 
		 
		 
		 
		 

	}

}
