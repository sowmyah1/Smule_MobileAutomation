package mobile.pages.Login;

import io.appium.java_client.MobileBy;
import mobile.BasePage;
import org.openqa.selenium.WebElement;

public class LoginScroll extends BasePage{
    public void languageScroll(){

         androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"English\"))")).click();
        
    }
}
