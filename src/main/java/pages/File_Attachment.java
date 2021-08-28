package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class File_Attachment extends BaseClass{
	
public File_Attachment AttachFilePage() {
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String> handles1=new ArrayList<String>(windowHandles1);
	driver.switchTo().window(handles1.get(1));
	return this;
}
public File_Attachment select_file() {
	WebElement FL = driver.findElement(By.xpath("//input[@title='Type the path of the file or click the Browse button to find the file.']"));
	FL.sendKeys("C:\\Users\\dhivy\\Downloads\\Webex list.txt");
	return this;
}
public File_Attachment Attach_File() {
	driver.findElement(By.xpath("//input[@id='Attach']")).click();
	return this;
}
public Salesforce_Developer_Edition Complete_Attachment() {
	driver.findElement(By.xpath("//input[@value=' Done ']")).click();
	return new Salesforce_Developer_Edition();
}

}
