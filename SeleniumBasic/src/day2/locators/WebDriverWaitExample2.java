package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample2 {

	public static void main(String[] args) {
		//set path for driver executable
String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",chromepath);
//create an instance of firefox
WebDriver driver=new ChromeDriver();
driver.get("https://www.gmail.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//identify and perform required operation
driver.findElement(By.id("identifierId")).sendKeys("shailesh13.de");
driver.findElement(By.xpath("//span[text()='Next']")).click();
//explicit wait
WebDriverWait wait=new WebDriverWait(driver,30);
//add condition to wait using webdriverwait instance
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd"))).sendKeys("abc@123");
driver.findElement(By.xpath("//span[text()='Next'")).click();
//close driver.close();


	}

}
