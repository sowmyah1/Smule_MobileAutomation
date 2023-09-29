package mobile.pages.Feed;

public class FeedScreen extends FeedLocators{
    public void clickOnFeed() {
        feedButton.click();
    }

    public boolean isDisplay(){
        return feed.isDisplayed();
    }
}
