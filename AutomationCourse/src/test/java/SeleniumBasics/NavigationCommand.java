package SeleniumBasics;

public class NavigationCommand extends Base
{
public void verifyCommands()
{
		
		//to - used to navigate to different pages of same app or to different app
		driver.navigate().to("https://www.amazon.in/"); //navigate from obsqura site to amazon site
		driver.navigate().back(); //navigate back to Obsqura
		driver.navigate().forward(); // navigate to Amazon
		driver.navigate().refresh(); // refresh the page
	}

	public static void main(String[] args)
	{
		NavigationCommand navigate = new NavigationCommand();
		navigate.initializeBrowser();
		navigate.verifyCommands();


	}

}
