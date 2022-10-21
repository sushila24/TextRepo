package browserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {

	public static void main(String[] args) {
String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",chromepath);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//identify username input field
WebElement username=driver.findElement(By.name("username"));
//basic validation on username input field
//1.isDisplayed()-visible 2.isEnabled()-editable or not
//3.default text
System.out.println("visible or  not:"+username.isDisplayed());
System.out.println("editabled or not:"+username.isEnabled());
System.out.println("default text:"+username.getAttribute("placeholder"));
//password validation

//identify login
WebElement loginb= driver.findElement(By.className("orangehrm-login-button"));//.click();
System.out.println("login displayed:"+loginb.isDisplayed());
System.out.println("functional:"+loginb.isEnabled());
System.out.println("button name:"+loginb.getText());



	}

}
