package facebook;

import core.DriverManage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.StartPage;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

public class FacebookTest {
    @Before
    public void basicConfigure() {
        BasicConfigurator.configure();
    }

    @After
    public void killDriver() {
        DriverManage.kill();
    }

    @Test
    public void firstTest() {

        String expectedErrorMessage = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";

        new StartPage()
                .navigateTo("https://www.google.com")
                .typeTextToSearchField("Facebook")
                .clickFacebookPage()
                .checkThatPageURLCorrect("https://www.facebook.com/")
                .login("badLogin", "badPassword")
                .clickLoginButton()
                .checkThatErrorMessageIsCorrect(expectedErrorMessage);
    }
}
