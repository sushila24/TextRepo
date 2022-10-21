package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartScrollpageHomeEnd {

	public static void main(String[] args) throws InterruptedException {
		//set path for driver executable
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
//creat an instance of chrome driver n upcast it to webDriver Interface
WebDriver driver=new ChromeDriver();
//maximize
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//get app url
driver.get("https://www.flipkart.com/");
//press ESCAPE to avoid POPUP
WebElement body=driver.findElement(By.cssSelector("html>body"));
//xpath driver.findElement(By.xpath("//body"))
body.sendKeys(Keys.ESCAPE);
//scrolling page using PAGE-DOWN
for(int i=0;i<10;i++)
{
	body.sendKeys(Keys.PAGE_DOWN);
    Thread.sleep(1500);	
}
//goto Up -Top of the page
Thread.sleep(1500);
//Scrolling - directly goto top of the page
body.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));//.sendKeys(Keys.HOME)
Thread.sleep(1500);
//Thread.sleep(1500);
//Scrolling - directly goto bottom of the page
body.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));//sendKeys(Keys.END);
	}

}
