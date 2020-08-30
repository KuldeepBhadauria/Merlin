package com.merlin.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.functionalComponents.Lib;
import com.functionalComponents.TestSetUp;

public class HotelSolutionsSRPPage extends TestSetUp {

		// constructor to initialize driver
		public HotelSolutionsSRPPage(WebDriver driver) {
			TestSetUp.driver = driver;
		}

		Lib lib = new Lib(driver);

		// ******** locators - UI elements to be interacted with ********//

		private By SOLUTIONS_HEADING = By
				.xpath("//h2[@class='browse_page_title']");
		private By SEARCH_RESULTS_COUNT = By
				.xpath("//div[@class='browse_result']");

		
		// ************* methods - services offered by the webPage *************//
		
		public boolean verifyUserLandedToSearchResultsPage() throws Exception {
			lib.waitForElementVisible(driver, SOLUTIONS_HEADING);
			return lib.checkObjectExist(SOLUTIONS_HEADING,
					" Solutions heading ");
		}
		
		public boolean verifySearchResultsAreDisplayed() throws Exception {
			boolean flag = false;
			if (lib.getElementCount(SEARCH_RESULTS_COUNT, "Count of Search Results") >= 1) {
				flag = true;
			}
			return flag;
		}

		

}
