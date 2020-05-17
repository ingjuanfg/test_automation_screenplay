package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.userinterface.CreateAccountPage.*;

import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormRegisterMap extends FillOut {
  private Map<String, String> personalInformation;

  public FormRegisterMap(Map<String, String> personalInformation) {
    this.personalInformation = personalInformation;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(OPT_TITLE.of(personalInformation.get("title"))),
        Enter.theValue(personalInformation.get("firstName")).into(TXT_FIRST_NAME_PI),
        Enter.theValue(personalInformation.get("lastName")).into(TXT_LAST_NAME_PI),
        Enter.theValue(personalInformation.get("password")).into(TXT_PASSWORD),
        SelectFromOptions.byValue(personalInformation.get("dayBirth")).from(SLT_DAY_BIRTH),
        SelectFromOptions.byValue(personalInformation.get("monthBirth")).from(SLT_MONTH_BIRTH),
        SelectFromOptions.byValue(personalInformation.get("yearBirth")).from(SLT_YEAR_BIRTH),
        Enter.theValue(personalInformation.get("firstName")).into(TXT_FIRST_NAME_YA),
        Enter.theValue(personalInformation.get("lastName")).into(TXT_LAST_NAME_YA),
        Enter.theValue(personalInformation.get("company")).into(TXT_COMPANY),
        Enter.theValue(personalInformation.get("address")).into(TXT_ADDRESS),
        Enter.theValue(personalInformation.get("city")).into(TXT_CITY),
        SelectFromOptions.byVisibleText(personalInformation.get("state")).from(SLT_STATE),
        Enter.theValue(personalInformation.get("postalCode")).into(TXT_POSTAL_CODE),
        Enter.theValue(personalInformation.get("additionalInfo")).into(TXT_ADDITIONAL_INFORMATION),
        Enter.theValue(personalInformation.get("homePhone")).into(TXT_HOME_PHONE),
        Enter.theValue(personalInformation.get("mobilePhone")).into(TXT_MOBILE_PHONE),
        Enter.theValue(personalInformation.get("alias")).into(TXT_ALIAS),
        Click.on(BTN_REGISTER));
  }
}
