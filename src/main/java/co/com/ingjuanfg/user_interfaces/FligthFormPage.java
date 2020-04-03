package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class FligthFormPage {

    public static final Target TXT_DATE_FORM_FLIGHT = Target.the("Button to select Fligth date").locatedBy("//input[@id='flight-{0}-hp-flight']");
    public static final Target BTN_DATE_CALANDER = Target.the("Button date Calander").locatedBy(".//button[@data-month='{0}'and@data-day='{1}'and@data-year='{2}']");
    public  static  final  Target BTN_NEXT_MONTH  = Target.the("Next month calander").locatedBy(".//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']");
    public static  final  Target  TXT_FLYFROM  = Target.the("fly from select").located(By.id("package-origin-hp-package"));
    public static  final  Target  TXT_FLYTO  = Target.the("fly from select").located(By.id("package-destination-hp-package"));
}
