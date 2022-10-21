package switching;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingWindow {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://etrain.info/in");
		//get current window UniqueId
		String homePageWinId=driver.getWindowHandle();
		System.out.println("Home page window Id:"+homePageWinId);//w1
		//performing click operation to open Linkedin page in new Tab
		////i[@class='icon-linkedin']
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();
		//get all windows unique Ids which are opened by selenium currnt instance
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All windows ids:"+allWinIds);//w1,w2
		//remove home page window id from allwindowids  dn u will get child window id
		allWinIds.remove(homePageWinId);//removes w1 home window id
		System.out.println("after removing homewindowid"+allWinIds);
		//get child window id using iterator()
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		//now u can switch your control from main win to child window
		driver.switchTo().window(childWinId);
		//or
		//switch control to child window
		//driver.switchTo().window(allWinIds.iterator().next());
		//now u r allowed to identify any element from child window
		System.out.println("Linked in page title:"+driver.getTitle());
		System.out.println("linked in page url:"+driver.getCurrentUrl());
		//close current instance of browser
		//driver.close();
		//driver.quit();
		
		//switch back to home page window to perform any required operation on that
		driver.switchTo().window(homePageWinId);
		//now u r allowed to identify any element from home window
		System.out.println("etrain title:"+driver.getTitle());
		System.out.println("etrain url:"+driver.getCurrentUrl());
		//close current instance
		//driver.close();
		//close all the driver instances opened by webdriver
		//driver.quit();
		
		
		
		

	}

}
