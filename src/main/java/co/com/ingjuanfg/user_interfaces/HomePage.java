package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
  public static final Target BTN_TRAVEL_OPTIONS =
      Target.the("Button to select travelocity options")
          .locatedBy("//button[@id='tab-{0}-tab-hp']");
  public static final Target TXT_DATE =
          Target.the("Button to select travelocity options")
                  .located(By.id("flight-departing-hp-flight"));
}
