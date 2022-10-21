package assigmnentXML;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
driver.get("https://www.espncricinfo.com/");
List<WebElement> livesc=driver.findElements(By.xpath("//div[div[a[text()='Live Scores']]]"));
System.out.println(livesc.size());
for(int i=0;i<livesc.size();i++)
{
	System.out.println(livesc.get(i).getText());
}
	}
	
}
