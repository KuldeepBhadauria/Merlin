package com.merlin.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.functionalComponents.Lib;
import com.functionalComponents.TestSetUp;

public class ApplicationsPage extends TestSetUp {

	// constructor to initialize driver
	public ApplicationsPage(WebDriver driver) {
		TestSetUp.driver = driver;
	}

	Lib lib = new Lib(driver);

	// ******** locators - UI elements to be interacted with ********//

	private By TOP_RATED_TXT = By
			.xpath("//a[@id='top-rated']//span[contains(.,'rated')]");
	private By MY_APPLICATIONS_SECTION = By.xpath("//div[@class='my_fav']");
	private By APPLICATIONS_BY_CATEGORY_HEADING = By
			.xpath("//div[@class='applications']//h2[contains(.,'Applications by category')]");
	private By CATEGORIES_COUNT = By
			.xpath("(//div[@class='applications'])[2]//div");
	private By BRAND_CORPORATE_HEADING = By
			.xpath("//div[@class='applications']//h2[contains(.,'Brand / corporate applications')]");
	private By BRAND_CORPORATE_COUNT = By
			.xpath("(//div[@class='applications'])[1]//div");
	private By APPLICATIONS_BEGINING_WITH_HEADING = By
			.xpath("//div[@class='alphabet-container']//h2");
	private By ALPHABETS_COUNT = By
			.xpath("//div[@class='alphabet-container']//span");
	private By MOST_COMMENTED_LNK = By
			.xpath("//a[@id='most-commented']//span[contains(.,'commented')]");
	private By ARTICLE_COUNT = By
			.xpath("//ul[contains(@class,'top-rated')]//li");
	private By TOP_RATED_LNK = By.xpath("//a[@id='top-rated']");
	private By LEARN_MORE_ABOUT_APPLICATIONS_LNK = By
			.xpath("//div[@id='overlay-modal']//a");
	private By LIGHTBOX_CONTENT = By
			.xpath("//div[@id='dboverlay-container']//div[@id='ts-overlay-content']");
	private By LIGHTBOX_CLOSE_BTN = By
			.xpath("//div[@id='dboverlay-container']//a[@title='Close']");
	private By SEARCH_TXTBOX = By.xpath("//input[@id='formSearchKeywords']");
	private By SEARCH_ICON = By
			.xpath("//div[@id='content']//input[@id='header-submit']");

	// ************* methods - services offered by the webPage *************//

	public boolean verifyUserLandedOnApplicationsPage() throws Exception {
		lib.waitForElementVisible(driver, TOP_RATED_TXT);
		return lib.checkObjectExist(TOP_RATED_TXT, "Top rated Text");
	}

	public boolean verifyMyApplicationsSectionIsDisplayed() throws Exception {
		return lib.checkObjectExist(MY_APPLICATIONS_SECTION,
				"My Applications Section");
	}

	public boolean verifyMyApplicationsByCategoryHeadingIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(APPLICATIONS_BY_CATEGORY_HEADING,
				"Applications by Category Heading");
	}

	public boolean verifyCategoriesAreDisplayed() throws Exception {
		boolean flag = false;
		if (lib.getElementCount(CATEGORIES_COUNT, "Count of Categories") >= 1) {
			flag = true;
		}
		return flag;
	}

	public boolean verifyBrandAndCorporateHeadingIsDisplayed() throws Exception {
		return lib.checkObjectExist(BRAND_CORPORATE_HEADING,
				"Brands and Corporate Heading");
	}

	public boolean verifyBrandAndCorporatesAreDisplayed() throws Exception {
		boolean flag = false;
		if (lib.getElementCount(BRAND_CORPORATE_COUNT,
				"Count of Brands and Corporates ") >= 1) {
			flag = true;
		}
		return flag;
	}

	public boolean verifyApplicationsBeginingWithHeadingIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(APPLICATIONS_BEGINING_WITH_HEADING,
				" Applications Begining With Heading ");
	}

	public boolean verifyAlphabetsAreDisplayed() throws Exception {
		boolean flag = false;
		if (lib.getElementCount(ALPHABETS_COUNT, "Count of Alphabets ") == 26) {
			flag = true;
		}
		return flag;
	}

	public boolean verifyTopRatedTabIsDisplayed() throws Exception {
		return lib.checkObjectExist(TOP_RATED_TXT, "Top Rated Text");
	}

	public boolean verifyMostCommentedTabIsDisplayed() throws Exception {
		return lib.checkObjectExist(MOST_COMMENTED_LNK, "Most Commented Link");
	}

	public int getArticlesCount() throws Exception {
		return lib.getElementCount(ARTICLE_COUNT, "Article Count");
	}

	public boolean verifyArticlesDisplayedInTopRatedOrder() throws Exception {
		boolean flag = false;
		for (int i = 1; i < getArticlesCount(); i++) {
			int j = i + 1;
			int ratingArticle1 = lib.getElementCount(
					By.xpath("//ul[contains(@class,'top-rated')][" + i
							+ "]//span[@class='ratingIcon']//img"),
					"Rating Count");
			int ratingArticle2 = lib.getElementCount(
					By.xpath("//ul[contains(@class,'top-rated')][" + j
							+ "]//span[@class='ratingIcon']//img"),
					"Rating Count");
			if (ratingArticle1 >= ratingArticle2) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag == false) {
				break;
			}
		}
		return flag;
	}

	public ApplicationsPage clickMostCommentedTab() throws Exception {
		lib.objectClick(MOST_COMMENTED_LNK, "Most Commented Tab ");
		return new ApplicationsPage(driver);
	}

	public boolean verifyArticlesDisplayedInMostCommentedOrder()
			throws Exception {
		boolean flag = false;
		for (int i = 1; i < getArticlesCount(); i++) {
			int j = i + 1;
			int commentsArticle1 = Integer.parseInt(lib.getText(
					By.xpath("//ul[contains(@class,'most-commented')][" + i
							+ "]//span[@class='comments']"), "Comments Count"));
			int commentsArticle2 = Integer.parseInt(lib.getText(
					By.xpath("//ul[contains(@class,'most-commented')][" + j
							+ "]//span[@class='comments']"), "Comments Count"));
			if (commentsArticle1 >= commentsArticle2) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag == false) {
				break;
			}
		}
		return flag;
	}

	public boolean verifyByDefaultTopRatedIsDisplayed() throws Exception {
		boolean flag = false;
		if (lib.getAttributeValueText(TOP_RATED_LNK, "class", "Top Rated Link")
				.equalsIgnoreCase("active")) {
			flag = true;
		}
		return flag;
	}

	public boolean verifyLearnMoreAboutApplicationsLinkIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(LEARN_MORE_ABOUT_APPLICATIONS_LNK,
				" Learn More About Applications Link ");
	}

	public void clickLearnMoreApplicationsLink() throws Exception {
		lib.objectClick(LEARN_MORE_ABOUT_APPLICATIONS_LNK,
				"Learn More About Applications Link ");

	}

	public boolean verifyLearnMoreAboutApplicationsLinkDisplaysLightBox()
			throws Exception {
		lib.waitForElementVisible(driver, LIGHTBOX_CONTENT);
		return lib.checkObjectExist(LIGHTBOX_CONTENT, " Light Box Content ");
	}

	public ApplicationsPage closeLightBox() throws Exception {
		lib.objectClick(LIGHTBOX_CLOSE_BTN, "Light Box Close Button ");
		return new ApplicationsPage(driver);
	}

	public ApplicationsSearchPage searchApplications(String searchTerm)
			throws Exception {
		lib.waitForElementVisible(driver, SEARCH_TXTBOX);
		lib.enterValue(SEARCH_TXTBOX, "Search text box ", searchTerm);
		lib.objectClick(SEARCH_ICON, "Search Icon ");
		return new ApplicationsSearchPage(driver);
	}

}
