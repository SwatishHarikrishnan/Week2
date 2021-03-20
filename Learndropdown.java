package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //for opening site
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; //for chromedriver setup need to import this library

public class Learndropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
		ChromeDriver driver = new ChromeDriver(); // creating a reference/object as driver
		driver.get("http://leaftaps.com/opentaps"); //using object and calling a method to open the url 
		driver.manage().window().maximize(); //now maximizing the windows
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // accesssing a username using id and passing input as DemoSalesManager
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // accesssing a password using id and passing input as crmsfa
		driver.findElement(By.className("decorativeSubmit")).click(); //clicking a login button using classname
		driver.findElementByLinkText("CRM/SFA").click(); //always a hyperlink using linktext
		driver.findElement(By.linkText("Create Lead")).click(); //accessing a submit button using linktext
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Plintron"); // accesssing a companyname using id and passing input as Plintron
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swatish"); // accesssing a Firstname using id and passing input as swatish
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Harikrishnan"); // accesssing a Lastname using id and passing input as Harikrishnan
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select ss=new Select(Source);
		ss.selectByVisibleText("Partner");
		WebElement Source1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ss1=new Select(Source1);
		ss1.selectByValue("CATRQ_AUTOMOBILE");
	    //driver.findElement(By.name("submitButton")).click(); //creating a lead by using name
	   
		

		

		
	}

}
