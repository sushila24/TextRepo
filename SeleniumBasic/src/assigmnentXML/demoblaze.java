package assigmnentXML;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.demoblaze.com/");
WebElement name=driver.findElement(By.xpath("//a[text()='Sony xperia z5']"));
System.out.println("product:"+name.getText());
System.out.println("price:"+driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5")).getText());
	}

}
