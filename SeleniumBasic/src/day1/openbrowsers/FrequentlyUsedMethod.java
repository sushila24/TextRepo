package day1.openbrowsers;
/*1.open chrome browser
 * 2.enter application url as  https://demo.actitime.com/login.do
 * 3.validate/verify following components in the login page
 * -title
 * - url
 * 4.close the browser
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUsedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 1:Use System.setProperty("webdriver.chrome.driver","path for driver executable")
		//set path for driver executable 
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
//step 2.create an instance of required browser class
WebDriver cdriver=new ChromeDriver();

//WebDriver fdriver=new FirefoxDriver();
	//enter the application URL
cdriver.get("https://demo.actitime.com/login.do");
//verify url and title
String actualUrl=cdriver.getCurrentUrl();
String actualTitle=cdriver.getTitle();
System.out.println("actualUrl:"+actualUrl);
System.out.println("actualTitle:"+actualTitle);
String expectedurl="https://demo.actitime.com/login.do";
String expectedTitle="actiTIME - Login";
System.out.println("URL validation:"+actualUrl.equals(expectedurl));//value compares
System.out.println("Title validation:"+actualTitle.equals(expectedTitle));//value
String pagesource=cdriver.getPageSource();
System.out.println("pageSource content:"+pagesource);
System.out.println("pageSource length:"+pagesource.length());
//close current browser
cdriver.close();

	
	}

}
