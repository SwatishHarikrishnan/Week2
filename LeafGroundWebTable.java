package week2.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
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

public class LeafGroundWebTable {

	public static void main(String[] args) 
{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Creating a reference/object as driver for chromedriver
		//driver.get("http://leafground.com/"); //Initially navigating to home page of my required website
		driver.manage().window().maximize(); //maximize the window of opened chrome session
		driver.get("http://www.leafground.com/pages/table.html");//Navigated to required URL
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		java.util.List<WebElement> table_row = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println("The numnber of rows is " +table_row.size());
		java.util.List<WebElement> table_col = driver.findElements(By.xpath("//table[@id='table_id']//tr[2]/td"));
		System.out.println("The numnber of rows is " +table_col.size());
		
		WebElement progressvalue=driver.findElement(By.xpath("//table[@id='table_id']//tr[3]/td[2]"));
		String value=progressvalue.getText();
	    System.out.println("The progress value of 'Learn to interact with Elements' is : " +value);
	
	    java.util.List<WebElement> values = driver.findElements(By.xpath("//td[2]"));
	    java.util.List<Integer> number =new ArrayList<Integer>();
	    for (WebElement webElement : values) 
	    {
	    	String progress = webElement.getText().replace("%","");
	    	number.add(Integer.parseInt(progress));		
	    }
	    System.out.println(number);
	    Integer minimum = Collections.min(number);
	    System.out.println(minimum);
	    String reqvalue =Integer.toString(minimum)+"%";
	    String reqpath ="//td[text()='"+reqvalue+"']/following::input";
	    WebElement finalbox = driver.findElement(By.xpath(reqpath));
	    finalbox.click();
	    System.out.println(finalbox.isSelected());
}
}
