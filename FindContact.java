package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.ThreadLocalUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //for opening site
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; //for chromedriver setup need to import this library

public class FindContact {

	public static void main(String[] args) throws InterruptedException {

		//setup chrome driver
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contacts")).click(); //clicking Contacts menu
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findContacts']")).click();//clicking find contacts
		Thread.sleep(2000);
		List<WebElement> values=driver.findElements(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)"));//clicking the first result ID
		values.get(0).click();//Clicking the first present id
		System.out.println("The first name of first selected result id is " +driver.findElement(By.id("viewContact_firstName_sp")).getText());//Printing the first name
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		driver.findElement(By.linkText("Remove")).click();; //to ensure to avoid duplicate values
		WebElement values1=driver.findElement(By.xpath("(//select[@name='marketingCampaignId'])[1]")); // webelement is assigned
		Select values2 = new Select(values1); //using select class, accessing the webelement
		values2.selectByValue("9000"); //now selecting by value
		driver.findElement(By.xpath("//input[@value='Add']")).click();//now clicking add button
		driver.findElement(By.name("departmentName")).clear(); //will clear if any data is present
		driver.findElement(By.name("departmentName")).sendKeys("Selenium Automation Testing");; //Passed the required input
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();//clicking update button
		String dynamic_marketvalue=driver.findElement(By.xpath("//span[@id='viewContact_marketingCampaigns_sp']")).getText();
		String static_marketvalue="eCommerce Site Internal Campaign";
		if(dynamic_marketvalue.contentEquals(static_marketvalue))
		{
			System.out.println("The marketing camapaign values are same");
		}
		else
		{
			System.out.println("The marketing camapaign values are not same");
		}
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title2.startsWith("View Contact"))
		{
			System.out.println("The title required for the respective page is proper");
		}
		else
		{
			System.out.println("The title required for the respective page is not proper");
		}	
	}

}
