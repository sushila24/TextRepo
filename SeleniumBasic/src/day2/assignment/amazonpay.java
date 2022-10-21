package day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonpay {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
String homePage="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
String actHomePage=driver.getTitle();
System.out.println("Home page Title:"+actHomePage);
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(2)")).click();
WebDriverWait wait=new WebDriverWait(driver,30);
String bestSellerTitle="Amazon.in Bestsellers: The most popular items on Amazon";
String actSellerTitle=driver.getTitle();
if(bestSellerTitle.equals(actSellerTitle))
{
	System.out.println("Best seller page validated");
}else

{
	System.out.println("Invalid Best seller page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************TodaysDeals******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(3)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String TodayDealsTitle="Amazon.in Great Indian Festival 2022";
String actTodayDealsTitle=driver.getTitle();
if(actTodayDealsTitle.equals(TodayDealsTitle))
{
	System.out.println("TodaysDeals page validated");
}else
{
	System.out.println("Invalid TodaysDeals page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Mobiles******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(4)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String MobilesTitle="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
String actMobilesTitle=driver.getTitle();
if(MobilesTitle.equals(actMobilesTitle))
{
	System.out.println("Mobiles page validated");
}else
{
	System.out.println("Invalid Mobiles page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Customer Service******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(5)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String CustServiceTitle="Help - Amazon Customer Service";
String actCustServiceTitle=driver.getTitle();
if(CustServiceTitle.equals(actCustServiceTitle))
{
	System.out.println("Customer Service page validated");
}else
{
	System.out.println("Invalid Customer Servicepage ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Book******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(6)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String BookTitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
String actBookTitle=driver.getTitle();
if(actBookTitle.equals(BookTitle))
{
	System.out.println("Book page validated");
}else
{
	System.out.println("Invalid Book page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Electronics******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(7)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String ElectronicsTitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
String actElectronicsTitle=driver.getTitle();
if(ElectronicsTitle.equals(actElectronicsTitle))
{
	System.out.println("Electronics page validated");
}else
{
	System.out.println("Invalid Electronics page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Fashion******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(8)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String FashionTitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
String actFashionTitle=driver.getTitle();
if(FashionTitle.equals(actFashionTitle))
{
	System.out.println("Fashion page validated");
}else
{
	System.out.println("Invalid Fashion page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Prime******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(9)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String PrimeTitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
String actPrimeTitle=driver.getTitle();
if(actPrimeTitle.equals(PrimeTitle))
{
	System.out.println("Prime page validated");
}else
{
	System.out.println("Invalid Prime page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************Home-Kitchen******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(10)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String HomeKitchenTitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
String actHomeKitchenTitle=driver.getTitle();
if(actHomeKitchenTitle.equals(HomeKitchenTitle))
{
	System.out.println("Home-Kitchen page validated");
}else
{
	System.out.println("Invalid Home-Kitchen page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
/************NewReleases******/
driver.findElement(By.cssSelector("div#nav-xshop>*:nth-child(11)")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
String NewReleasesTitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
String actNewReleasesTitle=driver.getTitle();
if(actNewReleasesTitle.equals(actNewReleasesTitle))
{
	System.out.println("NewReleases page validated");
}else
{
	System.out.println("Invalid NewReleases page ");
}
driver.navigate().back();
System.out.println("Home page:"+homePage.equals(driver.getTitle()));
	}

}
