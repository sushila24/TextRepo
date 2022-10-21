package day2.assignment;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
String title1=driver.getTitle();
System.out.println("Page title:"+title1);
Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);
//driver.manage().window().setSize(new Dimension(450,650));
//driver.findElement(By.tagName("a")).click();
driver.findElement(By.linkText("/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books")).click();
//fluent wait declaration
Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);
String title2=driver.getTitle();
System.out.println("Mobile Page title:"+title2);
Thread.sleep(3000);
driver.navigate().back();
String title3=driver.getTitle();
System.out.println("After navigating back title is:"+title3);
if(title1.equals(title3))
{
	System.out.println("Back to the homepage");
}
else
{
	System.out.println("Not back");
}
//driver.close();
	}

}
