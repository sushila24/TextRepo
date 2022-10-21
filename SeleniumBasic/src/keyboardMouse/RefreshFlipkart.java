package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshFlipkart {

	public static void main(String[] args) throws InterruptedException {
		//set path for driver executable
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
//craete an obj of chrome n upcast it to webdriver interface
WebDriver driver=new ChromeDriver();
//maximize
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get appl n  url
driver.get("https://www.flipkart.com/");
//avoid login popup
driver.findElement(By.cssSelector("html>body")).sendKeys(Keys.ESCAPE);//"body"
Thread.sleep(1500);
driver.findElement(By.cssSelector("html>body")).sendKeys(Keys.F5);//xml("//body")
/**ways to refresh page
 * 1.driver.navigate().refresh();
 * 2.press function key F5 .sendKeys(Keys.F5)
 * 3. hit url again
 * 4.Cntrl+R
 * */

	}

}
