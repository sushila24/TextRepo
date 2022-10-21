package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
	String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",chromepath);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
List<WebElement> mobilename=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h4>a"));
List<WebElement> mobileprice=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h5"));
System.out.println("first:"+mobilename.get(0).getText());
System.out.println("rate:"+mobileprice.get(0).getText());
for(int i=0;i<mobilename.size();i++)
{
	System.out.println(mobilename.get(i).getText()+"-->"+mobileprice.get(i).getText());
}
	}

}
