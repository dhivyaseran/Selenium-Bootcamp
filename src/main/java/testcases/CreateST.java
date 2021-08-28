package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPages;

public class CreateST extends BaseClass {
	
	@BeforeTest
	public void setfilename() {
	exfilename="Create_ST";
	}
	@Test(dataProvider="fetchData")
	public void CreateNewST(String city,String state,String country , String zip) throws InterruptedException {
		 LoginPages lp=new LoginPages();
		 lp.enterUsername().enterpwd().clickLogin().toggle().viewall().clickServiceTerritory().newST()
		 .newST_Subject().clickOpertaingHours().selectOperatinghours().clickActivefield().entercity(city).enterState(state)
		 .enterCountry(country).enterZIP(zip).clickSaveST().ValidateheaderofST();

	}

}

