package browserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String chrome=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",chrome);
WebDriver driver=new ChromeDriver();
//explicit wait-static wait
Thread.sleep(2000);
//driver.get("");
driver.manage().window().maximize();
//explictwait-static wait
Thread.sleep(2000);
//set browser window size
driver.manage().window().setSize(new Dimension(650,450));
//explicit wait-static wait
Thread.sleep(2000);
//maximize browser window
driver.manage().window().maximize();
//app url
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//identify n click login
driver.findElement(By.className("orangehrm-login-button")).click();
//explicit wait-static wait
Thread.sleep(2000);
//come back to the previous page
driver.navigate().back();
//explicit wait-static
Thread.sleep(2000);
//come back to the next page
driver.navigate().forward();
//explicit wait-static
Thread.sleep(2000);
//to reload the current page
driver.navigate().refresh();
//explicit static
Thread.sleep(2000);
//to move to diffn url
driver.navigate().to("https://www.google.com");
	}

}
