package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

  public static Target USERNAME_INPUT = Target.the("username input")
      .locatedBy("//input[@ng-reflect-name='userName']");

  public static Target PASSWORD_INPUT = Target.the("username input")
      .locatedBy("//input[@ng-reflect-name='password']");

  public static Target LOGIN_BUTTON = Target.the("username input")
      .locatedBy("//span[text()='Iniciar sesión']");

}
