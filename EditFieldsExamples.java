package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFieldsExamples {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		// Input value 
		
		WebElement emailAddress = driver.findElement(By.id("email"));
		emailAddress.sendKeys("loki@testleaf.com");
		
		// here to get the value in Get default text entered
		// 1st we identified WebElement 
		// Then by using .getAttribute getting the value and saving in string 
		// Last printing the value 

		WebElement getDefaultText = driver.findElement(By.name("username"));
		
		//getDefaultText.sendKeys("loki");
		
		
		String savingTheValue = getDefaultText.getAttribute("value");
		System.out.println(savingTheValue);
		
		
	// by using .clear() - clearing the value TestLeaf from Get default text entered

		getDefaultText.clear();
		
		

	}

}
