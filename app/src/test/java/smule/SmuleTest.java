package smule;

import mobile.pages.Activity.ActivityScreen;
import mobile.pages.Feed.FeedScreen;
import mobile.pages.Login.LoginScreen;
import mobile.pages.Login.LoginScroll;
import mobile.pages.Message.MessageScreen;
import mobile.pages.Search.SearchScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmuleTest extends BaseTest {

    @Test(groups = "sanity")
    public void testLogin() {
        LoginScroll scroll = new LoginScroll();
        LoginScreen login = new LoginScreen();

        scroll.languageScroll();
        login.clickOnYes();
        login.emailSignup();
        login.enterPassword();

        Assert.assertTrue(login.isDisplay(), "HomePage not displayed");

    }

    @Test(groups = "sanity")
    void messageTest() {
        testLogin();
        MessageScreen screenAction = new MessageScreen();
        screenAction.clickChatIcon();
        screenAction.enterUserName("kbaganna");
        screenAction.selectTheUserProfile();
        screenAction.clickNextButton();
        screenAction.sendMessage("Hi");

        Assert.assertTrue(screenAction.isSendMessageBtnClickAble(), "Message not sent");

    }

    @Test(groups = "sanity")
    void FeedTest() {
        testLogin();
        FeedScreen feedScreen = new FeedScreen();
        feedScreen.clickOnFeed();

        Assert.assertTrue(feedScreen.isDisplay(), "Feed not accessible");
    }

    @Test(groups = "sanity")
    void SearchTest() {
        testLogin();
        SearchScreen searchScreen = new SearchScreen();
        searchScreen.clickOnSearch();
        searchScreen.enterSearchElement("shreyaghoshal");

        Assert.assertTrue(searchScreen.isSearchItemDisplayed(), "Search Item not found");

    }
    @Test(groups = "sanity")
    void ActivityTest(){
        testLogin();
        ActivityScreen activityScreen = new ActivityScreen();
        activityScreen.clickOnActivity();
        Assert.assertTrue(activityScreen.isInvitesDisplayed(),"Invites not displayed");

        activityScreen.clickOnNotification();
        Assert.assertTrue(activityScreen.isNotificationDisplayed(),"Notifications not displayed");

        activityScreen.clickOnNews();
        Assert.assertTrue(activityScreen.isNewsDisplayed(),"News not displayed");
    }
}



