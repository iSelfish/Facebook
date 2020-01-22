package facebook.PageObjects;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    private By facebookSearch = By.xpath("//a[@href=\"https://www.facebook.com/\"]");
    public FacebookPage clickFacebookPage() {
        WebElement facebookSearchElement = Driver.getDriver().findElement(facebookSearch);
        facebookSearchElement.click();
        return new FacebookPage();
    }
}
