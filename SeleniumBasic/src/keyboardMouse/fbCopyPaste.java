package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbCopyPaste {

	public static void main(String[] args) {
		//set path for driver executable
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("admin");
		
		//firstname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//or
		Actions act=new Actions(driver);
		act.doubleClick(firstname).perform();
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//paste to lastname field
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		

	}

}
