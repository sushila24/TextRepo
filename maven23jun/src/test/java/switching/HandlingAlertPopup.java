package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingAlertPopup extends SeleniumUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver=s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//as the require element is present inside the frame,so need to switch our control inside frame control
driver.switchTo().frame(0);
driver.findElement(By.xpath("//button[text()='Try it']")).click();
System.out.println("Alert box text message:"+driver.switchTo().alert().getText());
//to perform another action on alert,we need to again switch our control to the alert
driver.switchTo().alert().accept();

	}

}
/**
 * In order to handle any javascript popup we need to use 
 * driver.switchTo().alert()
 * because java script popup doesnt contain HTML code
 * we use predefined functions of Alert to perform any operation on it
 * after every action control comes back to the main page
 * */
