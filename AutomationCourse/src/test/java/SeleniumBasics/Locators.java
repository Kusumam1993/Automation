package SeleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base
{
public void verifyLocators()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//findElement is used to find a single element. findElements is used to find a multiple elements
		// locators are methods and it is present in inbuilt abstract class 'By'.
		// So to use the locators we use className.locator. eg: By.id
		driver.findElement(By.id("single-input-field")); 
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("description"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.partialLinkText("Radio"));
		//cssselector syntax-> tagname[attribute='attribute value']
		driver.findElement(By.cssSelector("button[id='button-one']"));
		//html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input----Absoulte X path
		//xpath syntax-> //tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));//locate elements using text we use text()
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));//In case lengthy text,we can use starting words to locate .
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); //and operator - to get more precision
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//or operator in xpath
		
		
		//Xpath accesss methods.
		//Parent access method
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		//Child access method
		//div[@class='card']//child::button[@id='button-one']
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		//following access method
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		//preceding access method
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		//ancestor access method
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor:: div[@class='card']"));
		//descendant access method
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}
	public static void main(String[] args)
	{
		Locators locate=new Locators();
		locate.initializeBrowser();
		locate.verifyLocators();
		
		
	}

}
