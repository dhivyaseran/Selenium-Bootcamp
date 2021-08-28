package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class AppLauncher extends BaseClass {
	
	public Home_1 clickSales() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(8000);
		return new Home_1();

	}
	
	public ST_homepage clickServiceTerritory() throws InterruptedException {
		WebElement ST = driver.findElement(By.xpath("//p[text()='Service Territories']"));
		driver.executeScript("arguments[0].click();",ST);
		Thread.sleep(5000);
		return new ST_homepage();

	}

	

}
