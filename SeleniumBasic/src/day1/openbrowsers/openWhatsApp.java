package day1.openbrowsers;
/*1.open chrome browser
 * 2.Enter url as https://web.whatsapp.com
 * 3.verify following elements
 * -Application URL
 * -title
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openWhatsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1:use System.setproperty("webdriver","driverexecutable .exe path")
				//set path for driver executable
				System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
				//step 2.craete an instance of chrome browser class
				WebDriver cdriver=new ChromeDriver();//runtime poly=Is-a-upcasting-overriding
				//enter the application url
				cdriver.get("https://web.whatsapp.com/");
				//verify URL n title
				//cdriver.
				String actualURL=cdriver.getCurrentUrl();
				String actualTitle=cdriver.getTitle();
				System.out.println("Actual URL:"+actualURL);
				System.out.println("Actaul title:"+actualTitle);
				String expectedURL="https://web.whatsapp.com/";
				String expectedTitle="WhatsApp";
				
				System.out.println("Validate url:"+actualURL.equals(expectedURL));
				System.out.println("Validate title:"+actualTitle.equals(expectedTitle));
				String pageSource=cdriver.getPageSource();
				System.out.println("Pagesource:"+pageSource);
				System.out.println("length:"+pageSource.length());
				cdriver.close();
				
	}

}
