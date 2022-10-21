package Dropdown_calendar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validate_day {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromeDriver.exe");// null)
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.automationtesting.in/Register.html");
//find common parent of dropdown day menu element
WebElement day=driver.findElement(By.id("daybox"));
//create an object of select class and pass this element to its constr
Select dayMenu=new Select(day);
//is mulitiple
System.out.println("Is multiselected :"+dayMenu.isMultiple());
//default value
System.out.println("Default day:"+dayMenu.getFirstSelectedOption().getText());
//get all days
List<WebElement> daysOptions=dayMenu.getOptions();
System.out.println("size days:"+daysOptions.size());
for(int i=0;i<daysOptions.size();i++)
{
	System.out.print(daysOptions.get(i).getText()+",");
}
System.out.println();
dayMenu.selectByIndex(20);
System.out.println("now selected day :"+dayMenu.getFirstSelectedOption().getText());

String exp_day="1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31";
String act_day="";
for(int i=1;i<daysOptions.size();i++)
{
	if((daysOptions.size()-1)!=i)
	{
		act_day=act_day+daysOptions.get(i).getText()+",";
	}
	else
	{
		act_day=act_day+daysOptions.get(i).getText();
	}
}
System.out.println("Actual days:"+act_day);
System.out.println("Expected days:"+exp_day);
System.out.println("Validate days:"+act_day.equals(exp_day));
List<Integer> days=new ArrayList<Integer>();
for(int j=1;j<dayMenu.getOptions().size();j++)
{
	String All_days=dayMenu.getOptions().get(j).getText();
	days.add(Integer.parseInt(All_days));
}
Collections.sort(days);
List<Integer> copy=new ArrayList<Integer>();
copy.addAll(days);
System.out.println(days.equals(copy));
	}

}
