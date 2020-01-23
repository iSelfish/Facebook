package facebook.PageObjects;

import org.openqa.selenium.By;

import static core.DriverManage.getDriver;

public class SearchResultPage {
    private By facebookSearch = By.xpath("//a[@href='https://www.facebook.com/']");

    public FacebookPage clickFacebookPage() {
        getDriver().findElement(facebookSearch).click();
        return new FacebookPage();
    }
}
