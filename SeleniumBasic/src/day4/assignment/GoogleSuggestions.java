package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) {
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.findElement(By.name("q")).sendKeys("selenium");//ul.erkvQe>div>ul>li>div>*:nth-child(2)>div>span
List<WebElement> sugglist=driver.
findElements(By.cssSelector("ul.erkvQe>div>ul>li>div>*:nth-child(2)>div>span"));
System.out.println("first"+sugglist.get(0).getText());
for(int i=0;i<sugglist.size();i++)
{
	System.out.println(sugglist.get(i).getText());
}
	}

}
