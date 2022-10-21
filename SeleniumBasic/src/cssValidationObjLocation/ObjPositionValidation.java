package cssValidationObjLocation;
/*open browser n enter actitime url
 * click on login button 
 * with username n password empty validate error msg displayed in red color
 * vALIdate error msg is above username field
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ObjPositionValidation {
	public static void main(String[] args) {
		//set path for driver executable
String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
//cretae an obj of chrome browser n upcast it to WebDriver Interface
WebDriver driver=new ChromeDriver();
//maximize
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get url appl
driver.get("https://demo.actitime.com/login.do");
//inspect login button
driver.findElement(By.id("loginButton")).click();
//valiadte error msg in red color
WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
System.out.println("err:"+errorMsg.getText());

System.out.println("Error msg color:"+errorMsg.getCssValue("color"));
//verify error msg is above username
//find position of error msg use-getLocation()-point class obj returns
Point point=errorMsg.getLocation();
int ErrX=point.getX();
int ErrY=point.getY();
System.out.println("X co-ordinate of error msg:"+ErrX);
System.out.println("y co-ordinates of error msg"+ErrY);
//get username field location
WebElement username=driver.findElement(By.id("username"));
Point usernamept=username.getLocation();
int userX=usernamept.getX();
int userY=usernamept.getY();
System.out.println("username x:"+userX+"Y:"+userY);
//System.out.println("error msg location validation:"+(point.getY()<usernamept.getY()));
System.out.println("Is error msg displayd above username:"+(ErrY<userY));
//is password displayed below username
WebElement pass=driver.findElement(By.name("pwd"));
//find password location
Point pwd=pass.getLocation();
int pwdX=pwd.getX();
int pwdY=pwd.getY();
System.out.println("Password X coordinate:"+pwdX+"Y:"+pwdY);
System.out.println("is password below username:"+(userY<pwdY));
	}

}
