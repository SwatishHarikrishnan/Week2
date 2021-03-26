package week2.day1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.apache.tools.ant.taskdefs.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.spi.Element;
import com.mongodb.client.ListCollectionsIterable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) 
{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Creating a reference/object as driver for chromedriver
		//driver.get("http://leafground.com/"); //Initially navigating to home page of my required website
		driver.manage().window().maximize(); //maximize the window of opened chrome session
		driver.get("http://www.leafground.com/pages/Dropdown.html");//Navigated to required URL
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//select by index
		WebElement index=driver.findElement(By.id("dropdown1")); //created a webelement as index to access the dropdown
		Select source= new Select(index); //select class is created to access the index
		source.selectByIndex(0); //0th index is chosen
		source.selectByIndex(1); //1st index is chosen
		source.selectByIndex(2); //2nd index is chosen
		source.selectByIndex(3); //3rd index is chosen
		source.selectByIndex(4); //4th index is chosen
		
		//select by text
		WebElement text=driver.findElement(By.name("dropdown2")); //created a webelement as text to access the dropdown2
		Select source1= new Select(text); //select class is created to access the text
		source1.selectByVisibleText("Select training program using Text"); //0th text is chosen
		source1.selectByVisibleText("Selenium"); //1st text is chosen
		source1.selectByVisibleText("Appium"); //2rd text is chosen
		source1.selectByVisibleText("UFT/QTP"); //3rd text is chosen
		source1.selectByVisibleText("Loadrunner"); //4th text is chosen
		
		//select by value
		WebElement value=driver.findElement(By.name("dropdown3")); //created a webelement as value to access the dropdown2
		Select source2= new Select(value); //select class is created to access the value
		source2.selectByValue("0"); //0th value is chosen
		source2.selectByValue("1"); //1st value is chosen
		source2.selectByValue("2"); //2rd value is chosen
		source2.selectByValue("3"); //3rd value is chosen
		source2.selectByValue("4"); //4th value is chosen

		//The number of options present
		WebElement option=driver.findElement(By.className("dropdown")); //created a webelement as option to access the dropdown
		Select source3=new Select(option);
		System.out.println("The number of options present is " +source3.getOptions().size());
		
		//you can also use send keys to select
		driver.findElement(By.xpath("(//div[@class='example'])[5]//select")).sendKeys("Appium");

		//Selecting the program
		WebElement sele =driver.findElement(By.xpath("(//div[@class='example'])[6]//option[4]"));
		sele.click();
		System.out.println("The selected program is " +sele.getText());
		
}
}
