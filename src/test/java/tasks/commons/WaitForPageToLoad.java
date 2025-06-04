package tasks.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitForPageToLoad implements Task {

    public static WaitForPageToLoad completely() {
        return instrumented(WaitForPageToLoad.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriverWait wait = new WebDriverWait(
                BrowseTheWeb.as(actor).getDriver(),
                Duration.ofSeconds(15)
        );

        wait.until(driver -> {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return "complete".equals(js.executeScript("return document.readyState"));
        });
    }
}