package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> list=driver.findElements(By.cssSelector("div._331-kn>div>div>div.eFQ30H"));
String exp="https://flipkart.com/";
String  actualurl=driver.getCurrentUrl();
String expTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
String actualTitle=driver.getTitle();
System.out.println("page validation:"+expTitle.equals(actualTitle));

List<WebElement> list1=driver.findElements(By.cssSelector("div.xtXmba"));
System.out.println("count"+list1.size());
for(int i=0;i<list1.size();i++)
{
	System.out.println(list1.get(i).getText());
}
	}

}
