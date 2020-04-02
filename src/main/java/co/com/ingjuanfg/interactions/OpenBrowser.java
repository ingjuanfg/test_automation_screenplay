package co.com.ingjuanfg.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.ingjuanfg.user_interfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Interaction {
  private HomePage homePage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(homePage));
  }

  public static Performable withSpecificUrl() {
    return instrumented(OpenBrowser.class);
  }
}
