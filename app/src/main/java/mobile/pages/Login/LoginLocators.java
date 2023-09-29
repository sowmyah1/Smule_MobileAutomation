package mobile.pages.Login;



import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobile.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLocators extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uE920 OK']")
    public WebElement yesButton;
    @AndroidFindBy(id = "com.smule.singandroid:id/email_button_view")
    public WebElement emailSignup;
    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement emailAddress;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement nextToPassWord;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement password;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement nextToHome;

    @AndroidFindBy(id = "com.smule.singandroid:id/noButton")
    public WebElement locationAccess;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Messages']")
    WebElement messageHeader;
}