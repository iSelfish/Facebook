package pages;

import org.openqa.selenium.By;
import pages.FacebookPage;

import static core.DriverManage.getDriver;

public class SearchResultPage {
    private By facebookSearch = By.xpath("//a[@href='https://www.facebook.com/']");

    public FacebookPage clickFacebookPage() {
        getDriver().findElement(facebookSearch).click();
        return new FacebookPage();
    }
}
