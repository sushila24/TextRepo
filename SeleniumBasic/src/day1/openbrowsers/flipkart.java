package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class flipkart {

	public static void main(String[] args) {
		//step 1:set path for driver executable
System.setProperty("webdriver.ie.driver","D:\\workspace\\SeleniumBasic\\executables\\IEDriverServer.exe");
//step2.create an instance of IE browser driver
WebDriver idriver=new InternetExplorerDriver();

idriver.get("https://www.flipkart.com/");
String actualTitle=idriver.getTitle();
String actualUrl=idriver.getCurrentUrl();
System.out.println(actualTitle);
System.out.println(actualUrl);
String exptitle="";
String expurl="";
System.out.println(actualUrl.equals(expurl));
System.out.println(actualTitle.equals(exptitle));
String source=idriver.getPageSource();
System.out.println(source.length());
	}

}
