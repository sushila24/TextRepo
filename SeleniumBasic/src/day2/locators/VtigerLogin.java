package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC1:open a chrome browser enter vtiger application 
 * url- https://demo.vtiger.com/vtigercrm/index.php 
 * validation login page open or not
 *  remove existing text from username field type username as 'admin' 
 *  remove existing text from password field type password as 'Test@123' 
 *  click on login button
 */
public class VtigerLogin {

	public static void main(String[] args) {
		//Setup path for driver executable-
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//open chrome
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enetr URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//locate username field from UI and clear text
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		//locate password field and clear and enter Test@123
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
		//validation will be failed to avoid this we will use explicitwait(conditional wait)
		//conditional wait has 2 types webdriver wait 2.fluet wait
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.titleIs("vtiger"));
		String ExpTitle="vtiger";
		String actualTitle=driver.getTitle();
		System.out.println("Expected title:"+ExpTitle);
		System.out.println("actual title="+actualTitle);
		if(actualTitle.equals(ExpTitle))
		{
			System.out.println("login page validation success");
		}
		else
		{
			System.out.println("Failed");
		}
		
		WebElement signIn=driver.findElement(By.tagName("button"));
		signIn.click();//button buttonBlue
		//driver.findElement(By.className("button buttonBlue")).click();
		//driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
//driver.close();
	}

}
