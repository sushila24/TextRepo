package Dropdown_calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {

	public static void main(String[] args) {
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.redbus.in/");
WebElement from=driver.findElement(By.id("src"));
from.click();
from.sendKeys("Pune");
driver.findElement(By.cssSelector("ul.autoFill.homeSearch>*:nth-child(2)")).click();
//craete an object of select
//Select from1=new Select(from);
//from.click().sendKeys("Pune");
WebElement dest=driver.findElement(By.id("dest"));
dest.click();
dest.sendKeys("Goa");//ul.autoFill.homeSearch>*:nth-child(2)
driver.findElement(By.cssSelector("ul.autoFill.homeSearch>*:nth-child(2)")).click();
driver.findElement(By.cssSelector("div.fl.search-box.date-box.gtm-onwardCalendar")).click();
driver.findElement(By.cssSelector("td.next")).click();
driver.findElement(By.cssSelector("div#rb-calendar_onward_cal>table>tbody>*:nth-child(4)>*:nth-child(4)")).click();
driver.findElement(By.id("search_btn")).click();
//ul.
driver.findElement(By.cssSelector("div.details>*:nth-child(3)>*:nth-child(4)>*:nth-child(2)")).click();
driver.findElement(By.cssSelector("div.filter-details.f-12.d-color>div.details>ul.list-chkbox>*:nth-child(3)>*:nth-child(2)")).click();
List<WebElement> buslist=driver.findElements(By.cssSelector("#result-section>*:nth-child(2) *:first-child>div.travels.lh-24.f-bold.d-color"));
	for(int i=0;i<buslist.size();i++)
	{
		System.out.println(buslist.get(i).getText());
	}
	
	}

}
