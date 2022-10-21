package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtilities;


public class Example7 extends SeleniumUtilities {
@Test
public void loginLogoutInActitime()
{
	WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");
	System.out.println("before login page title:"+driver.getTitle());
	//identify the required element from the UI and perform required action 
	//driver.findElement(By.id("username")).sendKeys("admin");
	//or
	WebElement username=driver.findElement(By.id("username"));
	//validate username field is displayed or not
	//Assert.assertTrue(username.isDisplayed());
Assert.assertTrue(username.isDisplayed(),"locator mismatch or username field not displayed");
typeInput(username, "admin");
//identify password n do the req action
WebElement pass=driver.findElement(By.name("pwd"));
//pass.sendKeys("manager");
//typeInput(pass, "manager");
//or
typeInput(driver.findElement(By.name("pwd")),"manager");
Assert.assertTrue(pass.isDisplayed(),"locator mismatch or password field not display");
//login
driver.findElement(By.id("loginButton")).click();
//or
//performClick(driver.findElement(By.id("loginButton")));

//logout
WebElement logout=driver.findElement(By.linkText("Logout"));
//Explicit wait
WebDriverWait wait=new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(logout));
//

		System.out.println("After login page title: " +getTitle(driver));
//		if(getPageTitle().equals("")) {
//			System.out.println("Passed");
//		}else {
//			System.out.println("Failed");
//		}
		//validation using TestNG
		Assert.assertEquals(getTitle(driver), "actiTIME - Enter Time-Track");
		performClick(logout);
		//login page validation
		Assert.assertEquals(getTitle(driver), "actiTIME - Login","Login page validation is failed");
		//driver.close();

}
}
