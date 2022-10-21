package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1.open chrome browser
 * 2.enter URL as https://web.whatsapp.com/
 * 3.verify/vlidate following components
 * -Title
 * -application URL
 * 4.close the browser
 */
public class openFacebook {

	public static void main(String[] args) {
		//step 1>use System.setProperty("webdriver.chrome.driver","path of driver exe ")
		//set path for driver executable file
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
//step 2.create an instance of required browser
WebDriver cdriver=new ChromeDriver();
//WebDriver fdriver=new FirefoxDriver();
//enter the application URL
cdriver.get("https://www.facebook.com");
//validate url n title
String currenturl=cdriver.getCurrentUrl();
String currentTitle=cdriver.getTitle();
System.out.println("CurrentURL:"+currenturl);//www.facebook.com/
System.out.println("current title:"+currentTitle);//Facebook – log in or sign up
//expected url n title
String expUrl="https://www.facebook.com/";
String expTitle="Log in to Facebook";//Facebook – log in or sign up

System.out.println("Validate URL:"+currenturl.equals(expUrl));//value compare
System.out.println("validate title:"+currentTitle.equals(expTitle));//value

cdriver.close();
		

	}

}
