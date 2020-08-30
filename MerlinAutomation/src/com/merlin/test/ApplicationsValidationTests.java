package com.merlin.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.functionalComponents.Report;
import com.functionalComponents.TestSetUp;
import com.merlin.pageObjects.ApplicationsPage;
import com.merlin.pageObjects.ApplicationsSearchPage;
import com.merlin.pageObjects.HomePage;
import com.merlin.pageObjects.HotelSolutionsPage;
import com.merlin.pageObjects.HotelSolutionsSRPPage;
import com.merlin.pageObjects.LogInPage;

public class ApplicationsValidationTests extends TestSetUp {

	// data to be used in test
	private final String USERNAME = getCommonTestData("Value", "Username");
	private final String PASSWORD = getCommonTestData("Value", "Password");
	private final String DOMAIN = getCommonTestData("Value", "Domain");
	private final String CORPORATE_USERNAME = getCommonTestData("Value",
			"Corporate Username");
	private final String CORPORATE_PASSWORD = getCommonTestData("Value",
			"Corporatae Password");
	private final String CORPORATE_DOMAIN = getCommonTestData("Value",
			"Corporate Domain");

	// instantiating various page objects
	LogInPage logIn = new LogInPage(driver);
	HomePage homePage = new HomePage(driver);
	ApplicationsPage applicationsPage = new ApplicationsPage(driver);
	ApplicationsSearchPage applicationsSearchPage = new ApplicationsSearchPage(
			driver);
	HotelSolutionsPage hotelSolutionPage = new HotelSolutionsPage(driver);
	HotelSolutionsSRPPage hotelSolutionsSRPPage = new HotelSolutionsSRPPage(driver);

	// *********************** TEST SCRIPTS *********************//

	@Test(description = "This test scenario validates the application page when logged in as corportae user")
	public void testApplicationsCorporateUser() throws Exception {
		if (getTestRunStatus("Enabled Value", "testApplicationsCorporateUser")
				.equalsIgnoreCase("TRUE"))
		{
			Report.getMessage("Application launched successfully");
			Assert.assertTrue(logIn.verifyLogInPageIsDisplayed(),
					"LogIn page is not displayed ");
			logIn.logInToMerlinApplication(CORPORATE_USERNAME,
					CORPORATE_PASSWORD, CORPORATE_DOMAIN);
			Assert.assertTrue(homePage.verifyUserLoggedIn(),
					"Unable to log in to application");
			Report.getMessage("User Logged in successfully");
			Assert.assertTrue(homePage.verifyUserlandedToHomePage(),
					" User not taken to Home Page ");
			Report.getMessage("User taken to Home Page, Home Page is displayed");
			homePage.navigateToApplicationsPage();
			Assert.assertTrue(
					applicationsPage.verifyUserLandedOnApplicationsPage(),
					"User not taken to Applications page");
			Report.getMessage("User taken to Applications Page");
			Assert.assertTrue(
					applicationsPage.verifyMyApplicationsSectionIsDisplayed(),
					" My Applications section is not displayed");
			Report.getMessage("My Applications section is displayed");
			Assert.assertTrue(applicationsPage
					.verifyMyApplicationsByCategoryHeadingIsDisplayed(),
					" Applications By category heading is not displayed");
			Report.getMessage("Heading Applications By Category is displayed");
			Assert.assertTrue(applicationsPage.verifyCategoriesAreDisplayed(),
					"Categories are not displayed");
			Report.getMessage("Categories are displayed");
			Assert.assertTrue(applicationsPage
					.verifyBrandAndCorporateHeadingIsDisplayed(),
					" Brand and Corporate heading is not displayed");
			Report.getMessage("Brand and Corporate heading is displayed");
			Assert.assertTrue(
					applicationsPage.verifyBrandAndCorporatesAreDisplayed(),
					"Brand and Corporates are not displayed");
			Report.getMessage("Brand and Corporates are displayed");
			Assert.assertTrue(applicationsPage
					.verifyApplicationsBeginingWithHeadingIsDisplayed(),
					" Applications Begining with heading is not displayed");
			Report.getMessage("Applications begining with heading is displayed");
			Assert.assertTrue(applicationsPage.verifyAlphabetsAreDisplayed(),
					"All Alphabets are not displayed");
			Report.getMessage("Alphabets A-Z are displayed");
			Assert.assertTrue(applicationsPage.verifyTopRatedTabIsDisplayed(),
					"Top Rated section is not displayed");
			Report.getMessage("Top Rated section is displayed");
			Assert.assertTrue(
					applicationsPage.verifyMostCommentedTabIsDisplayed(),
					"Most Commented section is not displayed");
			Report.getMessage("Most Commented section is displayed");
			Assert.assertTrue(
					applicationsPage.verifyByDefaultTopRatedIsDisplayed(),
					"Top Rated section is not selected by default");
			Report.getMessage("Top Rated section is selected by default");
			Assert.assertTrue(
					applicationsPage.verifyArticlesDisplayedInTopRatedOrder(),
					"Articles are not displayed in order of rating");
			Report.getMessage("Validated that Articles are displayed in the Top Rated order");
			applicationsPage.clickMostCommentedTab();
			Assert.assertTrue(applicationsPage
					.verifyArticlesDisplayedInMostCommentedOrder(),
					"Articles are not displayed in order of comments");
			Report.getMessage("Validated that Articles are displayed in the Most Commented order");
			Assert.assertTrue(applicationsPage
					.verifyLearnMoreAboutApplicationsLinkIsDisplayed(),
					"Learn More about applications link is not displayed");
			Report.getMessage("Learn More about applications link is not displayed");
			applicationsPage.clickLearnMoreApplicationsLink();
			Assert.assertTrue(applicationsPage
					.verifyLearnMoreAboutApplicationsLinkDisplaysLightBox(),
					"Learn More about applications link does not display light box");
			Report.getMessage("Light Box is displayed");
			applicationsPage.closeLightBox();
			applicationsPage.searchApplications(getTestData("Search Term",
					"testApplicationsCorporateUser"));
			Assert.assertTrue(
					applicationsSearchPage
							.verifyUserLandedOnSearchResultsPage()
							.equalsIgnoreCase("Search results"),
					"Search Results Page is not displayed");
			Report.getMessage("User landed on Search Results Page");
			Assert.assertTrue(
					applicationsSearchPage.verifySearchResultsAreDisplayed(),
					"Search Results are not displayed ");
			Report.getMessage("Search Results are displayed");	
		} 
		else {
			Report.getMessage("Test marked as not to be run");
			throw new SkipException(
					"Skipping this test as enabled value retrieved is false");
		}
	}
	
	@Test(description = "This test scenario validates the Applications/Hotel Solutions page when logged in as Hotel user")
	public void testApplicationsHotelUser() throws Exception {
		if (getTestRunStatus("Enabled Value", "testApplicationsHotelUser")
				.equalsIgnoreCase("TRUE")) 
		{
			Report.getMessage("Application launched successfully");
			Assert.assertTrue(logIn.verifyLogInPageIsDisplayed(),
					"LogIn page is not displayed ");
			logIn.logInToMerlinApplication(USERNAME, PASSWORD, DOMAIN);
			Assert.assertTrue(homePage.verifyUserLoggedIn(),
					"Unable to log in to application");
			Report.getMessage("User Logged in successfully");
			Assert.assertTrue(homePage.verifyUserlandedToHomePage(),
					" User not taken to Home Page ");
			Report.getMessage("User taken to Home Page, Home Page is displayed");
			homePage.navigateToApplicationsPage();
			homePage.switchToHotelSolutionsTab();
			Assert.assertTrue(
					hotelSolutionPage.verifyUserLandedOnHotelSolutionsPage(),
					"User not taken to Hotel Solutions page");
			Report.getMessage("User taken to Hotel Solutions Page");
			Assert.assertTrue(hotelSolutionPage.verifyTabIsDisplayed("BROWSE"),
					" Browse Tab is not displayed");
			Report.getMessage("Browse Tab is displayed");
			Assert.assertTrue(hotelSolutionPage
					.verifyTabIsDisplayed("MY HOTEL SOLUTIONS"),
					" My Hotel Solutions Tab is not displayed");
			Report.getMessage("My Hotel Solutions Tab is displayed");
			Assert.assertTrue(hotelSolutionPage.verifyTabIsDisplayed("IDEAS"),
					"Ideas tab is not displayed");
			Report.getMessage("Ideas Tab is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyTabIsDisplayed("RESOURCES"),
					" Resources Tab is not displayed");
			Report.getMessage("Resources Tab is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifySectionIsDisplayed("DEPARTMENT"),
					"Department Section is not displayed");
			Report.getMessage("Department Section is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifySectionIsDisplayed("ALPHABET"),
					"Alphabet Section is not displayed");
			Report.getMessage("Alphabet Section is displayed");
			Assert.assertTrue(hotelSolutionPage
					.verifySectionIsDisplayed("WINNING TOOLKIT"),
					"Winning ToolKit Section is not displayed");
			Report.getMessage("Winning ToolKit Section is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyLabelIsDisplayed("Help & Support"),
					"Help & Support label is not displayed");
			Report.getMessage("Help & Support label is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyLabelIsDisplayed("IHG Wheel"),
					"IHG Wheel Label is not displayed");
			Report.getMessage("IHG Wheel Label is displayed");
			Assert.assertTrue(hotelSolutionPage.verifyLabelIsDisplayed("New"),
					"What's New Label is not displayed");
			Report.getMessage("What's New Label is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyImageIsDisplayed("Help & Support"),
					"Help & Support Image is not displayed");
			Report.getMessage("Help & Support Image is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyImageIsDisplayed("IHG Wheel"),
					"IHG Wheel Image is not displayed");
			Report.getMessage("IHG Wheel Image is displayed");
			Assert.assertTrue(hotelSolutionPage.verifyImageIsDisplayed("New"),
					"What's New Image is not displayed");
			Report.getMessage("What's New Image is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyFeedbackLinkIsDisplayed(),
					"Feedback Link is not displayed");
			Report.getMessage("FeedBack Link is displayed");
			Assert.assertTrue(hotelSolutionPage.getWelcomeBackTextIsDisplayed()
					.contains("Welcome back"),
					"Welcome Back text is not displayed");
			Report.getMessage("Welcome Back Text is displayed");
			Assert.assertTrue(hotelSolutionPage.verifySignOutLinkIsDisplayed(),
					"Sign Out link is not present");
			Report.getMessage("Sign Out link is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyHotelCodeDropDownIsDisplayed(),
					"Hotel Code Dropdown is not present");
			Report.getMessage("Hotel Code Dropdown is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyLanguageSelectorIsDisplayed(),
					"Language Selector is not present");
			Report.getMessage("Language Selector is displayed");
			Assert.assertTrue(
					hotelSolutionPage.verifyHomePageLinkIsDisplayed(),
					"Home Page Link is not present");
			Report.getMessage("Home Page link is displayed");
			Assert.assertTrue(hotelSolutionPage
					.verifyHomePageLinkInBreadCrumbIsDisplayed(),
					"Home Page Link is not present in breadcrumb");
			Report.getMessage("Home Page link is displayed in breadcrumb");
			Assert.assertTrue(hotelSolutionPage
					.verifyHotelSolutionsLinkInBreadCrumbIsDisplayed(),
					"Hotel Solutions Link in breadcrumb is not present");
			Report.getMessage("Hotel Solutions Link in breadcrumb is displayed");
			hotelSolutionPage.searchHotelSolutions("IHG", "Tools");
			Assert.assertTrue(
					hotelSolutionsSRPPage.verifyUserLandedToSearchResultsPage(),
					"User not taken to search results page");
			Report.getMessage("User taken to search results page");
			Assert.assertTrue(
					hotelSolutionsSRPPage.verifySearchResultsAreDisplayed(),
					"Search Results are not displayed");
			Report.getMessage("Search Results are displayed");			
		} 
		else {
			Report.getMessage("Test marked as not to be run");
			throw new SkipException(
					"Skipping this test as enabled value retrieved is false");
		}
	}
}