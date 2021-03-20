package week2.day1;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.apache.tools.ant.taskdefs.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) 
{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Creating a reference/object as driver for chromedriver
		driver.get("http://leafground.com/"); //Initially navigating to home page of my required website
		driver.manage().window().maximize(); //maximize the window of opened chrome session
		
		//EDIT PAGE
		driver.findElement(By.linkText("Edit")).click(); //clicking edit page using link text
		driver.get("http://leafground.com/pages/Edit.html"); //giving the hitting url of launching page after clicking edit
		driver.findElement(By.id("email")).sendKeys("swatishkrishnan@gmail.com"); // entered the email ID using locator as ID
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys(Keys.TAB);//finding the append text and entered tab using sendkeys
		System.out.println(driver.findElement(By.name("username")).getAttribute("value")); //Find the value of present in default text entered
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear(); //clearing the present data
		System.out.println("Is this field enabled : " +driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());//printing field is enabled or disabled
		
		//BUTTON PAGE
		driver.get("http://leafground.com/pages/Button.html"); //Access to button page via url
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click(); //clicking home page option using xpath
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5")).click(); //
		System.out.println("The x and y position of button is : " +driver.findElement(By.xpath("//*[@id=\"position\"]")).getLocation());//now finding position and printing it
		System.out.println("The button color is " +driver.findElement(By.id("color")).getCssValue("background-color")); //now finding color and printing it
		System.out.println("The Height and width of button is " +driver.findElement(By.id("size")).getSize()); //finding size and priting it
		
		//HYPERLINK PAGE
		driver.get("http://leafground.com/"); //Navigated to home page
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a")).click(); //Entered the hyperlink using  xpath of it
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click(); //Go to home page is accessing using xpath
		System.out.println(driver.getTitle()); //Printing the title of navigated(Home page)
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a")).click(); //again i am navigating to hyperlink
		System.out.println("Where you are going is : " +driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a")).getAttribute("href")); //now defining the path of where hyperlink is navigating

	}

}
