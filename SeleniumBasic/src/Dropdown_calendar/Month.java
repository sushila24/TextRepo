package Dropdown_calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month {

	public static void main(String[] args) {
//System.setProperty("webdriver.ie.driver","D:\\workspace\\SeleniumBasic\\executables\\IEDriverServer.exe");
//WebDriver driver=new InternetExplorerDriver();
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.automationtesting.in/Register.html");
//identify the dropdown list
WebElement month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
//create an object of select class n pass above webelement to its constr
Select monthoption=new Select(month);
//check dropdown list is multi selected or not
System.out.println("Is month option multiselected:"+monthoption.isMultiple());
//default value
System.out.println("default month:"+monthoption.getFirstSelectedOption().getText());
//get all month options from dropdown
List<WebElement> monthmenu=monthoption.getOptions();
//get count of all months
System.out.println("months count="+monthmenu.size());

//System.out.println("sorted monthlist:"+Collections.sort(monthmenu));
//print all month menus
for(int i=0;i<monthmenu.size();i++)
{
	System.out.print(monthmenu.get(i).getText()+", ");
}
////validdate month list
System.out.println();
monthoption.selectByValue("September");
System.out.println("now selected month:"+monthoption.getFirstSelectedOption().getText());

String Exp_monthlist="January, February, March, April, May, June, July, August, "
		+ "September, October, November, December";
String actualMonthlist="";
for(int i=1;i<monthmenu.size();i++)
{
	if((monthmenu.size()-1)!=i)
	{
		actualMonthlist=actualMonthlist+monthmenu.get(i).getText()+", ";
	
	}
	else
	{
		actualMonthlist=actualMonthlist+monthmenu.get(i).getText();
	}
}
System.out.println("Actual monthlist:"+actualMonthlist);
System.out.println("Expected:"+Exp_monthlist);
System.out.println("Month list validated="+Exp_monthlist.equals(actualMonthlist));
	}

}
