package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class NewTaskPage extends BaseClass {
	public NewTaskPage enter_Subject(String Subject) {
	
	driver.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[2]")).sendKeys(Subject);
	return this;
}


	public NewTaskPage selectContact() {
	driver.findElement(By.xpath("(//input[@role='combobox'])[5]")).click();
	driver.findElement(By.xpath("(//li[1]//div[contains(@class,'slds-m-left--smalllabels')])")).click();
	return this;

}
	public NewTaskPage selectStatus() {
	WebElement dd=driver.findElement(By.xpath("(//div[@class='uiMenu'])[3]"));
	dd.click();
	WebElement option = driver.findElement(By.xpath("//a[@title='Waiting on someone else']"));
	((RemoteWebDriver) driver).executeScript("arguments[0].click();", option);
	return this;

}
	public Home_Tasks save() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[3]")).click();
		Thread.sleep(2000);
		return new Home_Tasks();

	}
	

}

