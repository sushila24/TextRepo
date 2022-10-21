package keyboardMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtilities;

public class MouseOp5 {

	public static void main(String[] args) {
	SeleniumUtilities m1=new SeleniumUtilities();
	WebDriver driver=m1.setUp("chrome", "https://www.facebook.com");
//	WebElement element=driver.findElement(By.xpath("//a[text()='Create New Account']"));
//m1.performClick(element);
	//or
	m1.performClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
	WebElement usernameInputField=driver.findElement(By.name("firstname"));
	m1.typeInput(usernameInputField, "admin");
	//m1.copyTextFromField(usernameInputField);
	WebElement lastName=driver.findElement(By.name("lastname"));
	//m1.pasteTextInToField(lastName);
	m1.copyPasteText(usernameInputField, lastName);
	//m1.cleanUp();
	}

}
