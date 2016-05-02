package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by alex on 02.05.16.
 */
public class GreetingsSteps {
    @Given("^time of the day: \"([^\"]*)\"$")
    public void timeOfTheDay(String timeString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^program run$")
    public void programRun() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^we have \"([^\"]*)\"$")
    public void weHave(String greetingMessage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
