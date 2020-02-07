package pages;

import static org.junit.Assert.assertTrue;
import static core.DriverManage.getDriver;

import org.openqa.selenium.By;

public class FailedAuthorizationPage {
    private By alertMessage = By.xpath("//div[@role='alert']");

    public FailedAuthorizationPage checkThatAlertIsCorrect(String expectedAlertText) {
        String alertText = getDriver().findElement(alertMessage).getText();
        assertTrue((alertText.contains(expectedAlertText)));
        return new FailedAuthorizationPage();
    }
}
