package switching;

import org.openqa.selenium.By;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class sortableItems {
 static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
	driver=	util.setUp("chrome", "https://jqueryui.com/");
	//inspect sortable n click on it
	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	//moving into the frame from main page
	//inspect the required frame
	WebElement e1=driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(e1);
	//driver.switchTo().frame(0);
	//WebElement e7=driver.findElement(By.cssSelector("ul.ui-sortable>*:nth-of-type(7)"));
    List<WebElement> list=driver.findElements(By.cssSelector("html[lang=\"en\"]>body>ul>li"));
   // Collections.sort(list);
    Actions act=new Actions(driver);
    for(int i=0;i<list.size();i++)
    {
    	System.out.println(list.get(i).getText());
    }
    WebElement target=driver.findElement(By.cssSelector("html[lang=\"en\"]>body>ul>li"));
    //public void dragandDrop(WebElement source,String )
    for(int j=6;j>=0;j--)
    {
    	
    act.dragAndDrop(list.get(j),target).perform();
    }
	}//iframe

}
