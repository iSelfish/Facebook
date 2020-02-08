package facebook;

import core.DriverManage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import pages.StartPage;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

@RunWith(SerenityRunner.class)
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

        String alertMessageRu = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту.";
        String alertMessageUS = "The email or phone number you’ve entered doesn’t match any account.";

        new StartPage()
                .navigateTo("https://www.google.com")
                .typeTextToSearchField("Facebook")
                .clickFacebookPage()
                .checkThatPageURLCorrect("https://www.facebook.com/")
                .login("badLogin", "badPassword")
                .clickLoginButton()
                .checkThatAlertIsCorrect(alertMessageRu);
    }
}
