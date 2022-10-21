package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*TC2: Open chrome browser
 *  Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
 *  Validate login page 
 *  Enter user name as Admin 
 * Password as admin123
 *  Click on login button Validate home page
 */
public class OrangeLive {

	public static void main(String[] args) {
		//1.open browser
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//creating an instance of chrome browser and upcasting it to WebDriver interface
WebDriver driver=new ChromeDriver();

//open url
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//implicit wait()
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//login page validation

//locate username put =Admin
WebElement username=driver.findElement(By.name("username"));
//WebElement username=driver.findElement(By.className("oxd-input oxd-input--active"));
username.sendKeys("Admin");
WebElement password=driver.findElement(By.name("password"));
password.sendKeys("admin123");
//validate login page
//validation will be failed to avoid this we will use explicitwait(conditional wait)
//conditional wait has 2 types webdriver wait 2.fluet wait
WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.titleIs("OrangeHRM"));

String ActualTitle=driver.getTitle();
System.out.println("ActualTitle:"+ActualTitle);
String ExpTitle="OrangeHRM";
System.out.println("login validation:"+ExpTitle.equals(ActualTitle));
//click on login button
WebElement login=driver.findElement(By.tagName("button"));
//driver.findElement(By.tagName("button")).click();
//WebElement login=driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
login.click();
//homepage
//validation will be failed to avoid this we will use explicitwait(conditional wait)
//conditional wait has 2 types webdriver wait 2.fluet wait
	//driver.close();
	}

}
