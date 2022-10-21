package keyboardMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class resuablecode {
   public  static WebDriver driver=null;
	public static void main(String[] args) {
	driver=setup("chrome","https://www.google.com/");
	System.out.println("title:"+driver.getTitle());
	cleanUp();
	}
static WebDriver setup(String browserName,String url)
{
	String path;
	if(browserName.equalsIgnoreCase("chrome"))
	{
	 path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	//craete an instance of chrome n upcast it to webdriver inerface
     driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("firefox"))
	{
		path=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",path);
		driver=new FirefoxDriver();
		
	}else{
		path=System.getProperty("user.dir")+"\\executables\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path);
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
//enetr req url
	driver.get(url);
	return driver;
}

static void cleanUp()
{
	driver.close();
}
}
