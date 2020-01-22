package facebook.PageObjects;

import core.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FailedAuthorizationPage {
    private By alertMessage = By.xpath("//div[@role=\"alert\"]");

    public FailedAuthorizationPage verifyAlertIsDisplayed() {
        WebElement alertMessageElement = Driver.getDriver().findElement(alertMessage);
        String alertMessageText = alertMessageElement.getText();
        String expectedAlertMessageTest = "The email or phone number you’ve entered doesn’t match any account.";
        Assert.assertTrue(alertMessageText.contains(expectedAlertMessageTest));
        return new FailedAuthorizationPage();
    }
}
