package co.com.ingjuanfg.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Change implements Interaction {
  @Override
  public <T extends Actor> void performAs(T actor) {
    List<String> tabs = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    for (int iterator = 1; tabs.size() <= iterator; iterator++) {
      BrowseTheWeb.as(actor).getDriver().switchTo().window(tabs.get(iterator));
      if ("Trip Detail | Travelocity".contains(BrowseTheWeb.as(actor).getDriver().getTitle())) {
        break;
      }
    }
  }

  public static Performable toTheTab() {
    return instrumented(Change.class);
  }
}
