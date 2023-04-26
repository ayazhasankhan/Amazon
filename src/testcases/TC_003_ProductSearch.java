package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.TestBase;
import pages.*;

public class TC_003_ProductSearch extends TestBase{

	@Test
	public void TC_003_ProductSearch() throws Exception{

	HomePage homePage = new HomePage(driver);
	SearchResultPage searchResultPage = new SearchResultPage(driver);
	homePage.enterProductName();
	homePage.clickOnSearchButton();
	searchResultPage.selectAsus();

	}
	}