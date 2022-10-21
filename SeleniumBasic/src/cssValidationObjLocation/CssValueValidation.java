package cssValidationObjLocation;
/*open browser and vtiger appl
 * validate in login page-signIn button-displayed green color(code)
 * signin text size-16px
 * signIn white color code
 * Forgot password?-Blue color code
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssValueValidation {
	public static void main(String[] args) {
		//set path for driver executable
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
//create an obj of chrome browser and upcasting it to WebDriver interface
WebDriver driver=new ChromeDriver();
//maximize window
driver.manage().window().maximize();
//implicitly wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
//get url
driver.get("https://demo.vtiger.com/vtigercrm/index.php");
//inspect signIn button
WebElement signinButton=driver.findElement(By.cssSelector("button[type='submit']"));
//get background color
System.out.println("Background color:"+signinButton.getCssValue("background-image"));
//font color
System.out.println("SignIn font color:"+signinButton.getCssValue("color"));
//font size
System.out.println("sign In font size="+signinButton.getCssValue("font-size"));
//forgot password button
WebElement forgot=driver.findElement(By.cssSelector(".forgotPasswordLink"));
//forgot password text color
System.out.println("Fofgot password? color:"+forgot.getCssValue("color"));

	}

}
