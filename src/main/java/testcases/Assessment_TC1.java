package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPages;

public class Assessment_TC1 extends BaseClass {
	@BeforeTest
	public void setfilename() {
		exfilename="Assessment_Data";
	}
	
	
	@Test(dataProvider="fetchData")
	public void Assessment(String Subject) throws InterruptedException {
		
		LoginPages LP=new LoginPages();
		LP.enterUsername().enterpwd().clickLogin().ClickCommunity().Get_App_Developer_name().Click_view_Profile().Salesforceview().CreateNewEvent()
		.NewEventDetails(Subject).moveToWindow2().addinvitees().enterInvitee().Insertinvitee().movetosalesforceEditionpage().attachfile().
		AttachFilePage().select_file().Attach_File().Complete_Attachment().movetoDefaultPage().AttachedFileVerification().Save();
		
		
	}

}
