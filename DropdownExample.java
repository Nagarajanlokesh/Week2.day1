package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		// 1st Method - Index
		
		//1st Step = To get WebElement 
		WebElement dropDownbyIndexMethod = driver.findElement(By.id("dropdown1"));
		
		
		// 2nd Step = By using Select class creating object and passing the WebElement in arguments 
		
		Select drop1 = new Select(dropDownbyIndexMethod);
		
		// 3rdStep = Selecting the option by index method ( Index starts with 0
		
		drop1.selectByIndex(1);
		
		// 2nd Method - Text
		
		WebElement dropDownbyTextMethod = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dropDownbyTextMethod);
		drop2.selectByVisibleText("Appium");
		
		// 3rd Method - value
		
		WebElement dropDownbyValueMethod = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dropDownbyValueMethod);
		drop3.selectByValue("3");
		
		// if there is more options in dropdown we can use below way 
		// .getOptions() - this we get all the options in dropdown 
		//.size(); - this will get the overall size 
		//size-2 will provide last before value 
		WebElement DropDownSize = driver.findElement(By.className("dropdown"));
		Select drop4 = new Select(DropDownSize);
		int size = drop4.getOptions().size();
		drop4.selectByIndex(size-2);
		
		
		
		
		
		
		
		
		
	}

}
