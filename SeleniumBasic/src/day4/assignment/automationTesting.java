package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
List <WebElement> list1=driver.findElements(By.cssSelector("nav.navbar.navbar-inverse>div>*:nth-child(2)>ul>li"));
	System.out.println("Total count:"+list1.size());
	for(int i=0;i<list1.size();i++)
	{
		System.out.println(list1.get(i).getText());
	}
	
	}

}
