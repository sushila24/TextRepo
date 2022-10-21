package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingFrames {
  static WebDriver driver;
	public static void main(String[] args) {
	SeleniumUtility util=new SeleniumUtility();
	driver=util.setUp("chrome", "https://jqueryui.com/");
	//inspect checkboxradio n click on it
	driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
	//taking control inside the frame from main page
	//identify the frame element
	WebElement e1=driver.findElement(By.cssSelector(".demo-frame"));
	//going inside frame using indexing(Starts from 0)depends no.of frames
	//driver.switchTo().frame(0);
	//swittch control to the frame
	driver.switchTo().frame(e1);
	driver.findElement(By.xpath("//label[@for='radio-1']")).click();
	//coming back to the main page from frame
	driver.switchTo().defaultContent();
	//click on logo
	driver.findElement(By.className("logo")).click();
	//util.cleanUp();

	}

}
