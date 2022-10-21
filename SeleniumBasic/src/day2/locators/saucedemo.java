package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
TC3: Open chrome browser
 *  Enter App url as https://www.saucedemo.com/
 *  Enter user name as standard_user 
 * Password as secret_sauce
 *  Click on login button Validate home page
*/
public class saucedemo {

	public static void main(String[] args) {
		//open browser
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//open application url
driver.get("https://www.saucedemo.com/");
//enter username as standard_user
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
//validate home page
String ExpTitle="Swag Labs";
String ActualTitle=driver.getTitle();
System.out.println("ExpTitle="+ExpTitle);
System.out.println("ActualTitle="+ActualTitle);
//validation will be failed to avoid this we will use explicitwait(conditional wait)
//conditional wait has 2 types webdriver wait 2.fluet wait
WebDriverWait wait=new WebDriverWait(driver,50);

wait.until(ExpectedConditions.titleIs("Swag Labs"));
if(ExpTitle.equals(ActualTitle))
{
	System.out.println("login Successful");
}
else
{
	System.out.println("Login Failed");
}
driver.findElement(By.id("login-button")).click();
//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
WebDriverWait wait1=new WebDriverWait(driver,50);
wait1.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
driver.findElement(By.id("react-burger-menu-btn")).click();
//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
driver.findElement(By.id("logout_sidebar_link")).click();
//driver.close();
	}

}
