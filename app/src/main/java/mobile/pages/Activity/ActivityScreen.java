package mobile.pages.Activity;

public class ActivityScreen extends ActivityLocators{
    public ActivityScreen clickOnActivity() {
        activityButton.click();
        return this;
    }
    public ActivityScreen clickOnNotification() {
        notifications.click();
        return this;
    }
    public ActivityScreen clickOnNews() {
        news.click();
        return this;
    }
    public boolean isInvitesDisplayed(){
       return invites.isDisplayed();
    }
    public boolean isNotificationDisplayed(){
        return notifications.isDisplayed();
    }
    public boolean isNewsDisplayed(){
        return news.isDisplayed();
    }

}
