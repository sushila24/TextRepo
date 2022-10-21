package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samsungArenagsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//div.makers>ul>li
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.gsmarena.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
String exp="GSMArena.com - mobile phone reviews, news, specifications and more...";
String actual=driver.getTitle();
if(exp.equals(actual))
{
	System.out.println("validate");
}
else
{
	System.out.println("Not validate");
}
driver.findElement(By.cssSelector("div.brandmenu-v2>*:nth-child(2)>li>a")).click();

List<WebElement> list1=driver.findElements(By.cssSelector("div#review-body>div>ul>li"));
//div#review-body>div.makers>ul>li
System.out.println("Device count:"+list1.size());
for(int i=0;i<list1.size();i++)
{
	System.out.println(i+"->"+list1.get(i).getText());
}
	}

}
