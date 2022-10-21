package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*TC4: Launch a new firefox browser.
 *  Open https://demosite.executeautomation.com/Login.html
 *   Get Page Title name and Title length Print Page Title and 
 *   Title length on the Eclipse Console. Get Page URL and
 *  verify if it is a correct page opened Enter username as “execution” 
 *  Enter password as “admin” Click on login button Get the page title and 
 *  current URL,print on console 
 *  Click on logout Close the Browser.
 */
public class executeAutomation {

	public static void main(String[] args) {
		//open firefox browser
System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//get app url
driver.get("https://demosite.executeautomation.com/Login.html");
//title
String title=driver.getTitle();
System.out.println("title:"+title);
System.out.println("titlelength:"+title.length());
//url
String expectedUrl="https://demosite.executeautomation.com/Login.html";
String actualUrl=driver.getCurrentUrl();
if(expectedUrl.equals(actualUrl))
{
	System.out.println("Page URL validated");
}
else
{
	System.out.println("Please enter correct URL");
	
}
//username:execution password:admin
driver.findElement(By.name("UserName")).sendKeys("execution");
driver.findElement(By.name("Password")).sendKeys("admin");
//click on login button
//driver.findElement(By.name("Login")).click();
//WebElement login=driver.findElement(By.name("Login"));//.click();//Login
//login.click();
driver.findElement(By.tagName("a")).click();
String afterLoginTitle=driver.getTitle();
System.out.println("Page Title after login:"+afterLoginTitle);
String c=driver.getCurrentUrl();
System.out.println("page url after login:"+afterLoginTitle);
//click on logout
WebElement logout=driver.findElement(By.tagName("a"));//cant locate element
//logout.click();
//driver.close();



	}

}
