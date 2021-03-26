package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //for opening site
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; //for chromedriver setup need to import this library

public class CreateContact {

	public static void main(String[] args) {

		//setup chrome driver
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contacts")).click(); //clicking Contacts menu
		driver.findElement(By.linkText("Create Contact")).click(); //clicking create account menu
		driver.findElement(By.id("firstNameField")).sendKeys("Swatish");
		driver.findElement(By.id("lastNameField")).sendKeys("Harikrishnan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Swat");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("krishnan");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("ECE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Dedication");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Swatishkrishnan@gmail.com");
		WebElement values=driver.findElement(By.xpath("(//select[@id='createContactForm_generalStateProvinceGeoId'])"));
		Select values1=new Select(values);
		values1.selectByVisibleText("Armed Forces Pacific");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();//clearing the contents in description
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("I have successfully edited");//clicking edit
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();//clicking update button
		String title1 = driver.getTitle();//getting the title 
		System.out.println(title1);//printing the title

		
	}

}
