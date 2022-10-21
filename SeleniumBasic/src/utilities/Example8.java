package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example8 {
@Test
public void loginLogoutInActitimeApplication()
{
	SeleniumUtilities s1=new SeleniumUtilities();
	WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
	System.out.println("Before login page title:"+s1.getTitle());
	//identify the required element from the UI and perform required action 0-30
	driver.findElement(By.id("username")).sendKeys("admin");
	//identify the required element from the UI and perform required action 0-30
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	WebElement logout=driver.findElement(By.linkText("Logout"));
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(logout));
	System.out.println("title before logout:"+s1.getTitle());
	logout.click();
	//driver.close()
}
}
