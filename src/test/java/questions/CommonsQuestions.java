package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import userinterfaces.HomePage;
import userinterfaces.MediaPage;

public class CommonsQuestions {

    public static Question<Boolean> inHome() {
        return Question.about("check element in the home page")
                .answeredBy(actor -> WebElementQuestion.the(HomePage.OPTION_MENU_BUTTON).answeredBy(actor).isCurrentlyVisible());
    }

    public static Question<Boolean> detailsMedia(String option) {
        return Question.about("validate option ")
                .answeredBy(actor -> WebElementQuestion.the(MediaPage.MEDIA_OPTIONS_DETAILS.of(option)).answeredBy(actor).isCurrentlyVisible());
    }

    public static Question<Boolean> descriptionMedia(String description) {
        return Question.about("validate option ")
                .answeredBy(actor -> WebElementQuestion.the(MediaPage.MEDIA_DESCRIPTION_DETAILS.of(description)).answeredBy(actor).isCurrentlyVisible());
    }

    public static Question<Boolean> previewMedia() {
        return Question.about("validate option ")
                .answeredBy(actor -> WebElementQuestion.the(MediaPage.PREVIEW_IMG).answeredBy(actor).isCurrentlyVisible());
    }
}
