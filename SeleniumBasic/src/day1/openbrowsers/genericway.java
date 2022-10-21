package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class genericway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 1:use System.setProperty(key,value) to set path for driver executable
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
		//step 2.create an instance of chrome driver class
		//create an instance of required browser class
		
		WebDriver cdriver=new ChromeDriver();
		//WebDriver fdriver=new FirefoxDriver();
		
	}

}
