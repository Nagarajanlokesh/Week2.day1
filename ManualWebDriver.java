package week2.day1;

public class ManualWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Manual method 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
// here we added driver in folder and specified that location 
		System.setProperty("\"webdriver.chrome.driver\"", "./drivers/chromedriver.exe");
		
		
	}

}
