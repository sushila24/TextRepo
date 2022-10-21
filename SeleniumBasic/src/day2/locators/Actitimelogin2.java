package day2.locators;
/*1.open chrome browser
2.enter application URL
3.enter username as admin
4. enter password as manager
5.click on login buttton
5.validate home page
6.click on logout button
7.validate login page
*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimelogin2 {

	public static void main(String[] args) {
		//set path for driver executable open chrome
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//create an instane of driver class
		WebDriver driver=new ChromeDriver();//cntrl+shift+o
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter app url
		driver.get("https://demo.actitime.com/login.do");
	//3.enter username element as admin
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		WebElement passwordField=driver.findElement(By.name("pwd"));
		passwordField.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//validation will be failed to avoid this we will use explicitwait(conditional wait)
				//conditional wait has 2 types webdriver wait 2.fluet wait
				WebDriverWait wait=new WebDriverWait(driver,20);//sec
//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		String ExpTitle="actiTIME - Enter Time-Track";
		String ActualTitle=driver.getTitle();
		
		if(ExpTitle.equals(ActualTitle))
		{
			System.out.println("login validation successful");
		}else
		{
			System.out.println("login validation failed");
		}
driver.findElement(By.id("logoutLink")).click();
driver.close();
	}

}
