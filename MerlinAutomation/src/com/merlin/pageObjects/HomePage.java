package com.merlin.pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.functionalComponents.Lib;
import com.functionalComponents.Report;
import com.functionalComponents.TestSetUp;

public class HomePage extends TestSetUp {

	// constructor to initialize driver
	public HomePage(WebDriver driver) {
		TestSetUp.driver = driver;
	}

	Lib lib = new Lib(driver);
	//NewsArticlePage newsArticlePage = new NewsArticlePage(driver);

	// ******** locators - UI elements to be interacted with ********//

	private By LOGOUT_LNK = By.xpath("//a[@title='Logout']");
	private By NEWS_CAROUSEL_MAIN_SECTION = By
			.xpath("//div[@class='article-details-container']");
	private By ADDITIONAL_NEWS_CAROUSEL_SECTION = By
			.xpath("//div[@class='more-articles-container']");
	private By GLOBAL_NEWS_BANNER = By.xpath("//div[@class='image global']");
	private By REGIONAL_NEWS_BANNER = By
			.xpath("(//div[contains(@class,'header-image-container')])[2]");
	private By GLOBAL_NEWS_LNK = By
			.xpath("//div[contains(@class,'image-details mRight18')]//h4//a");
	private By REGIONAL_NEWS_LNK = By
			.xpath("//div[contains(@class,'image-details mLeft18')]//h4//a");
	private By ADDITIONAL_NEWS_LNK = By
			.xpath("//div[@class='more-articles-container']//a");
	private By NEW_CTA_SECTION = By
			.xpath("//div[@class='hotel-performance-container']");
	private By HOTEL_PERFORMANCE_LNK = By
			.xpath("//div[@class='hotel-performance-container']//a//span[@class='hotel-text']");
	private By NOTIFICATION_MARQUEE_BANNER = By
			.xpath("//div[@class='noti-header-container']//div[contains(.,'Notifications')]");
	private By NOTIFICATION_BUTTON_COUNT = By
			.xpath("//div[@class='pagination-center']//li");
	private By HOTEL_PERFORMANCE_DASHBOARD_TXT = By
			.xpath("//div[@class='hotel-performance-container']//span[@title='Go to Hotel Performance Dashboard']");
	private By GLOBAL_NEWS_IMG = By
			.xpath("//div[@class='image-details mRight18']//img");
	private By GLOBAL_NEWS_OVERLAY = By
			.xpath("//div[@class='image-details mRight18']//div[@class='overlay-content']");
	private By LIKE_COUNT_GLOBAL_NEWS = By
			.xpath("//div[@class='image-details mRight18']//span[@class='like']");
	private By COMMENT_COUNT_GLOBAL_NEWS = By
			.xpath("//div[@class='image-details mRight18']//span[@class='comment']");
	private By GLOBAL_NEWS_TITLE_OVERLAY = By
			.xpath("(//div[@class='image-details mRight18']//div[@class='overlay-content']//a)[1]");
	private By REGIONAL_NEWS_IMG = By
			.xpath("//div[contains(@class,'image-details mLeft18')]//img");
	private By REGIONAL_NEWS_OVERLAY = By
			.xpath("//div[@class='image-details mLeft18']//div[@class='overlay-content']");
	private By LIKE_COUNT_REGIONAL_NEWS = By
			.xpath("//div[@class='image-details mLeft18']//span[@class='like']");
	private By COMMENT_COUNT_REGIONAL_NEWS = By
			.xpath("//div[@class='image-details mLeft18']//span[@class='comment']");
	private By REGIONAL_NEWS_TITLE_OVERLAY = By
			.xpath("(//div[@class='image-details mLeft18']//div[@class='overlay-content']//a)[1]");
	private By BELL_ICON = By
			.xpath("//div[@class='notifications-container']//div[@class='bell-icon']");
	private By NOTIFICATION_SLIDE_COUNT = By
			.xpath("//div[@id='db_topright_slider']//div[@class='slides']");
	private By NOTIFICATION_SCROLL_NXT_BUTTON = By.xpath("//a[@title='next']");
	private By ARCHIVE_LNK = By.xpath("//div[@class='archive-container']//a");
	private By NOTIFICATION_LIGHTBOX_HEADING = By
			.xpath("//span[contains(.,'Notification Details')]");
	private By NOTIFICATION_LIGHTBOX_CLOSE_BTN = By
			.xpath("//span[contains(.,'close')]");
	private By FIRST_NOTIFICATION_BTN = By
			.xpath("(//div[@class='pagination-center']//li/a)[1]");
	private By NEWSROOM_TAB = By
			.xpath("//nav[@id='navigation']//span[text()='Newsroom']");
	private By TEAMSPACES_TAB = By
			.xpath("//nav[@id='navigation']//span[text()='Teamspaces']");
	private By INITIATIVES_TAB = By
			.xpath("//nav[@id='navigation']//span[text()='Initiatives']");
	private By DEPARTMENTS_TAB = By
			.xpath("//nav[@id='navigation']//span[contains(.,'Departments')]");
	private By APPLICATIONS_TAB = By
			.xpath("//nav[@id='navigation']//span[contains(.,'Applications')]");
	private By CONFERENCES_TAB = By
			.xpath("//nav[@id='navigation']//span[contains(.,'Conferences & Events')]");
	private By MY_FAV_SECTION = By.xpath("//div[@id='db-tabcontent']");
	private By APPLICATIONS_COUNT = By.xpath("//ul[@id='ul1']//li");
	private By FORWARD_BTN = By
			.xpath("//div[@id='apps']//a[@class='buttons next']");
	private By PREVIOUS_BTN = By
			.xpath("//div[@id='apps']//a[@class='buttons prev']");
	private By BROWSE_ALL_APPLICATIONS_LNK = By
			.xpath("//a[contains(.,'Browse all applications')]");
	private By POPULAR_APP_BTN = By
			.xpath("//span[@class='button-container']//span[contains(.,'Popular Applications')]");
	private By MY_FAVOURITES_TITLE = By.xpath("//h2[text()='My Favourites']");
	private By MY_FAVOURITES_HELP_ICON = By
			.xpath("//span[contains(@title,'Save your favourite content')]");

	// ************* methods - services offered by the webPage *************//

	public boolean verifyUserLoggedIn() throws Exception {
		return lib.checkObjectExist(LOGOUT_LNK, " LogOut link ");
	}

	public LogInPage logOutFromMerlinApplication() throws Exception {
		lib.waitForElementVisible(driver, LOGOUT_LNK);
		lib.objectClick(LOGOUT_LNK, "LogOut link ");
		return new LogInPage(driver);
	}

	public boolean verifyNewsCarouselSectionIsDisplayed() throws Exception {
		return lib.checkObjectExist(NEWS_CAROUSEL_MAIN_SECTION,
				" Main News Carousel Section ");
	}

	public boolean verifyAdditionalCarouselSectionIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(ADDITIONAL_NEWS_CAROUSEL_SECTION,
				" Additional News Carousel Section ");
	}

	public boolean verifyGlobalNewsBannerIsDisplayed() throws Exception {
		return lib.checkObjectExist(GLOBAL_NEWS_BANNER, " Global News Banner ");
	}

	public boolean verifyRegionalNewsBannerIsDisplayed() throws Exception {
		return lib.checkObjectExist(REGIONAL_NEWS_BANNER,
				" Regional News Banner ");
	}

	public boolean verifyGlobalNewsIsDisplayed() throws Exception {
		return lib.checkObjectExist(GLOBAL_NEWS_LNK, " Global News Link ");
	}

	public boolean verifyRegionalNewsIsDisplayed() throws Exception {
		return lib.checkObjectExist(REGIONAL_NEWS_LNK, " Regional News Link ");
	}

	public int getNewsCountInAdditionalNewsSection() throws Exception {
		return lib.getElementCount(ADDITIONAL_NEWS_LNK,
				" Count of News in Additional News Section ");

	}

	public boolean verifyNewCTAIsDisplayed() throws Exception {
		return lib.checkObjectExist(NEW_CTA_SECTION,
				" Hotel Performance Banner ");
	}

	public String VerifyHotelPerformanceLink() throws Exception {
		return lib.getText(HOTEL_PERFORMANCE_LNK,
				" Hotel Performance Link in New CTA Section ");
	}

	public boolean verifyNotificationsMarqueeBannerIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(NOTIFICATION_MARQUEE_BANNER,
				" Notification Marquee Banner ");
	}

	public int getNotificationCount() throws Exception {
		return lib.getElementCount(NOTIFICATION_BUTTON_COUNT,
				" Count of Notification buttons ");

	}

	public boolean verifyNotifications() throws Exception {
		boolean flag = false;
		for (int i = 1; i <= getNotificationCount(); i++) {
			if(i>1){
			lib.clickUsingJavaScript(
					By.xpath("(//div[@class='pagination-center']//li/a)[" + i
							+ "]"), " Notification Number button " + i + " ");
			Thread.sleep(2000);
			}
			if (lib.checkObjectExist(
					By.xpath("(//div[@class='info-container']//p[@class='desc'])["
							+ i + "]"), " Notification Description ") == true) {
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

	public boolean mouseHoverOverHotelPerformanceLink() throws Exception {
		boolean flag = false;
		lib.mouseHover(HOTEL_PERFORMANCE_LNK,
				" Hotel Performance Link In CTA Section ");
		if (lib.checkObjectExist(HOTEL_PERFORMANCE_DASHBOARD_TXT,
				" Hotel Performance dashboard text ") == true) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Hotel Performance Link In CTA Section ");
		}
		return flag;
	}

/*	public HotelPerformancePage navigateToHotelPerformanceDashboard()
			throws Exception {
		lib.objectClick(HOTEL_PERFORMANCE_LNK, " Hotel performance Link ");
		return new HotelPerformancePage(driver);
	}*/

	public boolean verifyGlobalAndRegionalArticlesDisplayInCorrectOrder()
			throws Exception {
		boolean flag = false;
		for (int i = 1; i < getNewsCountInAdditionalNewsSection(); i++) {
			String newsType1 = lib
					.getText(
							By.xpath("(//div[@class='more-articles-container']//span[4])["
									+ i + "]"), " News Type");
			int j = i + 1;
			String newsType2 = lib
					.getText(
							By.xpath("(//div[@class='more-articles-container']//span[4])["
									+ j + "]"), " News Type");
			if (newsType1.charAt(0) >= newsType2.charAt(0)) {
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

	public boolean verifyArticlesAreDisplayedByMostRecentlyPublishedDate()
			throws Exception {
		boolean flag = false;
		for (int i = 1; i < getNewsCountInAdditionalNewsSection(); i++) {
			String date1 = lib
					.getText(
							By.xpath("(//div[@class='more-articles-container']//span[2])["
									+ i + "]"), " News Publish Date ");
			int j = i + 1;
			String date2 = lib
					.getText(
							By.xpath("(//div[@class='more-articles-container']//span[2])["
									+ j + "]"), " News Publish Date ");
			if (Integer.parseInt(date1.substring(7)) > Integer.parseInt(date2
					.substring(7))) {
				flag = true;
			} else if ((Integer.parseInt(date1.substring(7)) == Integer
					.parseInt(date2.substring(7)))) {
				int monthNumeralDate1 = MonthParser(i);
				int monthNumeralDate2 = MonthParser(j);
				if (monthNumeralDate1 > monthNumeralDate2) {
					flag = true;
				} else if (monthNumeralDate1 == monthNumeralDate2) {
					if (Integer.parseInt(date1.substring(0, 2)) >= Integer
							.parseInt(date2.substring(0, 2))) {
						flag = true;
					} else {
						flag = false;
					}
				} else {
					flag = false;
				}
			} else {
				flag = false;
			}
			if (flag == false) {
				break;
			}
		}

		return flag;

	}

	public int MonthParser(int i) throws Exception {
		int monthNumericRepresentation = 0;
		String month = lib.getText(
				By.xpath("(//div[@class='more-articles-container']//span[2])["
						+ i + "]"), "News Publish Date ");
		if (month.contains("Jan")) {
			monthNumericRepresentation = 1;
		}
		if (month.contains("Feb")) {
			monthNumericRepresentation = 2;
		}
		if (month.contains("Mar")) {
			monthNumericRepresentation = 3;
		}
		if (month.contains("Apr")) {
			monthNumericRepresentation = 4;
		}
		if (month.contains("May")) {
			monthNumericRepresentation = 5;
		}
		if (month.contains("Jun")) {
			monthNumericRepresentation = 6;
		}
		if (month.contains("Jul")) {
			monthNumericRepresentation = 7;
		}
		if (month.contains("Aug")) {
			monthNumericRepresentation = 8;
		}
		if (month.contains("Sep")) {
			monthNumericRepresentation = 9;
		}
		if (month.contains("Oct")) {
			monthNumericRepresentation = 10;
		}
		if (month.contains("Nov")) {
			monthNumericRepresentation = 11;
		}
		if (month.contains("Dec")) {
			monthNumericRepresentation = 12;
		}
		return monthNumericRepresentation;

	}

	public boolean verifyGlobalNewsOverlayContent() throws Exception {
		boolean flag = false;
		lib.mouseHover(GLOBAL_NEWS_IMG, " Global News Article Image ");
		if (lib.checkObjectExist(GLOBAL_NEWS_OVERLAY,
				" Global News Overlay content ") == true) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Global News Article Image ");

		}
		return flag;
	}

	public boolean verifyLikesCountIsDispalyedInGlobalOverlay()
			throws Exception {
		boolean flag = false;
		lib.mouseHover(GLOBAL_NEWS_IMG, " Global News Article Image ");
		if (Integer.parseInt(lib.getText(LIKE_COUNT_GLOBAL_NEWS,
				" Count Of Likes for Global News ")) >= 1) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Global News Article Image ");

		}
		return flag;
	}

	public boolean verifyCommentsCountIsDispalyedInGlobalOverlay()
			throws Exception {
		boolean flag = false;
		lib.mouseHover(GLOBAL_NEWS_IMG, " Global News Article Image ");
		if (Integer.parseInt(lib.getText(COMMENT_COUNT_GLOBAL_NEWS,
				" Count Of Comments for Global News ")) >= 1) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Global News Article Image ");
		}
		return flag;
	}

	public boolean verifyGloblalNewsTitleNotExceedsSixtyCharcaters()
			throws Exception {
		boolean flag = false;
		String titleText = (lib.getText(GLOBAL_NEWS_LNK, " Global News Title "));
		int titleLength = titleText.length();
		if (titleLength <= 60) {
			flag = true;
		}
		return flag;
	}

/*	public NewsArticlePage navigateToNewsArticlePageViaGlobalTitle()
			throws Exception {
		lib.objectClick(GLOBAL_NEWS_LNK, " Global News heading ");
		return new NewsArticlePage(driver);
	}

	public NewsArticlePage navigateToNewsArticlePageViaGlobalOverlay()
			throws Exception {
		lib.mouseHover(GLOBAL_NEWS_IMG, " Global News Article Image ");
		lib.objectClick(GLOBAL_NEWS_TITLE_OVERLAY,
				" Global News Link in overlay ");
		return new NewsArticlePage(driver);
	}*/

	public boolean verifyUserlandedToHomePage() throws Exception {
		lib.waitForElementVisible(driver, NOTIFICATION_MARQUEE_BANNER);
		return lib.checkObjectExist(NOTIFICATION_MARQUEE_BANNER,
				" Notification Marquee Banner ");
	}

	public boolean verifyRegionalNewsOverlayContent() throws Exception {
		boolean flag = false;
		lib.mouseHover(REGIONAL_NEWS_IMG, " Regional News Article Image ");
		if (lib.checkObjectExist(REGIONAL_NEWS_OVERLAY,
				" Regional News Overlay content ") == true) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Regional News Article Image ");

		}
		return flag;
	}

	public boolean verifyCommentsCountIsDispalyedInRegionalOverlay()
			throws Exception {
		boolean flag = false;
		lib.mouseHover(REGIONAL_NEWS_IMG, " Regional News Article Image ");
		if (Integer.parseInt(lib.getText(COMMENT_COUNT_REGIONAL_NEWS,
				" Count Of Comments for Regional News ")) >= 1) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Regional News Article Image ");
		}
		return flag;
	}

	public boolean verifyLikesCountIsDispalyedInRegionalOverlay()
			throws Exception {
		boolean flag = false;
		lib.mouseHover(REGIONAL_NEWS_IMG, " Regional News Article Image ");
		if (Integer.parseInt(lib.getText(LIKE_COUNT_REGIONAL_NEWS,
				" Count Of Likes for Regional News ")) >= 1) {
			flag = true;
			Report.getMessage("Mouse hover action performed on"
					+ " Regional News Article Image ");

		}
		return flag;
	}

	public boolean verifyRegionalNewsTitleNotExceedsSixtyCharcaters()
			throws Exception {
		boolean flag = false;
		String titleText = (lib.getText(REGIONAL_NEWS_LNK,
				" Regional News Title "));
		int titleLength = titleText.length();
		if (titleLength < 59) {
			flag = true;
		} else if (titleLength >= 59) {
			if (titleText.contains("...")) {
				flag = true;
			} else {
				flag = false;
			}
		}

		return flag;
	}

/*	public NewsArticlePage navigateToNewsArticlePageViaRegionalTitle()
			throws Exception {
		lib.objectClick(REGIONAL_NEWS_LNK, "Regional News Heading ");
		return new NewsArticlePage(driver);
	}

	public NewsArticlePage navigateToNewsArticlePageViaRegionalOverlay()
			throws Exception {
		lib.mouseHover(REGIONAL_NEWS_IMG, "Regional News Article Image ");
		lib.objectClick(REGIONAL_NEWS_TITLE_OVERLAY,
				"Regional News Link in overlay ");
		return new NewsArticlePage(driver);
	}*/

	public boolean verifyBellIconDisplayedOnNotificationPortlet()
			throws Exception {
		return lib.checkObjectExist(BELL_ICON,
				" Bell Icon In Notification Portlet ");
	}

	public int getNotificationSlideCount() throws Exception {
		return lib.getElementCount(NOTIFICATION_SLIDE_COUNT,
				" Count of Notification Slides ");

	}

	public boolean verifyNotificationsTitleDescriptionAndFlag()
			throws Exception {
		boolean flag = false;
		for (int i = 1; i <= getNotificationSlideCount(); i++) {
			if (i >= 2) {
				lib.objectClick(NOTIFICATION_SCROLL_NXT_BUTTON,
						"Scroll Button ");
				Thread.sleep(5000);
			}
			if (lib.checkObjectExist(
					By.xpath("(//div[@id='db_topright_slider']//div[@class='slides']//h3//a)["
							+ i + "]"), " Notification title for Notification "
							+ i) == true) {
				flag = true;
				Report.getMessage("Notification Title is displayed for notification "
						+ i);
				if (lib.checkObjectExist(
						By.xpath("(//div[@id='db_topright_slider']//div[@class='slides']//p[@class='desc'])["
								+ i + "]"),
						" Notification Description for Notification " + i) == true) {
					flag = true;
					Report.getMessage("Notification Description is displayed for notification "
							+ i);
					if (lib.checkObjectExist(
							By.xpath("(//div[@id='db_topright_slider']//div[@class='slides']//div[@class='fRight'])["
									+ i + "]"),
							" Notification Flag for Notification " + i) == true) {
						flag = true;
						Report.getMessage("Notification Image is displayed for notification "
								+ i);
					} else {
						flag = false;
					}
				} else {
					flag = false;
				}
			} else {
				flag = false;
			}
			if (flag == false) {
				break;
			}

		}
		return flag;
	}

/*	public NotificationsPage navigateToNotificationsPageViaArchiveLink() {
		lib.objectClick(ARCHIVE_LNK, " Archive Link in Notification portlet ");
		return new NotificationsPage(driver);
	}*/

	public boolean verifyArchiveLinkIsPresent() throws Exception {
		return lib.checkObjectExist(ARCHIVE_LNK,
				" Archive Link in Notification portlet ");
	}

	public boolean verifyTittleLengthConstraint() throws Exception {
		boolean flag = false;
		for (int i = 1; i <= getNotificationSlideCount(); i++) {

			if (i >= 2) {
				lib.objectClick(NOTIFICATION_SCROLL_NXT_BUTTON,
						" Scroll Button ");
				Thread.sleep(5000);
			}
			String titleText = (lib
					.getText(
							By.xpath("(//div[@id='db_topright_slider']//div[@class='slides']//h3//a)["
									+ i + "]"), " Notification Title "));
			int titleLength = titleText.length();
			if (titleLength < 35) {
				flag = true;
				Report.getMessage(" Title length Constriants are met for notification "
						+ i);
			} else if (titleLength == 35) {
				if (titleText.contains("...")) {
					flag = true;
					Report.getMessage(" Title length Constriants are met for notification "
							+ i);
				} else {
					flag = false;
				}
			}
			if (flag == false) {
				break;
			}
		}
		return flag;
	}

	public boolean verifyMoreLinkDisplaysLightBox() throws Exception {
		boolean flag = false;
		for (int i = 1; i <= getNotificationSlideCount(); i++) {
			if (i >= 2) {
				lib.objectClick(NOTIFICATION_SCROLL_NXT_BUTTON,
						" Scroll Button ");
				Thread.sleep(5000);
			}
			if ((lib.checkObjectExist(
					By.xpath("((//div[@id='db_topright_slider']//div[@class='slides']//p[@class='desc'])["
							+ i + "])//a[contains(.,'more')]"),
					"more Link for Notifcation " + i)) == true) {
				lib.objectClick(
						By.xpath("((//div[@id='db_topright_slider']//div[@class='slides']//p[@class='desc'])["
								+ i + "])//a[contains(.,'more')]"),
						"more Link for Notifcation " + i + " ");
				Thread.sleep(5000);
				if (lib.checkObjectExist(NOTIFICATION_LIGHTBOX_HEADING,
						" Notification Light Box Heading ") == true) {
					flag = true;
					Report.getMessage("Notifcation light Box is dispalyed for notification "
							+ i);
					lib.objectClick(NOTIFICATION_LIGHTBOX_CLOSE_BTN,
							" close button on Notifcation light box ");
				} else {
					flag = false;
				}
			} else {
				flag = true;
				Report.getMessage(" More link not present for notification "
						+ i
						+ " as abstract length does not exceeds max length ");
			}
			if (flag == false) {
				break;
			}
		}
		return flag;
	}

	public void moveToFirstNotifcation() throws Exception {
		lib.objectClick(FIRST_NOTIFICATION_BTN, " Notification button 1 ");
		Thread.sleep(3000);
	}

	public boolean verifyDescriptionLengthConstraint() throws Exception {
		boolean flag = false;
		for (int i = 1; i <= getNotificationSlideCount(); i++) {
			if (i >= 2) {
				lib.objectClick(NOTIFICATION_SCROLL_NXT_BUTTON,
						"Scroll Button ");
				Thread.sleep(5000);
			}
			String titleDescrption = (lib
					.getText(
							By.xpath("(//div[@id='db_topright_slider']//div[@class='slides']//p[@class='desc'])["
									+ i + "]"),
							" Notification Description for Notification " + i));
			int titleDescrptionLength = titleDescrption.length();
			if (titleDescrptionLength < 220) {
				flag = true;
				Report.getMessage(" Description length Constriants are met for notification Description "
						+ i);
			} else if (titleDescrptionLength == 220) {
				if ((lib.checkObjectExist(
						By.xpath("((//div[@id='db_topright_slider']//div[@class='slides']//p[@class='desc'])["
								+ i + "])//a[contains(.,'more')]"),
						"more Link for Notifcation" + i)) == true) {
					flag = true;
					Report.getMessage(" Description length Constriants are met for notification "
							+ i);
					Report.getMessage(" more link is present as description length is more than 220 ");
				} else {
					flag = false;
				}
			}
			if (flag == false) {
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyNewsRoomTabIsPresent() throws Exception {
		return lib.checkObjectExist(NEWSROOM_TAB, " News Room Tab ");
	}

/*	public NewsRoomPage NavigateToNewsRoomPage() throws Exception {
		lib.objectClick(NEWSROOM_TAB, "News Room Tab ");
		return new NewsRoomPage(driver);
	}

	public TeamspacesPage navigateToTeamSpacesPage() {
		lib.objectClick(TEAMSPACES_TAB, "Teamspaces Tab ");
		return new TeamspacesPage(driver);

	}

	public InitiativesPage navigateToInitiativesPage() {
		lib.objectClick(INITIATIVES_TAB, "Initiatives Tab ");
		return new InitiativesPage(driver);

	}*/

	public void navigateToPage(String headerLink) {
		lib.objectClick(
				By.xpath("//div[@class='head-left-links']//a[contains(.,'"
						+ headerLink + "')]"), headerLink + " ");

	}

	public boolean verifyDepartmentsTabIsDisplayed() throws Exception {
		return lib.checkObjectExist(DEPARTMENTS_TAB, " Departments Tab ");
	}

/*	public DepartmentsPage navigateToDepartmentsPage() {
		lib.objectClick(DEPARTMENTS_TAB, "Departments Tab ");
		return new DepartmentsPage(driver);

	}*/

	public ApplicationsPage navigateToApplicationsPage() throws Exception {
		lib.objectClick(APPLICATIONS_TAB, "Applications Tab ");
		return new ApplicationsPage(driver);
	}

	public HotelSolutionsPage switchToHotelSolutionsTab() throws Exception {
		String currWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		set.remove(currWindow);
		for (String newWindow : set) {
			driver.switchTo().window(newWindow);
		}
		return new HotelSolutionsPage(driver);
	}

/*	public EventsAndConferencesPage navigateToEventsAndConferencesPage()
			throws Exception {
		lib.objectClick(CONFERENCES_TAB, " Conferences And Events Tab ");
		return new EventsAndConferencesPage(driver);
	}*/

	public boolean verifyMyFavouritesSectionIsDisplayed() throws Exception {
		return lib.checkObjectExist(MY_FAV_SECTION, "My Favourites Section");
	}

	public boolean verifyApplicationsAreDisplayedUnderMyFavorites()
			throws Exception {
		boolean flag = false;
		int applicationCount = lib.getElementCount(APPLICATIONS_COUNT,
				" Application Count Under My Favourites");
		if (applicationCount >= 1) {
			flag = true;
		}

		return flag;
	}

	public void clickForwardButtonForMyFavouriteApplications() {
		lib.objectClick(FORWARD_BTN,
				"Forward Button for My Favourites Applications ");
	}

	public String getApplicationNameInFirstSlide(int i) throws Exception {
		lib.waitForElementVisible(driver,
				By.xpath("//ul[@id='ul1']//li[" + i + "]//p"));
		return lib.getText(By.xpath("//ul[@id='ul1']//li[" + i + "]//p"),
				" Application Name in slide 1");
	}

	public String getApplicationNameInSecondSlide(int i) throws Exception {
		lib.waitForElementVisible(driver,
				By.xpath("//ul[@id='ul2']//li[" + i + "]//p"));
		return lib.getText(By.xpath("//ul[@id='ul2']//li[" + i + "]//p"),
				" Application Name in slide 2");
	}

	public void clickPreviousButtonForMyFavouriteApplications() {
		lib.objectClick(PREVIOUS_BTN,
				" Previous Button for My Favourites Applications ");
	}

	public void clickBrowseAllApplicationsLink() {
		lib.objectClick(BROWSE_ALL_APPLICATIONS_LNK,
				"Browse All Applications Link ");
	}

	public void reArrangeApplications(int i, int j) throws Exception {
		lib.dragAndDrop(By.xpath("//ul[@id='ul1']//li[" + i + "]//img"),
				By.xpath("//ul[@id='ul1']//li[" + j + "]//img"));
		Thread.sleep(2000);
		lib.refreshPage();
	}

	public boolean verifyPopularApplicationsButtonIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(POPULAR_APP_BTN,
				" Popular Applications Button ");
	}

	public boolean verifyMyFavouritesTitleIsDisplayed() throws Exception {
		return lib.checkObjectExist(MY_FAVOURITES_TITLE,
				" My Favourites Title ");
	}

	public boolean verifyMyFavouritesHelpIconIsDisplayed() throws Exception {
		return lib.checkObjectExist(MY_FAVOURITES_HELP_ICON, " Help Icon ");
	}

	public boolean verifyBrowseAllApplicationsLinkIsDisplayed()
			throws Exception {
		return lib.checkObjectExist(BROWSE_ALL_APPLICATIONS_LNK,
				"Browse All Applications Link ");
	}

	public boolean verifyForwardButtonIsDisplayed() throws Exception {
		return lib.checkObjectExist(FORWARD_BTN, "Forward Button");
	}

	public boolean verifyBackwardButtonIsDisplayed() throws Exception {
		return lib.checkObjectExist(PREVIOUS_BTN, "Backward Button");
	}

	public boolean verifyTabUnderMyFavouritesIsDisplayed(String tabName)
			throws Exception {
		return lib.checkObjectExist(
				By.xpath("//ul[@id='dashboard-tabs']//a[contains(.,'" + tabName
						+ "')]"), "My Favourites tab - " + tabName);
	}

	/*public PopularApplicationsPage navigateToPopularApplicationsPage() {
		lib.objectClick(POPULAR_APP_BTN, "Popular Applications Button");
		return new PopularApplicationsPage(driver);
		
	}*/

}