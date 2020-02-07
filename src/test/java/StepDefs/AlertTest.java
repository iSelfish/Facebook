package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class AlertTest {
    @Given("^I am on the \"([^\"]*)\" website$")
    public void iAmOnTheWebsite(String url) {
        new StartPage().navigateTo(url);
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchText) {
        new GooglePage().typeTextToSearchField(searchText);
    }

    @And("^I click facebook link$")
    public void clickLink() {
        new SearchResultPage().clickFacebookPage();
    }

    @Then("^I am redirected to \"([^\"]*)\"$")
    public void iAmRedirectedTo(String url) {
        new FacebookPage().checkThatPageURLCorrect(url);
    }

    @And("I enter {string} as login and {string} as password")
    public void iEnterAsLoginAndAsPassword(String login, String password) {
        new FacebookPage().login(login, password);
    }

    @And("click login button")
    public void clickLoginButton() {
        new FacebookPage().clickLoginButton();
    }

    @Then("message {string} is displayed.")
    public void messageIsDisplayed(String expectedAlertMessage) {
        new FailedAuthorizationPage().checkThatAlertIsCorrect(expectedAlertMessage);
    }
}
