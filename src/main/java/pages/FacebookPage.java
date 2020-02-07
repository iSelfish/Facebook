package pages;

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static core.DriverManage.getDriver;

public class FacebookPage {

    private By inputEmail = By.id("email");
    private By inputPassword = By.id("pass");
    private By loginButton = By.xpath("//input[@data-testid='royal_login_button']");

    public FacebookPage checkThatPageURLCorrect(String expectedUrl) {
        String url = getDriver().getCurrentUrl();
        assertEquals(expectedUrl, url);
        return new FacebookPage();
    }

    public FacebookPage login(String email, String pass) {
        getDriver().findElement(inputEmail).sendKeys(email);
        getDriver().findElement(inputPassword).sendKeys(pass);
        return new FacebookPage();
    }

    public FailedAuthorizationPage clickLoginButton() {
        getDriver().findElement(loginButton).click();
        return new FailedAuthorizationPage();
    }
}
