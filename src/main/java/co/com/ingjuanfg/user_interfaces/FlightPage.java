package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightPage {
  public static final Target TXT_FLYING_FROM =
      Target.the("Input to Select Origin Flight").located(By.id("flight-origin-hp-flight"));
  public static final Target OPT_AIRPORT =
      Target.the("Input to Select Origin Flight").locatedBy("//a[@data-value='{0}']");
  public static final Target TXT_FLYING_TO =
      Target.the("Input to Select Destiny Flight").located(By.id("flight-destination-hp-flight"));
  public static final Target INPUT_DATE =
      Target.the("Input to select departure and returning date")
          .locatedBy("//input[@id='flight-{0}-hp-flight']");
  public static final Target BTN_CALENDAR_DAY =
      Target.the("Date of departure")
          .locatedBy("//button[@class='datepicker-cal-date' and @data-year='{0}' and @data-month='{1}' and @data-day='{2}']");
  public static final Target BTN_CALENDAR_NEXT_MONTHS =
      Target.the("The button to show next months")
          .locatedBy("//button[contains(@class,'btn-secondary next')]");
  public static final Target BTN_SEARCH_FLIGHT =
      Target.the("The button to search a specific flight")
          .locatedBy("(//button[@data-gcw-change-submit-text='Search'])[1]");
}
