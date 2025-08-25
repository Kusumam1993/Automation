package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public WebDriver driver;
	//browser initialization
		public void initializeBrowser()
		{
			
			driver = new ChromeDriver(); //actually creates the driver/browser object. ChromeDriver,FirefoxDriver,EdgeDriver - predefined driver class
			//driver = new FirefoxDriver();
			//WebDriverManager.edgedriver();
		    
			//driver = new EdgeDriver();
			driver.get("https://selenium.qabible.in/"); //launching the url in browser. In get method if the default value is null means - it is expecting a string value
			driver.manage().window().maximize(); //to maximize the window
		}
		public void browserClose() 
		{
			
			//driver.close();// close - closes the latest window opened
			//driver.quit(); //quit - closes all the windows opened
			
		}

	public static void main(String[] args) 
	{
		Base base = new Base();
		base.initializeBrowser();
		base.browserClose();
		

	}

}
