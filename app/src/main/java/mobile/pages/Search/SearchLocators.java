package mobile.pages.Search;

import io.appium.java_client.pagefactory.AndroidFindBy;
import mobile.BasePage;
import org.openqa.selenium.WebElement;

public class SearchLocators extends BasePage {
    @AndroidFindBy(id = "com.smule.singandroid:id/send_button")
    WebElement sendMessageBtnLocator;

    @AndroidFindBy(id = "com.smule.singandroid:id/pre_search_title_text_view")
    WebElement searchItem;

    @AndroidFindBy(id = "com.smule.singandroid:id/autocomplete_empty_view")
    WebElement searchItemList;


}
