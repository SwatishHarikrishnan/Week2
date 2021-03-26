package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.ThreadLocalUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //for opening site
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; //for chromedriver setup need to import this library

public class FindOppurtunites {

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
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Opportunities")).click(); //clicking Contacts menu
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findOpportunities']")).click();
		List<WebElement> opportunities=driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-salesOpportunityId']"));
		System.out.println("The number of opportuinities available is : " +opportunities.size());
		String title=driver.getTitle();
		if(title.startsWith("Find Opportunities"))
		{
			System.out.println("The title required for the respective page is proper");
		}
		else
		{
			System.out.println("The title required for the respective page is not proper");
		}	
	}

}
