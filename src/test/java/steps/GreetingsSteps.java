package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.serenity.TechSteps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alex on 02.05.16.
 */
public class GreetingsSteps {

    @Steps
    TechSteps techSteps;

    @Given("^time of the day: \"([^\"]*)\"$")
    public void timeOfTheDay(String timeString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        techSteps.setTime(timeString);
    }

    @When("^program run$")
    public void programRun() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        techSteps.run();
    }

    @Then("^we have \"([^\"]*)\"$")
    public void weHave(String greetingMessage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(techSteps.getGreeting(), is(greetingMessage));
    }


    @And("^set language: \"([^\"]*)\"$")
    public void setLanguage(String language) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        techSteps.setLanguage(language);
    }
}
