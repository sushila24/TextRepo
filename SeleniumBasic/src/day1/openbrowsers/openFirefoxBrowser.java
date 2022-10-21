package day1.openbrowsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class openFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step1:using system.setProperty(key,value) set path for (Firefox)
//GeckoDriver.exe
System.setProperty("webdriver.gecko.driver","D:\\workspace\\SeleniumBasic\\executables\\geckodriver.exe");
//step 2.Create an instance of FirefoxDriver class
WebDriver fdriver = new FirefoxDriver();
//WebDriver FirefoxDriver fdriver=new FirefoxDriver();
	fdriver.close();
	}

}
