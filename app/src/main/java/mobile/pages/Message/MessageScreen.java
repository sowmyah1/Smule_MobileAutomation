package mobile.pages.Message;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class MessageScreen extends MessageLocators {
    public MessageScreen clickChatIcon(){
        new MessageLocators();
        newChatIconLocator.click();
        return this;
    }

    public MessageScreen enterUserName(String name){
        searchUserLocator.sendKeys(name);
        searchUserLocator.click();
        return this;
    }

    public MessageScreen selectTheUserProfile(){
        profileImageLocator.click();
        return this;
    }
    public MessageScreen clickNextButton(){
        nextBtnLocator.click();
        return this;
    }
    public void sendMessage(String message){
        messageInputLocator.sendKeys(message);
        sendMessageBtnLocator.click();
    }

    public boolean isSendMessageBtnClickAble(){
        return sendMessageBtnLocator.isEnabled();
    }

}