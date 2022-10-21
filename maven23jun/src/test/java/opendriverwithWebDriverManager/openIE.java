package opendriverwithWebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.iedriver().setup();//error NoSuchElementExce
WebDriver driver=new InternetExplorerDriver();
driver.get("https://www.google.com/");
	}

}
