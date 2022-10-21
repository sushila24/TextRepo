package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class google {

	public static void main(String[] args) {
		// set path for driver executable
		System.setProperty("webdriver.ie.driver","D:\\workspace\\SeleniumBasic\\executables\\IEDriverServer.exe");
		//2.create an instance of InternerExplorer driver class 
		WebDriver idriver=new InternetExplorerDriver();
	idriver.get("https://www.youtube.com/");
	String title=idriver.getTitle();
	String url=idriver.getCurrentUrl();
	String expUrl="https://www.youtube.com/";
	String titl="YouTube";
	System.out.println(title+" :"+url);
	System.out.println(url.equals(expUrl));
	System.out.println(titl.equals(title));
	String pageSource=idriver.getPageSource();
	System.out.println(pageSource.length());

	}

}
