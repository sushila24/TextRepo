package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoTestingCopyPaste {

	public static void main(String[] args) {
		//set path for driver executable
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
//craete an obj of desired browser n upcast it to WebDriver interface
WebDriver driver=new ChromeDriver();
//mwximize
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get app url
driver.get("http://demo.automationtesting.in/Register.html");
//inspect firstname n 
//username.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//type admin n Cntrl+A press select All
firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
//Cntrl+c copy the content
firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
//inspect last name
WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//paste copied content to lastname
lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}
