package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPages;

public class CreateTask extends BaseClass {
	@BeforeTest
	public void setfilename() {
	exfilename="Create Task";
	}
	@Test(dataProvider="fetchData")
	public void runCreateTask(String subject) throws InterruptedException {
		LoginPages lp=new LoginPages();
		lp.enterUsername().enterpwd().clickLogin().toggle().viewall().clickSales().NewTask().enter_Subject(subject).selectContact().selectStatus().save().Validateheader(subject);
		
		
		
		
	}

}
