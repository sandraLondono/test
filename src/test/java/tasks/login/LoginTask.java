package tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.commons.WaitForPageToLoad;
import userinterfaces.HomePage;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Performable {


    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.password = password;
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                WaitForPageToLoad.completely(),
                WaitUntil.the(LoginPage.USERNAME_INPUT, isVisible())
                        .forNoMoreThan(15).seconds()
                , Enter.theValue(username).into(LoginPage.USERNAME_INPUT)
                , Enter.theValue(password).into(LoginPage.PASSWORD_INPUT)
                , Click.on(LoginPage.LOGIN_BUTTON)
                , WaitUntil.the(HomePage.OPTION_MENU_BUTTON, isVisible()).forNoMoreThan(10).seconds()
                , WaitForPageToLoad.completely()
        );
    }

    public static LoginTask withCredentials(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }


}
