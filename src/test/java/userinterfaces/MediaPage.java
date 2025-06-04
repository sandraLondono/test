package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MediaPage {

    public static Target MEDIA_TITLE = Target.the("content details")
            .locatedBy("//h1[text()='Multimedia']");

    public static Target MEDIA_OPTIONS_DETAILS = Target.the("content details")
            .locatedBy("//span[text()='{0}']");

    public static Target MEDIA_DESCRIPTION_DETAILS = Target.the("description details")
            .locatedBy("//a[text()='{0}']");
    //a[text()='Tekus horizontal.png']

    public static Target PREVIEW_IMG = Target.the("preview img")
            .locatedBy("//span[text()='Panel de inicio']");


}
