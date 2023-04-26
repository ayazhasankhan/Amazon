package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.TestBase;
import pages.*;

public class TC_002_ViewBestSellingProducts extends TestBase{

	@Test
	public void TC_002_ViewBestSellingProducts() throws Exception{

	HomePage homePage = new HomePage(driver);
	
	homePage.clickOnAll();
	homePage.clickOnBestSeller();

	}
	}