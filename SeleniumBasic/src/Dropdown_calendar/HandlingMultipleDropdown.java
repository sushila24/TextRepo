package Dropdown_calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDropdown {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
//craete an instance of select class and pass above web element to its constructor
		Select selectskill=new Select(skillDropdown);
//check whether dropdown is multiselect or not
System.out.println("multiselect or not:"+selectskill.isMultiple());
//get default or alraedy selected option
//WebElement selectedoption=selectskill.getFirstSelectedOption();
//String selectedoptionName=selectedoption.getText();
//System.out.println("default selected"+selectedoptionName);
//or
System.out.println("Already selected option:"+selectskill.getFirstSelectedOption().getText());
//get option count
//System.out.println("option count:"+selectskill.getOptions().size());
List<WebElement> options=selectskill.getOptions();
System.out.println("Option count:"+options.size());
//get dropdown option names
for(int i=0;i<options.size();i++)
{
	System.out.println(i+":"+options.get(i).getText());
}
//select option from dropdown
selectskill.selectByIndex(4);
System.out.println("alraedy selected option:"+selectskill.getFirstSelectedOption().getText());
//ToDo:validation dropdown skills are getting displayed in ascending order
//checking the order of skills
String skillName="";
String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, "
		+ "Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, "
		+ "Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, "
		+ "Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, "
		+ "Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, "
		+ "Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, "
		+ "Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, "
		+ "Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, "
		+ "Programming, "
		+ "PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, "
		+ "Support, Systems Administration, Tech Support,"
		+ " Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
//get dropdoen option names
for(int i=1;i<options.size();i++)
{
	if((options.size()-1)!=i)
	{
		skillName=skillName+options.get(i).getText()+", ";
	}
	else
	{
		skillName=skillName+options.get(i).getText();
	}
}
//Expected skills

System.out.println("skillName:"+skillName);
System.out.println("Expected skillname:"+exp_skillName);
System.out.println("Is skillset is in ascending order:"+exp_skillName.equals(skillName));
	}

}
