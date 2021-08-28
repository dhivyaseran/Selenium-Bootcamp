package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.readExcel;
import utils.readExcel;
public class BaseClass {
public static RemoteWebDriver driver;
public String exfilename;
	
	@BeforeMethod
	public void preCondition() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		

	}

	
	  @DataProvider(name="fetchData",indices=0) 
	  public String[][] sendData() throws IOException
	  { 
		  return readExcel.readExcelData(exfilename);
	  
	  
	  }
	 

	@AfterMethod
	public void postCondition() {
		driver.close();
	}



}
