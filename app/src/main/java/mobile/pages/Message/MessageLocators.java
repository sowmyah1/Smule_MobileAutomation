package mobile.pages.Message;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import mobile.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

    public class MessageLocators extends BasePage {
        public MessageLocators() {
            PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        }

        @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Messages']")
        WebElement messageHeader;
        @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index = '4' and @enabled = 'true']/android.widget.LinearLayout[@index = '0']")
        WebElement newChatIconLocator;
        @AndroidFindBy(id = "com.smule.singandroid:id/search_edit_text")
        WebElement searchUserLocator;
        @AndroidFindBy(id = "com.smule.singandroid:id/multiple_portrait_profile_image")
        WebElement profileImageLocator;
        @AndroidFindBy(id = "com.smule.singandroid:id/action_next")
        WebElement nextBtnLocator;
        @AndroidFindBy(id = "com.smule.singandroid:id/inputBox")
        WebElement messageInputLocator;
        @AndroidFindBy(id = "com.smule.singandroid:id/send_button")
        WebElement sendMessageBtnLocator;

    }

