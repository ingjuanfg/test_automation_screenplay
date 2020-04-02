package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
  public static final Target BTN_TRAVEL_OPTIONS =
      Target.the("Button to select travelocity options")
          .locatedBy("//button[@id='tab-{0}-tab-hp']");
}
