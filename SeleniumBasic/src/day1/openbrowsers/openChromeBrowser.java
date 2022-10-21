package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class openChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step1:using System.setProperty(key,value) set path for ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
//create an instance of ChromeDriver class
		//ChromeDriver cdriver=new ChromeDriver();
		WebDriver cdriver=new ChromeDriver();//runtime polymorphism
		//is-a-upcasting-overriding
	WebDriver fdriver=new FirefoxDriver();
	}
 
}
