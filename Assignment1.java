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
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");;
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SWATISH");
		driver.findElement(By.name("parentPartyId")).sendKeys("demoClass1");
		driver.findElement(By.id("groupNameLocal")).sendKeys("SWAT");
		driver.findElement(By.id("officeSiteName")).sendKeys("WELCOME_SWAT_WEBSITE");
		driver.findElement(By.id("annualRevenue")).sendKeys("500 CRORES");
		driver.findElement(By.id("numberEmployees")).sendKeys("1000");
		driver.findElement(By.id("sicCode")).sendKeys("600049");
		driver.findElement(By.id("tickerSymbol")).sendKeys("123");
		driver.findElement(By.name("description")).sendKeys("Employee Friendly");
		driver.findElement(By.name("importantNote")).sendKeys("Be honest and trustful");
		WebElement Industry=driver.findElement(By.name("industryEnumId"));
		Select in=new Select(Industry);
		in.selectByValue("IND_SOFTWARE");
		WebElement currency=driver.findElement(By.name("currencyUomId"));
		Select in1=new Select(currency);
		in1.selectByValue("INR");
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select in2=new Select(ownership);
		in2.selectByValue("OWN_PARTNERSHIP");
		WebElement Marketing_campaign=driver.findElement(By.name("marketingCampaignId"));
		Select in3=new Select(Marketing_campaign);
		in3.selectByValue("CATRQ_CARNDRIVER");
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select in4=new Select(source);
		in4.selectByValue("LEAD_EMPLOYEE");
		WebElement Initial_Team=driver.findElement(By.name("initialTeamPartyId"));
		Select in5=new Select(Initial_Team);
		in5.selectByValue("DemoSalesTeam2");
		WebElement Country=driver.findElement(By.name("generalCountryGeoId"));
		Select in6=new Select(Country);
		in6.selectByValue("IND");
		driver.findElement(By.id("primaryPhoneCountryCode")).clear();;
		driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("9144");
		driver.findElement(By.id("primaryPhoneExtension")).sendKeys("6802");
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("8015235936");
		driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Manager");
		driver.findElement(By.id("primaryEmail")).sendKeys("swatishkrishnan@gmail.com");
		driver.findElement(By.id("primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
		driver.findElement(By.id("generalToName")).sendKeys("Swatish");
		driver.findElement(By.id("generalAttnName")).sendKeys("Swatish_Harikrishnan");
		driver.findElement(By.id("generalAddress1")).sendKeys("9/71 B type 46th street");
		driver.findElement(By.id("generalAddress2")).sendKeys("9/71 B type 46th street");
		driver.findElement(By.id("generalCity")).sendKeys("Chennai");
		driver.findElement(By.name("generalPostalCode")).sendKeys("600049");
		driver.findElement(By.id("generalPostalCodeExt")).sendKeys("6803");
		WebElement State=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select in7=new Select(State);
		in7.selectByValue("IN-TN");
		driver.findElement(By.className("smallSubmit")).click();
		
		

		

		

		
	}

}
