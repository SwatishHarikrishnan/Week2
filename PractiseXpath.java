package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.ThreadLocalUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //for opening site
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; //for chromedriver setup need to import this library

public class PractiseXpath {

	public static void main(String[] args) throws InterruptedException {

		//setup chrome driver
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//1. Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//2. Enter the username based on its label
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("DemoSalesManager");
		
		//3. Enter the password based on its label
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

		//4. Click Login
		driver.findElement(By.xpath("/html/body//p/following::input[3]")).click();
		
		//5. Click on CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//6. Click on Leads link
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']"));
		
		//7. Click on Merge Leads link
		//a[@href='/crmsfa/control/mergeLeadsForm']
		
		//8. Click the first img icon
		(//img[@src='/images/fieldlookup.gif'])[1]
		
		//9. Select the first resulting lead
		(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]
				
		//10. Click the second img icon
		(//img[@src='/images/fieldlookup.gif'])[2]
				
		//11. Select the second resulting lead
		(//a[@class='linktext'])[1]
				
		//12. Click on Merge Lead (submit) button
		//a[@class='buttonDangerous']
		
		//13. Get the company name text based on its label
		driver.findElement(By.linkText("Merge Leads")).click();
	}

}
