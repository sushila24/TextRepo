package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//as the required element is in the frame we need to switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert popup msg:"+driver.switchTo().alert().getText());
		//to perform another action on alert ,we need to switch control again to alert
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

	}

}
