package com.merlin.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.functionalComponents.Lib;
import com.functionalComponents.TestSetUp;

public class ApplicationsSearchPage extends TestSetUp {

	public ApplicationsSearchPage(WebDriver driver) {
		TestSetUp.driver = driver;
	}

	Lib lib = new Lib(driver);

	// ******** locators - UI elements to be interacted with ********//

	private By SEARCH_RESULTS_COUNT = By
			.xpath("//article[@class='results search']//ul//li");
	private By PAGE_HEADER_TXT = By
			.xpath("//article[@class='results search']/h1");

	// ************* methods - services offered by the webPage *************//

	public String verifyUserLandedOnSearchResultsPage() throws Exception {
		lib.waitForElementVisible(driver, PAGE_HEADER_TXT);
		return lib.getText(PAGE_HEADER_TXT, "Page Header Text");
	}

	public boolean verifySearchResultsAreDisplayed() throws Exception {
		boolean flag = false;
		if (lib.getElementCount(SEARCH_RESULTS_COUNT, "Search Result Count") >= 1) {
			flag = true;
		}
		return flag;
	}
}
