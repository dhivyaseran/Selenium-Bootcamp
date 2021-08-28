package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class Home_1 extends BaseClass {

	
		public NewTaskPage NewTask() throws InterruptedException {
			driver.findElement(By.xpath("//span[text()='Tasks']//following::lightning-icon")).click();
			Thread.sleep(3000);
			WebElement TaskButton =driver.findElement(By.xpath("//span[text()='New Task']"));
			 driver.executeScript("arguments[0].click();", TaskButton);
			 Thread.sleep(10000);
			 return new NewTaskPage();

		}

	}

