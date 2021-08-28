package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class CreatedST extends BaseClass {
	
	public CreatedST ValidateheaderofST() throws InterruptedException {
		WebElement FM = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]"));
		Thread.sleep(3000);
		String Flash = FM.getText();
		Thread.sleep(8000);
		System.out.println("Flash Message is "+Flash);
		
		  WebElement NameafterSTCreated =driver.findElement(By.xpath("//span[@class='uiOutputText']")); 
		  String NAST =NameafterSTCreated.getText();
		  System.out.println(NAST); 
		  if(Flash.contains(NAST)) 
		  { 
			  System.out.println("Test Case Passed");
			  }
		 return this;
		 

	}

}
