package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitOrangeCRM {

	public static void main(String[] args) {
		//set path for driver executable 
String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", "chromepath");
//create an instance of chrome driver and upcast it to webdriver interface
WebDriver driver=new ChromeDriver();
//enter url
driver.get("https://opensource-demo.orangehrmlive.com/");
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//login page validation
String pageTitle=driver.getTitle();
System.out.println("page title:"+pageTitle);
System.out.println("page title length:"+pageTitle.length());
System.out.println("page title status:"+pageTitle.equals("OrangeHRM"));
String pageURL=driver.getCurrentUrl();
System.out.println("page URL :"+pageURL);
System.out.println("page url status:"+pageURL
.equals("https://opensource-demo.orangehrmlive.com/"));
String pageSource=driver.getPageSource();
System.out.println("page source="+pageSource);
System.out.println("length of pagesource:"+pageSource.length());
//identify username as Admin
//findElement() has returntype WebElement which will return web element from UI 
//it has para By-predefined class-static ()s-called locators in selenium
WebElement username=driver.findElement(By.name("username"));
username.sendKeys("Admin");
//driver.findElement(By.name("username")).sendKeys("Admin");
//password:admin123
WebElement password=driver.findElement(By.name("password"));
password.sendKeys("admin123");
//driver.findElement(By.name("password")).sendKeys("admin123");
//click on 

System.out.println();


	}

}
