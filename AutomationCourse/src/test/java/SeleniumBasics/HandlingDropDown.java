package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base
{
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(drop);
		select.selectByIndex(2);//choose index value based on index starting from 0,1,2
		select.selectByValue("sql");
		select.selectByVisibleText("C#");//visible dropdown text.
	}
	public void verifyCheckBox()
	{
	 driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
     WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
     checkbox.click();
     WebElement checkbox3=driver.findElement(By.xpath("//input[@value='option-3']"));
     checkbox3.click();//checkbox3 is already checked but we use again click method we have to uncheck that checkbox.
		
	}
	public void verifyRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	    WebElement radio =driver.findElement(By.xpath("//input[@value='yellow']"));
	    radio.click();
	}

	public static void main(String[] args) 
	{
		HandlingDropDown dropdown=new HandlingDropDown();
		dropdown.initializeBrowser();
		dropdown.verifyDropdown();
		dropdown.verifyCheckBox();
		dropdown.verifyRadiobutton();
		
		
	}

}
