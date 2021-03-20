package week2.day1;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.tools.ant.taskdefs.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps"); //Login to my required url
		driver.manage().window().maximize(); //Maximized my login session in chrome
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager"); //Passing input for username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //passing input for password
		driver.findElement(By.className("decorativeSubmit")).click(); //click login button
		driver.findElement(By.linkText("CRM/SFA")).click(); //clicking hyperlink
		driver.findElement(By.linkText("Accounts")).click(); //clicking accounts menu
		driver.findElement(By.linkText("Create Account")).click(); //clicking create account menu
		driver.findElement(By.id("accountName")).sendKeys("SWATISH"); //passing input for account name
		driver.findElement(By.name("parentPartyId")).sendKeys("demoClass1"); //passing dummy input
		driver.findElement(By.id("groupNameLocal")).sendKeys("SWAT"); //Passing local name as input
		driver.findElement(By.id("officeSiteName")).sendKeys("WELCOME_SWAT_WEBSITE"); //Passing company site name as input
		driver.findElement(By.id("annualRevenue")).sendKeys("500 CRORES"); //Passing input for annual revenue of company
		driver.findElement(By.id("numberEmployees")).sendKeys("1000"); //Passing input for number of employees in an organization
		driver.findElement(By.id("sicCode")).sendKeys("600049"); //passing the code in put
		driver.findElement(By.id("tickerSymbol")).sendKeys("123"); //Passing the ticket symbol input
		driver.findElement(By.name("description")).sendKeys("Employee Friendly"); //Description of the company
		driver.findElement(By.name("importantNote")).sendKeys("Be honest and trustful"); //Important note to be followed
		WebElement Industry=driver.findElement(By.name("industryEnumId")); //Creating a webelement for industry drop down
		Select in=new Select(Industry);
		in.selectByValue("IND_SOFTWARE");
		WebElement currency=driver.findElement(By.name("currencyUomId"));//Creating a webelement for industry drop down
		Select in1=new Select(currency);
		in1.selectByValue("INR");
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));//Creating a webelement for ownership drop down
		Select in2=new Select(ownership);
		in2.selectByValue("OWN_PARTNERSHIP");
		WebElement Marketing_campaign=driver.findElement(By.name("marketingCampaignId"));//Creating a webelement for Marketing_campaign drop down
		Select in3=new Select(Marketing_campaign);
		in3.selectByValue("CATRQ_CARNDRIVER");
		WebElement source=driver.findElement(By.name("dataSourceId"));//Creating a webelement for  source drop down
		Select in4=new Select(source);
		in4.selectByValue("LEAD_EMPLOYEE");
		WebElement Initial_Team=driver.findElement(By.name("initialTeamPartyId"));//Creating a webelement for Initial_Team drop down
		Select in5=new Select(Initial_Team);
		in5.selectByValue("DemoSalesTeam2");
		WebElement Country=driver.findElement(By.name("generalCountryGeoId"));//Creating a webelement for Country drop down
		Select in6=new Select(Country);
		in6.selectByValue("IND");
		driver.findElement(By.id("primaryPhoneCountryCode")).clear();; //clearing the existing input
		driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("91"); //Passing phone country code input
		driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("9144"); //area code
		driver.findElement(By.id("primaryPhoneExtension")).sendKeys("6802"); //extension
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("8015235936");//primary phone number
		driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Manager");//phoneaskforname
		driver.findElement(By.id("primaryEmail")).sendKeys("swatishkrishnan@gmail.com");//email id
		driver.findElement(By.id("primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");//url
		driver.findElement(By.id("generalToName")).sendKeys("Swatish");//name
		driver.findElement(By.id("generalAttnName")).sendKeys("Swatish_Harikrishnan");//attend name
		driver.findElement(By.id("generalAddress1")).sendKeys("9/71 B type 46th street");//address 1
		driver.findElement(By.id("generalAddress2")).sendKeys("9/71 B type 46th street");//address3
		driver.findElement(By.id("generalCity")).sendKeys("Chennai");//city
		driver.findElement(By.name("generalPostalCode")).sendKeys("600049");//postal code
		driver.findElement(By.id("generalPostalCodeExt")).sendKeys("6803");//postal code extension
		WebElement State=driver.findElement(By.id("generalStateProvinceGeoId"));//state code
		Select in7=new Select(State);
		in7.selectByValue("IN-TN");
		driver.findElement(By.className("smallSubmit")).click(); //Finally creating account
		
	}

}
