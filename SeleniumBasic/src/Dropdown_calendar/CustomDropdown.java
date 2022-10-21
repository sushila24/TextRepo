package Dropdown_calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropdown {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();//driver.manage().window().setSize(new Dimension(450.650))
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
WebDriverWait wait=new WebDriverWait(driver,20);
//get common parent
WebElement dropdown=driver.findElement(By.id("bsd1-button"));
//wait.until(ExpectedConditions.elementToBeClickable(dropdown));
//identify dropdown list and click on it
dropdown.click();
//identify all element and store them into list
List<WebElement> options=driver.findElements(By.cssSelector("div.dropdown-menu.dropdown-menu-right>div>a"));
//get option count
System.out.println("Country counts:"+options.size());
//use for loop to print 1-1 options
for(int i=0;i<options.size();i++)
{
	System.out.println(options.get(i).getText());
}
//select 3rd country
options.get(2).click();


	}

}
