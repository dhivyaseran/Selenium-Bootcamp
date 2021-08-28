package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPages extends BaseClass {
	
	public LoginPages enterUsername() {
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		return this;

	}
	public LoginPages enterpwd() {
		driver.findElement(By.id("password")).sendKeys("SelBootcamp$123");
		return this;

	}
	
	public Home_Viewall clickLogin() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		return new Home_Viewall();

	}
	

}
