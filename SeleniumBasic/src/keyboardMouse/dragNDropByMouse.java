package keyboardMouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragNDropByMouse {

	public static void main(String[] args) throws InterruptedException {
		//set path for driver ececuatble
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
//create an onstance of chrome n upcast it To WebDriverr Interface
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebDriverWait wait=new WebDriverWait(driver,30);

driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//frame handling
WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
driver.switchTo().frame(frame);
//create an instance of actions class n pass driver to is constr
Actions act=new Actions(driver);
List<WebElement> sourceelements=driver.findElements(By.cssSelector("ul#gallery>li"));
WebElement target=driver.findElement(By.id("trash"));

//act.dragAndDrop(sourceelements.get(0),target).build().perform();
//act.dragAndDrop(sourceelements.get(1), target).build().perform();
//act.dragAndDrop(sourceelements.get(2), target).build().perform();
//act.dragAndDrop(sourceelements.get(3),target).build().perform();

//for above use for loop
for(int i=0;i<sourceelements.size();i++)
{
	//act.dragAndDrop(sourceelements.get(i),target).build().perform();
	performDragnDrop(act,sourceelements.get(i), target);
	Thread.sleep(1500);
}


	}
	
	static void performDragnDrop(Actions act,WebElement source,WebElement target)
	{
		act.dragAndDrop(source, target).build().perform();
	}

}
