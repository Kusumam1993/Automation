package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
	public void  verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("Kusumam");//input values to that field.
		WebElement showbutton=driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement yourmsgbox=driver.findElement(By.id("message-one"));
		System.out.println(yourmsgbox.getText());//to get the input field value
		messagebox.clear();//clear that field.
		System.out.println(showbutton.getTagName());//to get the tag name
		System.out.println(showbutton.getCssValue("border-color"));//in css from we get value
		
	}

	public static void main(String[] args)
	{
		WebElementCommands cmds =new WebElementCommands();
		cmds.initializeBrowser();
		cmds.verifyWebElement();
		

	}

}
