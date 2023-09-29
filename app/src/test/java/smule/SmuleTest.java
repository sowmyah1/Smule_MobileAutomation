package smule;

import mobile.pages.Feed.FeedScreen;
import mobile.pages.Login.LoginScreen;
import mobile.pages.Login.LoginScroll;
import mobile.pages.Message.MessageScreen;
import mobile.pages.Search.SearchScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmuleTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginScroll scroll = new LoginScroll();
        LoginScreen login = new LoginScreen();

        scroll.languageScroll();
        login.clickOnYes();
        login.emailSignup();
        login.enterPassword();

        Assert.assertTrue(login.isDisplay(), "HomePage not displayed");

    }

    @Test
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

    @Test
    void FeedTest() {
        testLogin();
        FeedScreen feedScreen = new FeedScreen();
        feedScreen.clickOnFeed();

        Assert.assertTrue(feedScreen.isDisplay(), "Feed not accessible");
    }

    @Test
    void SearchTest() {
        testLogin();
        SearchScreen searchScreen = new SearchScreen();
        searchScreen.clickOnSearch();
        searchScreen.enterSearchElement("shreyaghoshal");

        Assert.assertTrue(searchScreen.isSearchItemDisplayed(), "Search Item not found");

    }
}



