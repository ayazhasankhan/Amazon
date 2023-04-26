package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.RegisterPage;


public class TC_001_RegisterAccount extends TestBase{

	@Test
	public void TC_001_RegisterAccount(){

	HomePage homePage = new HomePage(driver);
	RegisterPage registerPage = new RegisterPage(driver);
	
	homePage.mouseHoverOnAccount_Lists();
	homePage.clickOnStartHere();
	registerPage.enterYourName();
	registerPage.selectCountryCode();
	registerPage.enterMobileNumber();
	registerPage.clickOnContinueButton();
	
	}
	}