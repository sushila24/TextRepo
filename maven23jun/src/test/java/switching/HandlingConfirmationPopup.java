package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
System.out.println("alert msg"+driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();

	}

}
