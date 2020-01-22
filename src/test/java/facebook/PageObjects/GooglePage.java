package facebook.PageObjects;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private By searchField = By.name("q");

    public SearchResultPage textToSearchField() {
        WebElement searchFieldElement = Driver.getDriver().findElement(searchField);
        searchFieldElement.sendKeys(" Facebook " + Keys.ENTER);
        return new SearchResultPage();
    }
}
