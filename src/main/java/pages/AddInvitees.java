package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class AddInvitees extends BaseClass{
	public AddInvitees moveToWindow2() {
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> handles=new ArrayList<String>(windowHandles);
	driver.switchTo().window(handles.get(1));
	return this;
	}
	//WebElement dd = driver.findElement(By.xpath("//select[@id='srtp']"));
	//new invitees page
	public AddInvitees addinvitees() {
	WebElement dd = driver.findElement(By.id("srtp"));
	Select ss=new Select(dd);
	ss.selectByVisibleText("Contacts");
	return this;
	}
	public AddInvitees enterInvitee() {
	driver.findElement(By.xpath("//input[@name='srch']")).sendKeys("Kanna");
	driver.findElement(By.xpath("//input[@title='Go!']")).click();
	driver.findElement(By.xpath("//table[@class='list']//tbody//tr[2]/td")).click();
	return this;
	}
	
	public Salesforce_Developer_Edition Insertinvitee() {
	driver.findElement(By.xpath("//input[@title='Insert Selected']")).click();
	driver.findElement(By.xpath("//input[@title='Done']")).click();
	return new Salesforce_Developer_Edition();
	}

	
}
