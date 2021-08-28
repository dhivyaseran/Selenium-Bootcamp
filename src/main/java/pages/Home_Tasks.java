package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class Home_Tasks extends BaseClass {
	

	public Home_Tasks Validateheader(String Subject) {
		WebElement Subname = driver.findElement(By.xpath("//a[@title='"+Subject+"']"));
		String Taskname = Subname.getAttribute("title");
		System.out.println(Taskname);
		
		
		  if (Taskname.contains(Subject)) {
		  System.out.println("TC Create Task Passed");
		  
		  } else { System.out.println("TC Create Task Failed");
		  
		 
		  }
		  return this;

	}
	

}
