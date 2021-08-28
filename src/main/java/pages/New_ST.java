package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class New_ST extends BaseClass{
	
	public New_ST newST_Subject() {
		WebElement ST1 = driver.findElement(By.xpath("//input[@class=' input']"));
		ST1.sendKeys("ST created by DV1");
		String ST_Name = ST1.getText();
		return this;
	}
    public New_ST clickOpertaingHours() {
	    driver.findElement(By.xpath("//input[@title='Search Operating Hours']")).click();
	    return this;
    }
    public New_ST selectOperatinghours() {
    	driver.findElement(By.xpath("//div[contains(@class,'primaryLabel')]")).click();
    	return this;

	}
		
		public New_ST clickActivefield() {
			driver.findElement(By.xpath("//div[contains(@class,'uiInput--checkbox')]//input[@type='checkbox']")).click();
			return this;

		}
		public New_ST entercity(String City) {
			driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys(City);
			return this;

		}
		public New_ST enterState(String State) {
			driver.findElement(By.xpath("//input[@placeholder='State/Province']")).sendKeys(State);
			return this;

		}
		public New_ST enterCountry(String Country) {
			driver.findElement(By.xpath("//input[@placeholder='Country']")).sendKeys(Country);
			return this;

		}
		public New_ST enterZIP(String ZIP) {
			driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys(ZIP);
			return this;

		}
		public CreatedST clickSaveST() {
			driver.findElement(By.xpath("//button[@title='Save']//span[text()='Save']")).click();
			return new CreatedST();

		}
		
		
		

	}


