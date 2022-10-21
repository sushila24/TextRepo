package day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeMultiOperation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumBasic\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
driver.findElement(By.cssSelector("#container_tasks")).click();//("div.navBg>table>tbody>tr>*:nth-child(4)>a"));
String taskPageTitle="actiTIME -  Task List";
String actTaskPageTitle=driver.getTitle();
//System.out.println("Tasks page validation:"+actTaskPageTitle.equals(taskPageTitle));
driver.findElement(By.className("addNewButton")).click();
//div#taskManagementPage>div.ui-resizable>div>div>div.titleContainer>*:nth-child(3)>div
driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
driver.findElement(By.cssSelector("div.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div div.comboboxButton>*:nth-child(3)")).click();
//select big bang company
driver.findElement(By.cssSelector("div.customerSelector div.scrollableDropdownView div.searchItemList>*:nth-child(3)")).click();
//click on select project
driver.findElement(By.cssSelector("div.projectSelector.selectorWithPlaceholderContainer div.comboboxButton>*:nth-child(3)")).click();
driver.findElement(By.cssSelector("div.projectSelector *:nth-child(4)")).click();
driver.findElement(By.cssSelector("div.taskTableContainer>table>tbody>*:nth-child(1)>*:nth-child(1)>input.inputFieldWithPlaceholder")).sendKeys("Testing");
driver.findElement(By.cssSelector("div.taskTableContainer  *:nth-child(1)>*:nth-of-type(6) *:nth-child(3)")).click();
driver.findElement(By.cssSelector("div.commitButtonPlaceHolder")).click();
driver.findElement(By.cssSelector("div.taskRowsTableContainer *:nth-child(7)>*:nth-child(1)>div>div")).click();
driver.findElement(By.cssSelector("div.tasklist_components_bulkOperationsPanelContainer  *:nth-child(6)")).click();

	}

}
