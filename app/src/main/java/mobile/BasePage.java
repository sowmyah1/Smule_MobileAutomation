package mobile;

import Common_utils.ConfigLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static AppiumDriver androidDriver;

    public AppiumDriver getDriver() {
        ConfigLoader configLoader = new ConfigLoader();
        DesiredCapabilities capabilities = new DesiredCapabilities(configLoader.getCapability());
        try {
            androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return androidDriver;
    }
}
