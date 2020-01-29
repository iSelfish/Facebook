package facebook;
//main
import core.DriverManage;
import pages.StartPage;
import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
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

        new StartPage()
                .navigateTo("https://www.google.com")
                .typeTextToSearchField("Facebook")
                .clickFacebookPage()
                .checkThatPageURLCorrect()
                .login("badLogin", "badPassword")
                .clickLoginButton()
                .checkThatAlertIsCorrect();
    }
}
