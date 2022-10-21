package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//setting path for driver executable
System.setProperty("webdriver.chrome.driver",chromepath);
//craete an instance of chrome n upcast to webDriver
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com");
driver.manage().window().maximize();
//driver.manage().window().setSize(new Dimension(450,350));
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicit wait
//explicit wait -dynamic wait
WebDriverWait wait=new WebDriverWait(driver,30);
//identify and perform required operation
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
//click on login button
driver.findElement(By.id("loginButton")).click();
//wait for logout link to be loaded in the page
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
System.out.println("Home page title:"+driver.getTitle());
//add condition to wait using WebDriverWait instance
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
//click on logout 
driver.findElement(By.id("logoutLink")).click();
//close driver.close();
	}

}
