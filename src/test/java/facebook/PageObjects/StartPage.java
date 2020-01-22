package facebook.PageObjects;

import core.Driver;

public class StartPage {
    public GooglePage navigateTo(String url) {
        Driver.getDriver().get(url);
        return new GooglePage();
    }
}
