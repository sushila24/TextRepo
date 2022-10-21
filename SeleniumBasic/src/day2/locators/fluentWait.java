package day2.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//setting path for driver executable
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//creating an instance of chrome driver class and upcasting it to WebDriver interface
WebDriver driver=new ChromeDriver();
//To enter desired application url use get() of WebDriver interface
driver.get("https://demo.actitime.com");
//implicit wait for driver
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//identify username and passowrod element
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
//click on login botton
driver.findElement(By.id("loginButton")).click();
//fluent wait declaration
Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);//generic
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
System.out.println("Home page title:"+driver.getTitle());

//Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
//.withTimeout(Duration.ofSeconds(30))
//.pollingEvery(Duratio.ofSeconds(5))
//.ignoring(NoSuchElementException.class);

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LogoutLink")));
//System.out.println("Homepage:"+driver.getTitle());
	}

}
/*Wait wait=new fluentWait(WebDriver ref)driver
.withTimeout(Duration.ofseconds(30)0
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);*/

/*Wait<webDriver> wait=new Wait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(Exception.class);*/