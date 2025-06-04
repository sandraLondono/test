package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import questions.CommonsQuestions;
import tasks.login.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinitions {

  @Managed(uniqueSession = true)
  public static WebDriver driver;

  public static Actor user;

  @Before
  public void setUp() {
    user = Actor.named("qa analyst");
    user.can(BrowseTheWeb.with(driver));
    user.wasAbleTo(Open.browserOn().thePageNamed("base_url"));
  }

  private EnvironmentVariables environmentVariables;

  @When("enter login credentials {string} {string}")
  public void fillLoginForm(String username, String password){
    user.attemptsTo(
        LoginTask.withCredentials(username, password)
    );
  }

  @Then("i can see the home page")
  public void validateLogin(){
    user.attemptsTo(

    );
    user.should(
            seeThat("", CommonsQuestions.inHome(), is(true))
    );
  }


}
