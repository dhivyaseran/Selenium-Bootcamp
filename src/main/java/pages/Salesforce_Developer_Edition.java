package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class Salesforce_Developer_Edition extends BaseClass {
	
	public Salesforce_Developer_Edition CreateNewEvent() {
	driver.findElement(By.xpath("//div[@id='createNewButton']")).click();
	driver.findElement(By.xpath("//a[contains(@class,'eventMru')][text()='Event']")).click();
	return this;
	}
	
	public AddInvitees NewEventDetails(String sub) {
	driver.findElement(By.xpath("//input[@id='evt5']")).sendKeys(sub);
	driver.findElement(By.xpath("//input[@name='StartDateTime']")).click();
    driver.findElement(By.xpath("//table[@class='calDays']/tbody//tr[5]/td[6]")).click();
    driver.findElement(By.xpath("//input[@name='EndDateTime']")).click();
    driver.findElement(By.xpath("//table[@class='calDays']/tbody//tr[5]/td[7]")).click();
    driver.findElement(By.xpath("//input[@id='addInviteesButton']")).click();
    return new AddInvitees();
	}
	
	public Salesforce_Developer_Edition movetosalesforceEditionpage() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(0));
		return this;
	}
	public File_Attachment attachfile() {
	driver.findElement(By.xpath("//input[@name='attachFile']")).click();
	return new File_Attachment();
	}
	
	public Salesforce_Developer_Edition movetoDefaultPage() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<String>(windowHandles);
	driver.switchTo().window(handles.get(0));
	return this;
	}
	//Assert.assertTrue(createEventPage.isFileUploaded("Webex list.txt"));
	public Salesforce_Developer_Edition AttachedFileVerification() {
	WebElement Filename = driver.findElement(By.xpath("//tr//th[text()='File Name']//following::tr/td[2]/span"));
	String FLName = Filename.getText();
	if (FLName.equals("Webex list.txt")) {
		
		System.out.println("File Uploaded");
		
	} else {
		System.out.println("File not uploaded");

	}
	return this;
	}
	
	public Salesforce_Developer_Edition Save() {
	
	driver.findElement(By.xpath("//input[@value=' Save ']")).click();
	return this;
	}
	
}


