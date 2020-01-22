package facebook.PageObjects;

import core.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookPage {

    private By inputEmail = By.xpath("//input[@id=\"email\"]");
    private By inputPassword = By.xpath("//input[@id=\"pass\"]");
    private By loginButton = By.xpath("//input[@value=\"Log In\"]");

    public FacebookPage verifyRedirect() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.facebook.com/", url);
        return new FacebookPage();
    }

    public FacebookPage login(String email, String pass) {
        WebElement inputEmailElement = Driver.getDriver().findElement(inputEmail);
        WebElement inputPasswordElement = Driver.getDriver().findElement(inputPassword);
        inputEmailElement.sendKeys(email);
        inputPasswordElement.sendKeys(pass);
        return new FacebookPage();
    }

    public FailedAuthorizationPage clickLoginButton() {
        WebElement loginButtonElement = Driver.getDriver().findElement(loginButton);
        loginButtonElement.click();
        return new FailedAuthorizationPage();
    }
}
