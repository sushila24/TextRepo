package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openIEDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 1: Use System.setProperty(key,value) to set path for IE  driver executable
		
System.setProperty("webdriver.IEDriverServer.driver","D:\\workspace\\SeleniumBasic\\executables\\IEDriverServer.exe");
//Step 2:create an instance of IEDriver class
WebDriver idriver=new EdgeDriver();

	}

}
