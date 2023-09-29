package mobile.pages.Feed;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FeedLocators {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Feed']")
    public WebElement feedButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Get Started']")
    public WebElement feed;
}
