package week2.day1;

import java.awt.List;
import java.io.File;
import java.io.IOException;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.apache.tools.ant.taskdefs.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.spi.Element;
import com.mongodb.client.ListCollectionsIterable;

import io.cucumber.messages.internal.com.google.protobuf.ByteString.Output;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {

	public static void main(String[] args) throws IOException 
{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Creating a reference/object as driver for chromedriver
		driver.get("http://leafground.com/"); //Initially navigating to home page of my required website
		driver.manage().window().maximize(); //maximize the window of opened chrome session
		File memory=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(memory, new File("./homepage.jpg"));
		
}
}
