package com.merlin.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.functionalComponents.Lib;
import com.functionalComponents.TestSetUp;

public class HotelSolutionsPage extends TestSetUp {

	public HotelSolutionsPage(WebDriver driver) {
		TestSetUp.driver = driver;
	}

	Lib lib = new Lib(driver);

	// ******** locators - UI elements to be interacted with ********//
	private By PAGE_LOGO = By.xpath("//img[@title='IHG Hotel Solutions']");
	private By FEEDBACK_LNK = By.xpath("//div[@id='oo_tab']");
	private By WELCOME_BACK_TXT = By
			.xpath("//div[@id='secondary-nav']//ul//li[1]");
	private By SIGN_OUT_LNK = By.xpath("//a[@title='Sign Out']");
	private By LANGUAGE_SELECTOR_DRPDWN = By
			.xpath("//div[@class='header_language_change']");
	private By HOTEL_CODE_DRPDWN = By.xpath("//div[@id='catitems']");
	private By HOME_PAGE_LNK = By.xpath("//div[@id='merlinlogo']//a//img");
	private By HOME_PAGE_BREADCRUMB_LNK = By
			.xpath("//div[@id='idBreadCrumb']//a[@title='Return to Merlin']");
	private By HOTEL_SOLUTIONS_BREADCRUMB_LNK = By
			.xpath("//div[@id='idBreadCrumb']//span[contains(.,'Hotel Solutions')]");
	private By SEARCH_TXTBOX = By.xpath("//input[@id='main-search-input']");
	private By OPTION_ARROW = By.xpath("//div[@class='HS_SlctArrw']");
	private By SEARCH_ICON = By.xpath("//div[@class='main_inner_ser_ico']");

	// ************* methods - services offered by the webPage *************//

	public boolean verifyUserLandedOnHotelSolutionsPage() throws Exception {
		lib.waitForElementVisible(driver, PAGE_LOGO);
		return lib.checkObjectExist(PAGE_LOGO, "Hotel Solutions Image");
	}

	public boolean verifyTabIsDisplayed(String tabName) throws Exception {
		return lib.checkObjectExist(
				By.xpath("//a[contains(.,'" + tabName + "')]"), "Tabs");
	}

	public boolean verifySectionIsDisplayed(String sectionName)
			throws Exception {
		return lib
				.checkObjectExist(
						By.xpath("//h1[contains(.,'" + sectionName + "')]"),
						"Sections");
	}

	public boolean verifyLabelIsDisplayed(String labelName) throws Exception {
		return lib.checkObjectExist(
				By.xpath("//p[contains(.,'" + labelName + "')]"), "label");
	}

	public boolean verifyImageIsDisplayed(String imageLogo) throws Exception {
		return lib.checkObjectExist(
				By.xpath("(//p[contains(.,'" + imageLogo + "')]//..//img)[1]"),
				"Image Logo");
	}

	public boolean verifyFeedbackLinkIsDisplayed() throws Exception {
		return lib.checkObjectExist(FEEDBACK_LNK, " Feedback Link ");
	}

	public String getWelcomeBackTextIsDisplayed() throws Exception {
		return lib.getText(WELCOME_BACK_TXT, " Welcome Back User Text ");
	}

	public boolean verifySignOutLinkIsDisplayed() throws Exception {
		return lib.checkObjectExist(SIGN_OUT_LNK, " Sign Out Link");
	}

	public boolean verifyLanguageSelectorIsDisplayed() throws Exception {
		return lib.checkObjectExist(LANGUAGE_SELECTOR_DRPDWN,
				" Language Selector Dropdown");
	}

	public boolean verifyHotelCodeDropDownIsDisplayed() throws Exception {
		return lib.checkObjectExist(HOTEL_CODE_DRPDWN, " Hotel Code Dropdown");
	}

	public boolean verifyHomePageLinkIsDisplayed() throws Exception {
		return lib.checkObjectExist(HOME_PAGE_LNK, " Home Page Link ");
	}

	public boolean verifyHomePageLinkInBreadCrumbIsDisplayed() throws Exception {
		return lib.checkObjectExist(HOME_PAGE_BREADCRUMB_LNK,
				" Home Page Link in bread crumb");
	}

	public boolean verifyHotelSolutionsLinkInBreadCrumbIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(HOTEL_SOLUTIONS_BREADCRUMB_LNK,
				" Hotel Solutions Link in breadcrumb ");
	}

		
	public HotelSolutionsSRPPage searchHotelSolutions(String searchTerm, String option)
			throws Exception {
		lib.enterValue(SEARCH_TXTBOX, "Search Text Box ", searchTerm);
		lib.objectClick(OPTION_ARROW, "Arrow to select Option ");
		lib.objectClick(
				By.xpath("//ul[@id='catte']//li[contains(.,'" + option + "')]"),
				"Option " + option);
		lib.objectClick(SEARCH_ICON, "Search Icon ");
		return new HotelSolutionsSRPPage(driver);
	}

}
