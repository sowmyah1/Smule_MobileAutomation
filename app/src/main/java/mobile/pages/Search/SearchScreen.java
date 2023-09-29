package mobile.pages.Search;

import mobile.BasePage;

public class SearchScreen extends SearchLocators {
    public void clickOnSearch() {
        sendMessageBtnLocator.click();
    }
    public void enterSearchElement(String key) {
        searchItem.sendKeys(key);
    }
    public boolean isSearchItemDisplayed(){
        return searchItemList.isDisplayed();
    }
}
