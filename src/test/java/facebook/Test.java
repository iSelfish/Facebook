package facebook;

import core.Driver;
import facebook.PageObjects.StartPage;
import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;

public class Test {
    @Before
    public void basicConfigure() {
        BasicConfigurator.configure();
    }

    @After
    public void killDriver() {
        Driver.kill();
    }

    @org.junit.Test
    public void firstTest() {

        new StartPage()
                .navigateTo("https://www.google.com")
                .textToSearchField()
                .clickFacebookPage()
                .verifyRedirect()
                .textToInputEmail("badLogin")
                .textToInputPassword("badPassword")
                .clickLoginButton()
                .verifyAlertIsDisplayed();
    }
}
