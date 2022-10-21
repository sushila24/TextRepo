package assigmnentXML;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartSamsungPrice {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","D:\\workspace\\SeleniumBasic\\executables\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().setSize(new Dimension(550,670));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/televisions/pr?sid=ckf%2Cczl&p%5B%5D=facets"
		+ ".availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&otracker="
		+ "categorytree&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&p%5B%5D=facets.b"
		+ "rand%255B%255D%3DSamsung&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Samsung");
WebElement product=driver.findElement(By.xpath("//div[text()='SAMSUNG 80 cm (32 Inch) HD Ready LED Smart Tizen TV with 2022 Model']"));
System.out.println("Tv:"+product.getText());
////div[text()='SAMSUNG 80 cm (32 Inch) HD Ready LED Smart Tizen TV with 2022 Model']
WebElement price=driver.findElement(By.xpath("//div[div[div[text()='SAMSUNG 80 cm (32 Inch) HD Ready LED Smart Tizen TV with 2022 Model']]]/div/div/div/div[contains(@class,'_1_WHN1')]"));
		System.out.println("price:"+price.getText());
	}

}
