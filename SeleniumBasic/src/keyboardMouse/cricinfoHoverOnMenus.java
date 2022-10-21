package keyboardMouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cricinfoHoverOnMenus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver  driver  =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.espncricinfo.com/");
List<WebElement> menus=driver.findElements(By.cssSelector("div.ds-flex-1>div>div>a"));
Actions act=new Actions(driver);

//call ()
hoverOnMenus(act,menus);
 	}

	static void hoverOnMenus(Actions act,List<WebElement> menus) throws InterruptedException
	 {
		for(int i=0;i<menus.size();i++)
		{
			WebElement element=menus.get(i);
			act.moveToElement(element).build().perform();
			Thread.sleep(1500);
		} 
	 }
}
