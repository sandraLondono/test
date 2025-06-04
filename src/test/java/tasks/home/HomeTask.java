package tasks.home;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.commons.WaitForPageToLoad;
import userinterfaces.HomePage;
import userinterfaces.MediaPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeTask {

    public static Task gotoMediaOption() {
        return Task.where("Go to Media Page",
                WaitForPageToLoad.completely(),
                Click.on(HomePage.MEDIA_OPTION_BUTTON),
                WaitUntil.the(MediaPage.MEDIA_TITLE, isVisible()).forNoMoreThan(10).seconds());
    }
}
