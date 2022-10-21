package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseCopyPasteAutoTesting1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.automationtesting.in/Register.html");
//identify first name input field
WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
firstname.sendKeys("admin");
//create an instance of Actions class pass driver instance to its constructor
Actions act=new Actions(driver);
//with the help of Actions classs ref perform req operation
//act.moveToElement(firstname).doubleClick().sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
//copy text from firstname field
act.moveToElement(firstname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//locate lastname
WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//paste copied content to lastname field
act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
