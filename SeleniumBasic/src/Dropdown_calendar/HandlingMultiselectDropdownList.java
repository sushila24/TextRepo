package Dropdown_calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdownList {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://omayo.blogspot.com/");
//identify unique parent
WebElement multSelect=driver.findElement(By.id("multiselect1"));
//create an object of select class and pass above web element
Select carDropdown=new Select(multSelect);
//check whether multiple select or not
System.out.println("Is multiselected:"+carDropdown.isMultiple());
//default value
//WebElement SelectedOption=carDropdown.getFirstSelectedOption();
//String selectedOptionName=SelectedOption.getText();
//System.out.println("default:"+selectedOptionName);
//System.out.println("Default value selected:"+carDropdown.getFirstSelectedOption().getText());
//get option count
List<WebElement> options=carDropdown.getOptions();
System.out.println("Options count:"+options.size());
for(int i=0;i<options.size();i++)
{
System.out.println(i+":"+options.get(i).getText());
}
//select options from dropdown
carDropdown.selectByIndex(0);
carDropdown.selectByValue("Hyundaix");//selectByIndex(2);
carDropdown.selectByVisibleText("Audi");//selectByindex(3)
//get all the selected options
List<WebElement> selectCars=carDropdown.getAllSelectedOptions();
System.out.println("selected car count:"+selectCars.size());
//unselect already selected options
carDropdown.deselectByIndex(0);
carDropdown.deselectByValue("Hyundaix");
carDropdown.deselectByVisibleText("Audi");
//carDropdown.deselectAll();
	}

}
