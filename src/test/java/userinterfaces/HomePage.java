package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

  public static Target OPTION_MENU_BUTTON = Target.the("option in the home")
      .locatedBy("//span[text()='Panel de inicio']");

  public static Target MEDIA_OPTION_BUTTON = Target.the("multimedia option menu")
      .locatedBy("//span[text()='Multimedia']");


}
