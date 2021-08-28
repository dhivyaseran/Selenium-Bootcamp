package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ST_homepage extends BaseClass {
	
	public New_ST newST() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		return new New_ST();

	}

}
