package assigmnentXML;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoTesting {

	public static void main(String[] args) {
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//set path for driver executable
System.setProperty("webdriver.chrome.driver",path);
//craete an instance of desired broeser n upcast it to web Driver interface
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//max window
driver.manage().window().setSize(new Dimension(450,550));
driver.manage().window().maximize();
//get url
driver.get("https://demo.automationtesting.in/Register.html");
WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
Select skillset=new Select(skills);
System.out.println("default:"+skillset.getFirstSelectedOption().getText());
List<WebElement> list=skillset.getOptions();
System.out.println("all options size:"+list.size());
for(int i=0;i<list.size();i++)
{
	System.out.println(i+":"+list.get(i).getText());
}

	}

}
