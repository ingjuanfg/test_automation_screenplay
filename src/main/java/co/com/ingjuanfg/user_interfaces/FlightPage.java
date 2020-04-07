package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightPage {
    public static final Target TXT_FLYING_FROM = Target.the("Input to Select Origin Flight").located(By.id("flight-origin-hp-flight"));
    public static final Target OPT_AIRPORT = Target.the("Input to Select Origin Flight").locatedBy("//a[@data-value='{0}']");
    public static final Target BTN_DATE_CALANDER = Target.the("Button date Calander").locatedBy(".//button[@data-month='{0}'and@data-day='{1}'and@data-year='{2}']");
    public  static  final  Target BTN_NEXT_MONTH  = Target.the("Next month calander").locatedBy(".//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']");
    public static final Target TXT_DATE_FORM_FLIGHT = Target.the("Button to select Fligth date").locatedBy("//input[@id='flight-{0}-hp-flight']");
    public static final Target TXT_FLYING_TO = Target.the("Input to Select Destiny Flight").located(By.id("flight-destination-hp-flight"));
    public static final Target TXT_DEPARTING_DATE = Target.the("Input to Select Date Departing").located(By.id("flight-departing-hp-flight"));
    public static final Target TXT_RETURNING_DATE = Target.the("Input to Select Date Returning").located(By.id("flight-returning-hp-flight"));
}
