
package mobile.pages.Login;
import mobile.pages.Home.HomeScreen;
import mobile.pages.Pagewaits;

public class LoginScreen extends LoginLocators {
    Pagewaits pagewaits= new Pagewaits();
    public void clickOnYes() {
        yesButton.click();

    }
    public LoginScreen emailSignup() {
        emailSignup.click();
        pagewaits.screenWaits(this.emailAddress);
        emailAddress.sendKeys("qwertyhello123@gmail.com");
        nextToPassWord.click();
        return this;
    }

//
    public LoginScreen enterPassword() {
        pagewaits.screenWaits(password);
        password.sendKeys("1234Qwerty");
        nextToHome.click();
        pagewaits.screenWaits(locationAccess);
        locationAccess.click();
        return this;
    }
    public boolean isDisplay(){
        return messageHeader.isDisplayed();
    }
//


}