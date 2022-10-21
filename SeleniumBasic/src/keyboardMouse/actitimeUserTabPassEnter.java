package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeUserTabPassEnter {

	public static void main(String[] args) throws InterruptedException {
		//set path for driver executable
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
//Craete a chrome driver obj n upcast it to the WebDriver interface
WebDriver driver=new ChromeDriver();
//maximize
driver.manage().window().maximize();
//add implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get appl url
driver.get("https://demo.actitime.com/login.do");
//inspect username n press Tab key
driver.findElement(By.id("username")).sendKeys("admin",Keys.ESCAPE);
//use timer-define exception-throws  InterruptedException
Thread.sleep(2000);
//inspect password n hit ENTER
driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);

	}

}
