package opendriverwithWebDriverManager;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class OpenBrowserWithUtility {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://www.google.com");
		System.out.println(s1.getCurrentTitleOfApplication());

	}

}
