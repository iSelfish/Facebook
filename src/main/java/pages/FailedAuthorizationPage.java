package pages;

import static org.junit.Assert.assertEquals;
import static core.DriverManage.getDriver;

import org.openqa.selenium.By;

public class FailedAuthorizationPage {
    private final By errorMessage = By.className("_9ay7");

    public FailedAuthorizationPage checkThatErrorMessageIsCorrect(String expectedAlertText) {
        String actualErrorMessage = getDriver().findElement(errorMessage).getText();
        assertEquals(actualErrorMessage, expectedAlertText);
        return new FailedAuthorizationPage();
    }
}
