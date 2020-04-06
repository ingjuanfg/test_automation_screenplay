package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightPage {
    public static final Target TXT_FLYING_FROM = Target.the("Input to Select Origin Flight").located(By.id("flight-origin-hp-flight"));
    public static final Target OPT_AIRPORT = Target.the("Input to Select Origin Flight").locatedBy("//a[@data-value='{0}']");
    public static final Target TXT_FLYING_TO = Target.the("Input to Select Destiny Flight").located(By.id("flight-destination-hp-flight"));
    public static final Target TXT_DEPARTING_DATE = Target.the("Input to Select Date Departing").located(By.id("flight-departing-hp-flight"));
    public static final Target TXT_RETURNING_DATE = Target.the("Input to Select Date Returning").located(By.id("flight-returning-hp-flight"));
}
