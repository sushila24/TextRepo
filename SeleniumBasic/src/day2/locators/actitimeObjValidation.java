package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeObjValidation {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
WebElement username=driver.findElement(By.id("username"));
System.out.println("visible:"+username.isDisplayed());
System.out.println("Editible:"+username.isEnabled());
System.out.println("default:"+username.getAttribute("placeholder"));
WebElement pass=driver.findElement(By.name("pwd"));
System.out.println("visible:"+pass.isDisplayed());
System.out.println("Editible:"+pass.isEnabled());
System.out.println("default:"+pass.getAttribute("placeholder"));
WebElement login=driver.findElement(By.id("loginButton"));
System.out.println("visible:"+login.isDisplayed());
System.out.println("Editible:"+login.isEnabled());
System.out.println("button text:"+login.getText());
WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
System.out.println("is checkbox selected:"+checkbox.isSelected());
WebElement keeplog=driver.findElement(By.id("keepLoggedInLabel"));
System.out.println("Text of keep login:"+keeplog.getText());
	}

}
