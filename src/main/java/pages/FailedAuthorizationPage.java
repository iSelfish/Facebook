package pages;

import static org.junit.Assert.assertTrue;
import static core.DriverManage.getDriver;

import org.openqa.selenium.By;

public class FailedAuthorizationPage {
    private By alertMessage = By.xpath("//div[@role='alert']");

    public FailedAuthorizationPage checkThatAlertIsCorrect() {
        String alertText = getDriver().findElement(alertMessage).getText();
        String expectedAlertTextUS = "Invalid username or password";
        String expectedAlertTextRUS = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту.";
        assertTrue((alertText.contains(expectedAlertTextUS)) || (alertText.contains(expectedAlertTextRUS)));
        return new FailedAuthorizationPage();
    }
}
