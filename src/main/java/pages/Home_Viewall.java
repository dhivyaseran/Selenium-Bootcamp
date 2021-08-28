package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class Home_Viewall extends BaseClass {
	
	public Home_Viewall toggle() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		return this;

	}
	
	public AppLauncher viewall() {
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncher();

	}

	public Home_Viewall ClickCommunity() {
		driver.findElement(By.xpath("//a[text()='Community']")).click();
		return this;
	}
	public Home_Viewall Get_App_Developer_name(){
		
List<WebElement> currentList=driver.findElements(By.xpath("//tr/td[5]"));
		
		for (int i=0;i<currentList.size(); i++) {
			
			currentList.get(currentList.size()-1).click();
			
			}
		
		List<String> Apps=new ArrayList<String>();
		List<WebElement> App_Name = driver.findElementsByXPath("//div[text()='Lightning']//ancestor::tr/th");
		
		for (WebElement webElement : App_Name) {
			Apps.add(webElement.getText());
			System.out.println(Apps);
			
		}
		
		
		

		List<WebElement> developerNames=driver.findElements(By.xpath("//div[text()='Lightning']//ancestor::tr/td[2]"));
		List<String> Dev_Names= new ArrayList<String>();
		
		for (WebElement WE : developerNames) {
			Dev_Names.add(WE.getText().toString());
			System.out.println(Dev_Names);
			
		}
		return this;
	}
		
		public Home_Viewall Click_view_Profile() {
			driver.findElement(By.xpath("//span[@class='uiImage']")).click();
			return this;
			
		}
		
		public Salesforce_Developer_Edition Salesforceview() {
			driver.findElement(By.xpath("//a[text()='Switch to Salesforce Classic']")).click();
			return new Salesforce_Developer_Edition();
			
		}
		

	}
	

	

	
		
	

