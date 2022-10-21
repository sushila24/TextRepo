package keyboardMouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class globalsqaMouseHoverOnMenus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.globalsqa.com/demo-site/");
List<WebElement> menus=driver.findElements(By.cssSelector("div.dark_menu>div>ul>li"));
//xpath("//div[@id="menu"]/ul/li/a")
System.out.println("list menu count:"+menus.size());
//create an instance of Actions class n pass driver obj to its constr
Actions act=new Actions(driver);
//to do hover on Home option
act.moveToElement(menus.get(0)).perform();
//hover on all menus
for(int i=0;i<menus.size();i++)
{
	WebElement option=menus.get(i);
	act.moveToElement(option).perform();
	Thread.sleep(2000);
}
//call all the functions
mouseHoverOnAllMenus(act,menus);
mouseHoverOverElement(act,menus.get(1));
mouseHoverWithchords(act,menus.get(2),100,0);
rightClick(act,menus.get(3));
	}//main end
	
	//mouse Hover on all the menus
	static void mouseHoverOnAllMenus(Actions act,List<WebElement> mainmenu) throws InterruptedException
	{
		for(int i=0;i<mainmenu.size();i++)
		{
			WebElement element=mainmenu.get(i);
			act.moveToElement(element).perform();
			Thread.sleep(1500);
		}
	}
	//mouseHover operation on particular element
	static void mouseHoverOverElement(Actions act,WebElement element)
	{
		act.moveToElement(element).perform();
	}
	
//right click
static void rightClick(Actions act,WebElement element)
{
	System.out.println("Element :"+element.getText());
    act.moveToElement(element).contextClick().build().perform();	
  //act.contextClick(element).build().perform();
}
	
//mouse hover operation with chords
static void mouseHoverWithchords(Actions act,WebElement option,int x,int y)
{
	System.out.println("option:"+option.getText());
	act.moveToElement(option,x,y).build().perform();
	
}
}
