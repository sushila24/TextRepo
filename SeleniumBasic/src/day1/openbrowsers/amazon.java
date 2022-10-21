package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 1:use System.setProperty("webdriver.chrome.driver","");
//to set path for driver executable 
System.setProperty("webdriver.gecko.driver","D:\\workspace\\SeleniumBasic\\executables\\geckodriver.exe");
//step2:create an instance of required driver class
WebDriver cdriver=new FirefoxDriver();
cdriver.get("https://www.amazon.in/");//https://www.amazon.in/
//open an appln link in the browser
String ActualURL=cdriver.getCurrentUrl();
String actaulTitle=cdriver.getTitle();
String expUrl="https://www.amazon.in/";
String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
System.out.println("Validate url:"+ActualURL.equals(expUrl));
System.out.println("title:"+actaulTitle.equals(expTitle));
System.out.println(actaulTitle);
String pagesource=cdriver.getPageSource();
System.out.println(pagesource.length());
	}

}
