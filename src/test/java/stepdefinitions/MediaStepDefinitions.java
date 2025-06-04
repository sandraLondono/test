package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.CommonsQuestions;
import tasks.home.HomeTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static stepdefinitions.LoginStepDefinitions.user;

public class MediaStepDefinitions {

    @When("i go to media page")
    public void iGoToMediaPage() {
        user.attemptsTo(HomeTask.gotoMediaOption());
    }

    @Then("i can see the properties related {string} {string} {string}")
    public void iCanSeeThePropertiesRelated(String size, String id, String description) {
        user.should(
                seeThat("validate size option exists", CommonsQuestions.detailsMedia(size), is(true)),
                seeThat("validate id option exists", CommonsQuestions.detailsMedia(id), is(true)),
                seeThat("validate description option exists", CommonsQuestions.descriptionMedia(description), is(true)),
                seeThat("validate preview option exists", CommonsQuestions.previewMedia(), is(true))
        );


    }

}
