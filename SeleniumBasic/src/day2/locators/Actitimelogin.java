package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

	public static void main(String[] args) {
		//step 1:use System.setProperty("webdriver.chrome.driver","v")
		//set path for driver executable 
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//.create an instance of req driver class
WebDriver driver=new ChromeDriver();//generic
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//step 2.enter appln url
driver.get("https://demo.actitime.com/login.do");

//step 3.enter username as admin
//locate that element
/*steps to locate username the element from UI
 * 
 */
WebElement usernameInputField=driver.findElement(By.id("username"));
//after identifing the web elemnet we can perform following operation
//1.type input--->sendKeys("")
//2.click-->click()
//3.delete existing text-->clear()
usernameInputField.sendKeys("admin");
//step4.enter password as manager
//identify password field
WebElement passwordInputField=driver.findElement(By.name("pwd"));
//type password as manager
passwordInputField.sendKeys("manager");
//step5.click on login button
//identify login button and click on it
driver.findElement(By.id("loginButton")).click();
//step 6.validate home page
String expTitle="actiTIME -  Enter Time-Track";
String actualTitle=driver.getTitle();
System.out.println("Expeced:"+expTitle);
System.out.println("Actual tile:"+actualTitle);
//validation will be failed
if(actualTitle.equals(expTitle))
{
	System.out.println("Login valdation Successful");
}
else
{
	System.out.println("Login validation is failed");
}
//find logout element and click on it
driver.findElement(By.id("logoutLink")).click();
//


//close the browser 
//driver.close();

	}

}
/*1.open chrome browser
2.enter application URL
3.enter username as admin
4. enter password as manager
5.click on login buttton
5.validate home page
6.click on logout button
7.validate login page
*/