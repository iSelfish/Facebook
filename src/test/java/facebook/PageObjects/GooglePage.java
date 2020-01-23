package facebook.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static core.DriverManage.getDriver;

public class GooglePage {
    private By searchField = By.name("q");

    public SearchResultPage typeTextToSearchField(String text) {
        getDriver().findElement(searchField).sendKeys(text + Keys.ENTER);
        return new SearchResultPage();
    }
}
