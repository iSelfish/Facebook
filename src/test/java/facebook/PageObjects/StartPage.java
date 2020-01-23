package facebook.PageObjects;

import static core.DriverManage.getDriver;

public class StartPage {
    public GooglePage navigateTo(String url) {
        getDriver().get(url);
        return new GooglePage();
    }
}
