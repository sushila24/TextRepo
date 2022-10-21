package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtilities {
 public static WebDriver driver=null;
 public static Actions action=null;
 public static WebDriverWait wait;
	public static void main(String[] args) {
		

	}
public WebDriver setUp(String browserName,String url)
{
	String path=null;
	if(browserName.equalsIgnoreCase("chrome"))
	{
		//use setUp() of WebDriverManager
		//WebDriverManager.chromedriver().setup();
		path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("firefox"))
	{
		//use setup() of WebDriverManager()
		//webDriverManager.firefoxdriver().setup();
		path=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver=new FirefoxDriver();
	}else
	{
		//use setup() of webdriver manager
		//WebDriverManager.iedriver().setup();
		path=System.getProperty("user.dir")+"\\executables\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		driver=new InternetExplorerDriver();
	}
	//maximize browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//get url
	driver.get(url);
	//webdriver wait
	wait=new WebDriverWait(driver,30);
	//actions
	action=new Actions(driver);
	
	return driver;
}
/******performClick********/
public void performClick(WebElement element)
{
	element.click();
}
//typeInput
public void typeInput(WebElement element,String text)
{
	element.clear();
	element.sendKeys(text);
}
//get current working directory
public String getCurrentWorkingDirectory()
{
	return System.getProperty("user.dir");
}
//copyTextFromField
public void copyTextFromField(WebElement element)
{
	action.doubleClick(element).perform();
	//or
	element.sendKeys(Keys.chord(Keys.CONTROL,"c"));
}

//paste text into field
public void pasteTextInToField(WebElement element)
{
	element.sendKeys(Keys.chord(Keys.CONTROL,"v"));
}
//copypastetext
public void copyPasteText(WebElement copyElement,WebElement pasteElement)
{
	action.doubleClick(copyElement).perform();
	copyElement.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	pasteElement.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
}
//waitTillElementIsClickable
public void waitTillElementIsClickable(WebElement element)
{
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
//getPropertyFile
public Properties getPropertyFile(String fileName)
{
	String filepath=getCurrentWorkingDirectory()+fileName;
	FileInputStream fis=null;
	try{
		fis=new FileInputStream(filepath);
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	Properties prop=new Properties();
	try {
		prop.load(fis);
	}catch (IOException e) {
		
		e.printStackTrace();
	}
	return prop;
}
//get value from property file
public String getValueFromPropertyFile(String fileName,String key)
{
	Properties prop=getPropertyFile(fileName);
	return prop.getProperty(key);
	
}
//takeScreenshot
public void takeScreenshot(String fileLocation)
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File screenshot=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screenshot,new File(fileLocation));
	    }catch(IOException e)
	{
	    	e.printStackTrace();
	}
}
//drag n drop
public void performDranAndDrop(WebElement src,WebElement target )
{
	action.moveToElement(src).dragAndDrop(src, target).build().perform();
}
//clean
public void cleanUp()
{
	driver.close();
}
//right click
public void rightClick(WebElement element)
{
	action.moveToElement(element).contextClick().build().perform();
}
//mousehover-chords
public void mousehoverWithChords(WebElement element,int x,int y)
{
	action.moveToElement(element,x,y).perform();
}
//mouse hover
public void mouseHover(WebElement element)
{
	action.moveToElement(element).perform();
}
//double click
public void doubleClick(WebElement element)
{
	action.doubleClick(element);
}
//title
public String getTitle(WebDriver driver)
{
	return driver.getTitle();
}
public String getTitle()
{
	return driver.getTitle();
}
//current url
public String currentUrl(WebDriver driver)
{
	return driver.getCurrentUrl();
}
//attribute
public String getattribute(WebElement element,String str)
{
	return element.getAttribute(str);
}
//innerText
public String getInnerText(WebElement element)
{
	return element.getText();
}
//select dropdown
public void selectDropdown(WebElement element)
{
	Select select=new Select(element);
	select.getOptions();
	select.getFirstSelectedOption();
	select.getAllSelectedOptions();
	
}
}
