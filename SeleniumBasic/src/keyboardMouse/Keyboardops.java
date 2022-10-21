package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardops {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
//using escape of keyboard to avoid login popup
driver.findElement(By.cssSelector("html>body")).sendKeys(Keys.ESCAPE);
//for keyboard use Keys class's methods
//to press escape use
//locate.sendKeys(Keys.ESCAPE)
	}

}
