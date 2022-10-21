package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.espncricinfo.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
String ExpTitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
String actualTitle=driver.getTitle();
System.out.println("");
if(ExpTitle.equals(actualTitle))
{
	System.out.println("Home page validate");
}
else
{
	System.out.println("Invalid");
}
//div.ds-popper-wrapper>a//div.ds-flex-1>div>div>a
List<WebElement> list1=driver.findElements(By.cssSelector("div.ds-popper-wrapper>a"));
System.out.println("count="+list1.size());
for(int i=0;i<list1.size();i++)
{
	System.out.println(list1.get(i).getText());
}

	}

}
