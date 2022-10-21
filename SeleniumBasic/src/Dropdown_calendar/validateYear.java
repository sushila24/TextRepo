package Dropdown_calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class validateYear {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","D:\\workspace\\SeleniumBasic\\executables\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.automationtesting.in/Register.html");
//identify the dropdown list
WebElement year =driver.findElement(By.id("yearbox"));
//create an onject of select class n pass above web element to its constructor
Select selectyear=new Select(year);
//check whether dropdown list is multiselected or not
System.out.println("Is multiselected:"+selectyear.isMultiple());
//get default already selected option
System.out.println("default year option:"+selectyear.getFirstSelectedOption().getText());
//get options count
//System.out.println("year count:"+selectyear.getOptions().size());
List<WebElement> yearoptions=selectyear.getOptions();
System.out.println("year options count:"+yearoptions.size());
//get dropdown year option names
for(int i=0;i<yearoptions.size();i++)
{
	System.out.print(yearoptions.get(i).getText()+", ");
}
	//select year 2011 fromdropdown 
selectyear.selectByVisibleText("2011");
System.out.println("selected option:"+selectyear.getFirstSelectedOption().getText());
//validate year is in ascending order
String exp_yearstring="1916, 1917, 1918, 1919, 1920, 1921, 1922, 1923, 1924, 1925, 1926, 1927, 1928, 1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945, "
		+ "1946, 1947, 1948, 1949, 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, "
		+ "1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971 ,"
		+ "1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, "
		+ "1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, "
		+ "2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015";
String yearstring="";
for (int i=1;i<yearoptions.size();i++)
{
	if((yearoptions.size()-1)!=i)
	{
		yearstring=yearstring+yearoptions.get(i).getText()+", ";
	}
	else
	{
		yearstring=yearstring+yearoptions.get(i).getText();
	}
	
	
}
System.out.println("Actual years:"+yearstring);
System.out.println("Expected years:"+exp_yearstring);
System.out.println("is years are in ascending order:"+yearstring.equals(exp_yearstring));
	}

}
