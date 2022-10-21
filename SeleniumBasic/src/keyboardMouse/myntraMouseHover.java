package keyboardMouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntraMouseHover {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium="
		+ "perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_"
		+ "SOK&gclid=EAIaIQobChMI4O2SpczY-gIV2ZZLBR1fbAmZEAAYASAAEgJIEvD_BwE");
List<WebElement> menus=driver.findElements(By.cssSelector("div.desktop-navLinks>div>div>a"));
Actions act=new Actions(driver);
//for(int i=0;i<menus.size();i++)
//{
//	WebElement element=menus.get(i);
//	act.moveToElement(element).perform();
//	Thread.sleep(1500);
//}
mouseHoverOnMenus(act,menus);
	}

	static void mouseHoverOnMenus(Actions act,List<WebElement> menus) throws InterruptedException
	{
		for(int i=0;i<menus.size();i++)
		{
		WebElement element=menus.get(i);
		act.moveToElement(element).perform();
		Thread.sleep(1500);
		}
	}
}
