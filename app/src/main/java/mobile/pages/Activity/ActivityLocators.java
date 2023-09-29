package mobile.pages.Activity;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ActivityLocators {
    @AndroidFindBy(id = "com.smule.singandroid:id/menu_item_activity")
    public WebElement activityButton;

    @AndroidFindBy(accessibility = "Notifications")
    public WebElement notifications;

    @AndroidFindBy(accessibility = "Invites")
    public WebElement invites;

    @AndroidFindBy(accessibility = "News")
    public WebElement news;
}
